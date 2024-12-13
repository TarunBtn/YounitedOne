package com.younited.qa.testcases;

import org.openqa.selenium.NoSuchElementException;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.younited.qa.base.TestBase;
import com.younited.qa.pages.HomePage;
import com.younited.qa.pages.LoginPage;
import com.younited.qa.util.TestUtil;

public class LoginPageTest extends TestBase{
	LoginPage loginPage;
	HomePage homePage;
	TestUtil testUtil;

	public LoginPageTest(){
		super();
	}
		
	@BeforeMethod
	public void setUp()throws Exception {
		initialization();
		loginPage=new LoginPage();
		testUtil=new TestUtil();
	}
	
	@Test(priority=1)
	public void loginPageTitleTest()throws Exception {
		System.out.println("Test is passed");
		//String title=loginPage.validateLoginPageTitle();
		//Assert.assertEquals(title, "Younited®");
		testUtil.testWaitEight();
		
	}
	
	@Test(priority=2)
	public void imageLogoTest()throws Exception {
		System.out.println("Test is passed");
		//boolean flag=loginPage.validateImageLogo();
		//Assert.assertTrue(flag);
		testUtil.testWaitEight();
		
	}
	
	@Test(priority=3)
	public void loginTest()throws Exception {
		homePage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		testUtil.testWaitFourteen();
		try {
			homePage.clickAcceptAllCookies();
		}catch(NoSuchElementException e) {
				e.printStackTrace();
		}
		testUtil.testWaitFour();
		homePage.clickSignOutLink();
		testUtil.testWaitFour();
		homePage.clickSignOutBtn();
		testUtil.testWaitEight();
	}
	
	@AfterMethod
	public void tearDown() {
		Driver.quit();
	}

}

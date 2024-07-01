package com.younited.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.younited.qa.base.TestBase;
import com.younited.qa.pages.HomePage;
import com.younited.qa.pages.LoginPage;
import com.younited.qa.pages.ManageProfilePage;
import com.younited.qa.util.TestUtil;

public class ManageProfilePageTest extends TestBase{
	
	LoginPage loginPage;
	HomePage homePage;
	TestUtil testUtil;
	ManageProfilePage manageProfilePage;
	
	public ManageProfilePageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp()throws Exception {
		initialization();
		loginPage=new LoginPage();
		manageProfilePage=new ManageProfilePage();
		testUtil=new TestUtil();
		homePage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		testUtil.testWaitFourteen();
		homePage.clickUserLogo();
		testUtil.testWaitFour();
		homePage.clickManageProfileLink();
		testUtil.testWaitEight();
		
		
	}
	
	@Test
	public void test() {
		manageProfilePage.clickEditYourProfileLink();
	}
	
	@AfterMethod
	public void tearDown() {
		Driver.quit();
	}

}

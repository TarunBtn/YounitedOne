package com.younited.qa.testcases;

import org.openqa.selenium.NoSuchElementException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.younited.qa.base.TestBase;
import com.younited.qa.pages.HomePage;
import com.younited.qa.pages.HomePageFree;
import com.younited.qa.pages.LoginPage;
import com.younited.qa.pages.MyReactionsPage;
import com.younited.qa.util.TestUtil;

public class MyReactionsPageTest extends TestBase{
	
	LoginPage loginPage;
	HomePage homePage;
	MyReactionsPage myReactionsPage;
	TestUtil testUtil;
	
	public MyReactionsPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp()throws Exception {
		initialization();
		loginPage=new LoginPage();
		myReactionsPage=new MyReactionsPage();
		testUtil=new TestUtil();
		homePage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		testUtil.testWaitFourteen();
		try {
			homePage.clickAcceptAllCookies();
		}catch(NoSuchElementException e) {
				e.printStackTrace();
		}
		testUtil.testWaitFour();
		homePage.clickUserLogo();
		testUtil.testWaitFour();
		homePage.clickMyReactionsTab();
		testUtil.testWaitFourteen();
		
		
	}
	
	@Test
	public void test()throws Exception {
		//myReactionsPage.clickMyReactionsPageLogo();
		//testUtil.testWaitFour();
		myReactionsPage.clickCompanyDropDown();
		testUtil.testWaitFour();
		myReactionsPage.selectCompany();
		testUtil.testWaitFour();
		myReactionsPage.clickRoleDropDown();
		testUtil.testWaitFour();
		myReactionsPage.selectRole();
		testUtil.testWaitEight();
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

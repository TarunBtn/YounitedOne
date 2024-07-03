package com.younited.qa.testcases;

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
		homePage.clickUserLogo();
		testUtil.testWaitTwo();
		homePage.clickMyReactionsLink();
		testUtil.testWaitEight();
		
		
	}
	
	@Test
	public void test()throws Exception {
		myReactionsPage.clickMyReactionsPageLogo();
		testUtil.testWaitTwo();
		myReactionsPage.clickCompanyDropDown();
		testUtil.testWaitTwo();
		myReactionsPage.selectCompany();
		testUtil.testWaitFour();
		myReactionsPage.clickRoleDropDown();
		testUtil.testWaitTwo();
		myReactionsPage.selectRole();
		testUtil.testWaitEight();
		
	}
	
	@AfterMethod
	public void tearDown() {
		//Driver.quit();
	}

}

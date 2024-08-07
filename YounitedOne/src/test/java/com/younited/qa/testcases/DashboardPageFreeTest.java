package com.younited.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.younited.qa.base.TestBase;
import com.younited.qa.pages.HomePage;
import com.younited.qa.pages.LoginPage;
import com.younited.qa.util.TestUtil;

public class DashboardPageFreeTest extends TestBase{
	
	LoginPage loginPage;
	HomePage homePage;
	TestUtil testUtil;
	
	public DashboardPageFreeTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp()throws Exception {
		initialization();
		loginPage=new LoginPage();
		testUtil=new TestUtil();
		homePage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		testUtil.testWaitFourteen();	
	}
	
	@Test
	public void test()throws Exception {
		System.out.println("Test is passed");
		testUtil.testWaitTwo();
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

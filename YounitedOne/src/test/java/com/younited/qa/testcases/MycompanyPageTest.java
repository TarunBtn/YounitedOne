package com.younited.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.younited.qa.base.TestBase;
import com.younited.qa.pages.HomePage;
import com.younited.qa.pages.LoginPage;
import com.younited.qa.pages.MycompanyPage;
import com.younited.qa.util.TestUtil;

public class MycompanyPageTest extends TestBase{
	
	LoginPage loginPage;
	HomePage homePage;
	MycompanyPage myCompanyPage;
	TestUtil testUtil;
	
	
	public MycompanyPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp()throws Exception {
		initialization();
		loginPage=new LoginPage();
		myCompanyPage=new MycompanyPage();
		testUtil=new TestUtil();
		homePage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		testUtil.testWaitFourteen();
		homePage.clickUserLogo();
		testUtil.testWaitFour();
		homePage.clickMycompanyTab();
		testUtil.testWaitEight();
		
	}
	
	@Test
	public void test()throws Exception {
		myCompanyPage.clickLocaties();
		testUtil.testWaitFour();
		homePage.clickSignOutLink();
		testUtil.testWaitFour();
		homePage.clickSignOutBtn();
		testUtil.testWaitFour();
		
	}
	
	@AfterMethod
	public void tearDown() {
		Driver.quit();
	}

}

package com.younited.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.younited.qa.base.TestBase;
import com.younited.qa.pages.HomePage;
import com.younited.qa.pages.LoginPage;
import com.younited.qa.pages.MycompanyLocatiesPage;
import com.younited.qa.pages.MycompanyPage;
import com.younited.qa.util.TestUtil;

public class MycompanyLocatiesPageTest extends TestBase{
	
	LoginPage loginPage;
	HomePage homePage;
	MycompanyPage myCompanyPage;
	MycompanyLocatiesPage myCompanyLocatiesPage;
	TestUtil testUtil;
	
	public MycompanyLocatiesPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp()throws Exception {
		initialization();
		loginPage=new LoginPage();
		myCompanyPage=new MycompanyPage();
		myCompanyLocatiesPage=new MycompanyLocatiesPage();
		testUtil=new TestUtil();
		homePage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		testUtil.testWaitFourteen();
		homePage.clickUserLogo();
		testUtil.testWaitFour();
		homePage.clickMycompanyTab();
		testUtil.testWaitEight();
		myCompanyPage.clickLocaties();
		testUtil.testWaitEight();
	}
	
	@Test
	public void test() throws Exception{
		myCompanyLocatiesPage.clickCompanyDetails();
		testUtil.testWaitFour();
		testUtil.scrollDown();
		testUtil.testWaitTwo();
		testUtil.scrollDown();
		testUtil.testWaitTwo();
		testUtil.scrollUp();
		testUtil.testWaitTwo();
		testUtil.scrollUp();
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

package com.younited.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.younited.qa.base.TestBase;
import com.younited.qa.pages.HomePageAdmin;
import com.younited.qa.pages.LoginPage;
import com.younited.qa.pages.UlogoDeleteRequestsPage;
import com.younited.qa.util.TestUtil;

public class UlogoDeleteRequestsPageTest extends TestBase{
	
	LoginPage loginPage;
	HomePageAdmin homePageAdmin;
	UlogoDeleteRequestsPage ulogoDeleteRequestsPage;
	TestUtil testUtil;
	
	public UlogoDeleteRequestsPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp()throws Exception {
		initialization();
		loginPage=new LoginPage();
		ulogoDeleteRequestsPage=new UlogoDeleteRequestsPage();
		testUtil=new TestUtil();
		homePageAdmin=loginPage.loginHomePageAdmin(prop.getProperty("usernametwo"), prop.getProperty("passwordtwo"));
		testUtil.testWaitFourteen();
		homePageAdmin.clickDeleteRequestsTab();
		testUtil.testWaitEight();
		
	}
	
	@Test
	public void test()throws Exception {
		ulogoDeleteRequestsPage.enterSearchRequest("Ajayone");
		testUtil.testWaitFour();
		ulogoDeleteRequestsPage.clickResetBtn();
		testUtil.testWaitFour();
		homePageAdmin.clickSignOutLink();
		testUtil.testWaitFour();
		homePageAdmin.clickSignOutBtn();
		testUtil.testWaitEight();
		
	}
	
	@AfterMethod
	public void tearDown() {
		Driver.quit();
	}

}

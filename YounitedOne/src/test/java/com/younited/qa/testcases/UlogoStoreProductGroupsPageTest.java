package com.younited.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.younited.qa.base.TestBase;
import com.younited.qa.pages.HomePageAdmin;
import com.younited.qa.pages.LoginPage;
import com.younited.qa.pages.UlogoStoreProductGroupsPage;
import com.younited.qa.util.TestUtil;

public class UlogoStoreProductGroupsPageTest extends TestBase{
	
	LoginPage loginPage;
	HomePageAdmin homePageAdmin;
	UlogoStoreProductGroupsPage uLogoStoreProductGroupsPage;
	TestUtil testUtil;
	
	public UlogoStoreProductGroupsPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp()throws Exception {
		initialization();
		loginPage=new LoginPage();
		uLogoStoreProductGroupsPage=new UlogoStoreProductGroupsPage();
		testUtil=new TestUtil();
		homePageAdmin=loginPage.loginHomePageAdmin(prop.getProperty("usernametwo"), prop.getProperty("passwordtwo"));
		testUtil.testWaitFourteen();
		homePageAdmin.clickUserLogo();
		testUtil.testWaitFour();
		homePageAdmin.clickStoreProductsTab();
		testUtil.testWaitEight();
		
	}
	
	@Test
	public void test()throws Exception {
		uLogoStoreProductGroupsPage.clickStoreProductsPageLogo();
		testUtil.testWaitTwo();
		uLogoStoreProductGroupsPage.clickSearchProductGroup();
		testUtil.testWaitTwo();
		uLogoStoreProductGroupsPage.enterSearchProductGroup("TestFour");
		testUtil.testWaitFour();
		uLogoStoreProductGroupsPage.clickResetBtn();
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

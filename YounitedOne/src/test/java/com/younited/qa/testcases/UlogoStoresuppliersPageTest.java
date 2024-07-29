package com.younited.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.younited.qa.base.TestBase;
import com.younited.qa.pages.HomePageAdmin;
import com.younited.qa.pages.LoginPage;
import com.younited.qa.pages.UlogoStoresuppliersPage;
import com.younited.qa.util.TestUtil;

public class UlogoStoresuppliersPageTest extends TestBase{
	
	LoginPage loginPage;
	HomePageAdmin homePageAdmin;
	UlogoStoresuppliersPage uLogoStoresuppliersPage;
	TestUtil testUtil;
	
	public UlogoStoresuppliersPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp()throws Exception {
		initialization();
		loginPage=new LoginPage();
		uLogoStoresuppliersPage=new UlogoStoresuppliersPage();
		testUtil=new TestUtil();
		homePageAdmin=loginPage.loginHomePageAdmin(prop.getProperty("usernametwo"), prop.getProperty("passwordtwo"));
		testUtil.testWaitFourteen();
		homePageAdmin.clickUserLogo();
		testUtil.testWaitFour();
		homePageAdmin.clickStoreSuppliersTab();
		testUtil.testWaitEight();
			
	}
	
	@Test
	public void test()throws Exception {
		uLogoStoresuppliersPage.clickAddSupplierBtn();
		testUtil.testWaitFour();
		uLogoStoresuppliersPage.enterName("TestFour");
		testUtil.testWaitTwo();
		uLogoStoresuppliersPage.enterEmailAddress("testfour@test.com");
		testUtil.testWaitTwo();
		testUtil.scrollDown();
		testUtil.testWaitTwo();
		uLogoStoresuppliersPage.enterGeneralUrl("https://testfour.co.in");
		testUtil.testWaitTwo();
		uLogoStoresuppliersPage.clickSaveBtn();
		testUtil.testWaitFour();
		uLogoStoresuppliersPage.clickSearchSupplier();
		testUtil.testWaitTwo();
		uLogoStoresuppliersPage.enterSearchSupplier("TestFour");
		testUtil.testWaitFour();
		uLogoStoresuppliersPage.clickResetBtn();
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

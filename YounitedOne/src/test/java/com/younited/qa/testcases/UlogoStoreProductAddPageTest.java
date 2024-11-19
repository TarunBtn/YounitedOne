package com.younited.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.younited.qa.base.TestBase;
import com.younited.qa.pages.HomePageAdmin;
import com.younited.qa.pages.LoginPage;
import com.younited.qa.pages.UlogoStoreProductAddPage;
import com.younited.qa.pages.UlogoStoreProductGroupsPage;
import com.younited.qa.util.TestUtil;

public class UlogoStoreProductAddPageTest extends TestBase{
	
	LoginPage loginPage;
	HomePageAdmin homePageAdmin;
	UlogoStoreProductGroupsPage uLogoStoreProductGroupsPage;
	UlogoStoreProductAddPage uLogoStoreProductAddPage;
	TestUtil testUtil;
	
	public UlogoStoreProductAddPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp()throws Exception {
		initialization();
		loginPage=new LoginPage();
		uLogoStoreProductGroupsPage=new UlogoStoreProductGroupsPage();
		uLogoStoreProductAddPage=new UlogoStoreProductAddPage();
		testUtil=new TestUtil();
		homePageAdmin=loginPage.loginHomePageAdmin(prop.getProperty("usernametwo"), prop.getProperty("passwordtwo"));
		testUtil.testWaitFourteen();
		homePageAdmin.clickUserLogo();
		testUtil.testWaitFour();
		homePageAdmin.clickStoreProductsTab();
		testUtil.testWaitFour();
		uLogoStoreProductGroupsPage.clickAddNewProduct();
		testUtil.testWaitFour();
	}
	
	@Test
	public void test()throws Exception {
		uLogoStoreProductAddPage.enterName("TestFour");
		testUtil.testWaitTwo();
		uLogoStoreProductAddPage.enterSubTitle("TestTitle");
		testUtil.testWaitTwo();
		testUtil.scrollDown();
		testUtil.testWaitTwo();
		uLogoStoreProductAddPage.clickSaveBtn();
		testUtil.testWaitEight();
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

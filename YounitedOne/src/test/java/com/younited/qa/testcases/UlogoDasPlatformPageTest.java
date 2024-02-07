package com.younited.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.younited.qa.base.TestBase;
import com.younited.qa.pages.HomePageAdmin;
import com.younited.qa.pages.LoginPage;
import com.younited.qa.pages.UlogoDasPlatformPage;
import com.younited.qa.util.TestUtil;

public class UlogoDasPlatformPageTest extends TestBase{
	
	LoginPage loginPage;
	HomePageAdmin homePageAdmin;
	UlogoDasPlatformPage uLogoDasPlatformPage;
	TestUtil testUtil;
	
	public UlogoDasPlatformPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp()throws Exception {
		initialization();
		loginPage=new LoginPage();
		uLogoDasPlatformPage=new UlogoDasPlatformPage();
		testUtil=new TestUtil();
		homePageAdmin=loginPage.loginHomePageAdmin(prop.getProperty("usernametwo"), prop.getProperty("passwordtwo"));
		testUtil.testWaitFourteen();
		homePageAdmin.clickAcceptAllCookies();
		testUtil.testWaitEleven();
		homePageAdmin.clickUserLogo();
		testUtil.testWaitFour();
		homePageAdmin.clickDasPlatformTab();
		testUtil.testWaitFourteen();
			
	}
	
	@Test
	public void uLogoDasPlatformPage()throws Exception {
		uLogoDasPlatformPage.clickAddNewDasPlatform();
		testUtil.testWaitFour();
		uLogoDasPlatformPage.enterName("Green garden");
		testUtil.testWaitTwo();
		uLogoDasPlatformPage.enterOrder("15");
		testUtil.testWaitTwo();
		uLogoDasPlatformPage.clickCancel();
		testUtil.testWaitFour();
		uLogoDasPlatformPage.enterValueSearchByName("Green");
		testUtil.testWaitFour();
		uLogoDasPlatformPage.clickResetSearchByName();
		testUtil.testWaitFour();
		
	}
	
	@AfterMethod
	public void tearDown() {
		Driver.quit();
	}

}

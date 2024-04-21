package com.younited.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.younited.qa.base.TestBase;
import com.younited.qa.pages.HomePageAdmin;
import com.younited.qa.pages.LoginPage;
import com.younited.qa.pages.UlogoDasGroupsPage;
import com.younited.qa.util.TestUtil;

public class UlogoDasGroupsPageTest extends TestBase{
	
	LoginPage loginPage;
	HomePageAdmin homePageAdmin;
	UlogoDasGroupsPage uLogoDasGroupPage;
	TestUtil testUtil;
	
	public UlogoDasGroupsPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp()throws Exception {
		initialization();
		loginPage=new LoginPage();
		uLogoDasGroupPage=new UlogoDasGroupsPage();
		testUtil=new TestUtil();
		homePageAdmin=loginPage.loginHomePageAdmin(prop.getProperty("usernametwo"), prop.getProperty("passwordtwo"));
		testUtil.testWaitFourteen();
		//homePageAdmin.clickAcceptAllCookies();
		//testUtil.testWaitEleven();
		homePageAdmin.clickUserLogo();
		testUtil.testWaitFour();
		homePageAdmin.clickDasGroupsTab();
		testUtil.testWaitFour();
		
	}
	
	@Test
	public void UlogoDasGroupPage()throws Exception {	
		uLogoDasGroupPage.clickAddNewDasGroup();
		testUtil.testWaitFour();
		uLogoDasGroupPage.clickDasPlatformDropDown();
		testUtil.testWaitTwo();
		uLogoDasGroupPage.selectDasPlatformDropDown();
		testUtil.testWaitTwo();
		uLogoDasGroupPage.enterNameDasGroupPage("Green Group");
		testUtil.testWaitTwo();
		uLogoDasGroupPage.enterOrderDasGroupPage("15");
		testUtil.testWaitFour();
		//testUtil.scrollDown();
		//testUtil.testWaitTwo();
		uLogoDasGroupPage.clickCancelBtnDasGroupPage();
		testUtil.testWaitTwo();
		uLogoDasGroupPage.enterValueSearchGroup("Green");
		testUtil.testWaitFour();
		uLogoDasGroupPage.clickResetDasGroup();
		testUtil.testWaitFour();
		
	}
	
	@AfterMethod
	public void tearDown(){
		Driver.quit();
	}

}

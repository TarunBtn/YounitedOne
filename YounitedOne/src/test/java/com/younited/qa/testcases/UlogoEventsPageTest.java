package com.younited.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.younited.qa.base.TestBase;
import com.younited.qa.pages.HomePageAdmin;
import com.younited.qa.pages.LoginPage;
import com.younited.qa.pages.UlogoEventsPage;
import com.younited.qa.util.TestUtil;

public class UlogoEventsPageTest extends TestBase{
	
	LoginPage loginPage;
	HomePageAdmin homePageAdmin;
	UlogoEventsPage uLogoEventsPage;
	TestUtil testUtil;
	
	public UlogoEventsPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp()throws Exception {
		initialization();
		loginPage=new LoginPage();
		uLogoEventsPage=new UlogoEventsPage();
		testUtil=new TestUtil();
		homePageAdmin=loginPage.loginHomePageAdmin(prop.getProperty("usernametwo"), prop.getProperty("passwordtwo"));
		testUtil.testWaitFourteen();
		homePageAdmin.clickUserLogo();
		testUtil.testWaitFour();
		homePageAdmin.clickEventsTab();
		testUtil.testWaitEight();
		
	}
	
	@Test
	public void test()throws Exception {
		uLogoEventsPage.clickEventPageLogo();
		testUtil.testWaitFour();
		uLogoEventsPage.enterSearchEvent("TestFour");
		testUtil.testWaitFour();
		uLogoEventsPage.clickResetBtn();
		testUtil.testWaitFour();
		uLogoEventsPage.clickAddNewEvent();
		testUtil.testWaitFour();
		uLogoEventsPage.enterTitle("TestFour");
		testUtil.testWaitTwo();
		uLogoEventsPage.clickDateField();
		testUtil.testWaitTwo();
		uLogoEventsPage.selectDate();
		testUtil.testWaitFour();
		testUtil.scrollDown();
		testUtil.testWaitFour();
		uLogoEventsPage.clickSaveBtn();
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

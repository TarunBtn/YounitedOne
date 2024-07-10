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
		homePageAdmin=loginPage.loginHomePageAdmin(prop.getProperty("username"), prop.getProperty("password"));
		testUtil.testWaitFourteen();
		homePageAdmin.clickUserLogo();
		testUtil.testWaitFour();
		homePageAdmin.clickEventsTab();
		testUtil.testWaitEight();
		
	}
	
	@Test
	public void test()throws Exception {
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
		testUtil.testWaitTwo();
		uLogoEventsPage.clickSaveBtn();
		testUtil.testWaitEight();
	}
	
	@AfterMethod
	public void tearDown() {
		Driver.quit();
	}
	
	

}

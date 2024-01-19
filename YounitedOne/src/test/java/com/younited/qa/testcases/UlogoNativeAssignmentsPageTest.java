package com.younited.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.younited.qa.base.TestBase;
import com.younited.qa.pages.HomePageAdmin;
import com.younited.qa.pages.LoginPage;
import com.younited.qa.pages.UlogoNativeAssignmentsPage;
import com.younited.qa.util.TestUtil;

public class UlogoNativeAssignmentsPageTest extends TestBase{
	
	LoginPage loginPage;
	HomePageAdmin homePageAdmin;
	UlogoNativeAssignmentsPage uLogoNativeAssignmentsPage;
	TestUtil testUtil;
	
	public UlogoNativeAssignmentsPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp()throws Exception {
		initialization();
		loginPage=new LoginPage();
		uLogoNativeAssignmentsPage=new UlogoNativeAssignmentsPage();
		testUtil=new TestUtil();
		homePageAdmin=loginPage.loginHomePageAdmin(prop.getProperty("usernametwo"), prop.getProperty("passwordtwo"));
		testUtil.testWaitEleven();
		homePageAdmin.clickAcceptAllCookies();
		testUtil.testWaitEleven();
		homePageAdmin.clickUserLogo();
		testUtil.testWaitTwo();
		homePageAdmin.clickNativeAssignmentsTab();
		testUtil.testWaitEight();
		
	}
	
	@Test
	public void UlogoNativeAssignmentsPage()throws Exception {
		uLogoNativeAssignmentsPage.enterSearchAssignment("QA Engineer");
		testUtil.testWaitEleven();
		uLogoNativeAssignmentsPage.clickResetSearchAssignment();
		testUtil.testWaitEight();
					
	}
	
	@AfterMethod
	public void tearDown() {
		//Driver.quit();
	}

}

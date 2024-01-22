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
		/*uLogoNativeAssignmentsPage.enterSearchAssignment("QA Engineer");
		testUtil.testWaitEleven();
		uLogoNativeAssignmentsPage.clickResetSearchAssignment();
		testUtil.testWaitEight();*/
		//Hourly Rate
		uLogoNativeAssignmentsPage.clickHourlyRate();
		testUtil.testWaitTwo();
		uLogoNativeAssignmentsPage.selectHourlyRate();
		testUtil.testWaitFour();
		uLogoNativeAssignmentsPage.clickApplyFilterHourlyRate();
		testUtil.testWaitEight();
		uLogoNativeAssignmentsPage.clickHourlyRate();
		testUtil.testWaitTwo();
		uLogoNativeAssignmentsPage.clickClearFilterHourlyRate();
		testUtil.testWaitEight();
		uLogoNativeAssignmentsPage.clickCancelHourlyRate();
		testUtil.testWaitTwo();
		//NumberOfEntrepreneurs
		uLogoNativeAssignmentsPage.clickNumberOfEntrepreneurs();
		testUtil.testWaitTwo();
		uLogoNativeAssignmentsPage.selectNumberOfEntrepreneurs();
		testUtil.testWaitFour();
		/*uLogoNativeAssignmentsPage.clickNumberOfEntrepreneurs();
		testUtil.testWaitTwo();
		uLogoNativeAssignmentsPage.clickNumberOfEntrepreneurs();
		testUtil.testWaitTwo();
		uLogoNativeAssignmentsPage.selectNumberOfEntrepreneurs();
		testUtil.testWaitTwo();
		uLogoNativeAssignmentsPage.clickNumberOfEntrepreneurs();
		testUtil.testWaitTwo();
		uLogoNativeAssignmentsPage.resetNumberOfEntrepreneurs();
		testUtil.testWaitFour();*/
		
					
	}
	
	@AfterMethod
	public void tearDown() {
		//Driver.quit();
	}

}

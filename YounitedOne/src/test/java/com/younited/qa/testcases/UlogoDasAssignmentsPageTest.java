package com.younited.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.younited.qa.base.TestBase;
import com.younited.qa.pages.HomePageAdmin;
import com.younited.qa.pages.LoginPage;
import com.younited.qa.util.TestUtil;
import com.younited.qa.pages.UlogoDasAssignmentsPage;

public class UlogoDasAssignmentsPageTest extends TestBase{
	
	LoginPage loginPage;
	HomePageAdmin homePageAdmin;
	TestUtil testUtil;
	UlogoDasAssignmentsPage uLogoDasAssignmentsPage;
	
	public UlogoDasAssignmentsPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp()throws Exception {
		initialization();
		loginPage=new LoginPage();
		testUtil=new TestUtil();
		uLogoDasAssignmentsPage=new UlogoDasAssignmentsPage();
		homePageAdmin=loginPage.loginHomePageAdmin(prop.getProperty("usernametwo"), prop.getProperty("passwordtwo"));
		testUtil.testWaitFourteen();
		//homePageAdmin.clickAcceptAllCookies();
		//testUtil.testWaitEleven();
		homePageAdmin.clickUserLogo();
		testUtil.testWaitFour();
		homePageAdmin.clickDasAssignmentOverviewTab();
		testUtil.testWaitFourteen();
		//testUtil.scrollDown();
		//testUtil.testWaitFour();
		
	}
	
	@Test
	public void UlogoDasAssignmentsPage()throws Exception{
		uLogoDasAssignmentsPage.enterValueSearchByAssignment("QA");
		testUtil.testWaitEight();
		testUtil.scrollDown();
		testUtil.testWaitTwo();
		testUtil.scrollUp();
		testUtil.testWaitTwo();
		uLogoDasAssignmentsPage.clickResetSearchByAssignment();
		testUtil.testWaitEight();
		uLogoDasAssignmentsPage.enterValueSearchByLocation("nl");
		testUtil.testWaitEight();
		testUtil.scrollDown();
		testUtil.testWaitTwo();
		testUtil.scrollUp();
		testUtil.testWaitTwo();
		uLogoDasAssignmentsPage.clickResetSearchByLocation();
		testUtil.testWaitEight();
		//testUtil.scrollDown();
		//testUtil.testWaitTwo();
		//HourlyRate
		uLogoDasAssignmentsPage.clickHourlyRateDropDown();
		testUtil.testWaitFour();
		uLogoDasAssignmentsPage.selectHourlyRate();
		testUtil.testWaitFour();
		uLogoDasAssignmentsPage.clickApplyFilterHourlyRate();
		testUtil.testWaitFour();
		uLogoDasAssignmentsPage.clickHourlyRateDropDown();
		testUtil.testWaitFour();
		testUtil.scrollDown();
		testUtil.testWaitTwo();
		testUtil.scrollUp();
		testUtil.testWaitTwo();
		uLogoDasAssignmentsPage.clickResetHourlyRate();
		testUtil.testWaitFour();
		uLogoDasAssignmentsPage.clickCancelHourlyRate();
		testUtil.testWaitFour();
		//Number of entrepreneurs
		uLogoDasAssignmentsPage.clickNumberOfEntrePreneurs();
		testUtil.testWaitFour();
		uLogoDasAssignmentsPage.selectNumberOfEntrepreneurs();
		testUtil.testWaitFour();
		uLogoDasAssignmentsPage.clickNumberOfEntrePreneurs();
		testUtil.testWaitFour();
		//uLogoDasAssignmentsPage.clickNumberOfEntrePreneurs();
		//testUtil.testWaitTwo();
		uLogoDasAssignmentsPage.resetNumberOfEntrepreneurs();
		testUtil.testWaitFour();
		//Archive
		uLogoDasAssignmentsPage.clickArchive();
		testUtil.testWaitFour();
		uLogoDasAssignmentsPage.clickArchive();
		testUtil.testWaitEight();
		//Sorting
		uLogoDasAssignmentsPage.clickSorting();
		testUtil.testWaitFour();
		uLogoDasAssignmentsPage.selectClosingDateOld();
		testUtil.testWaitFour();
		uLogoDasAssignmentsPage.selectHourlyRateDesc();
		testUtil.testWaitFour();
		uLogoDasAssignmentsPage.selectHourlyRateRising();
		testUtil.testWaitFour();
		uLogoDasAssignmentsPage.selectNumberRequestedDesc();
		testUtil.testWaitFour();
		uLogoDasAssignmentsPage.selectNumberRequestedRising();
		testUtil.testWaitFour();
		uLogoDasAssignmentsPage.selectClosingDateNew();
		testUtil.testWaitFour();
		uLogoDasAssignmentsPage.clickSorting();
		testUtil.testWaitFour();
		homePageAdmin.clickSignOutLink();
	  	testUtil.testWaitFour();
	  	homePageAdmin.clickSignOutBtn();
	  	testUtil.testWaitEight();
		
	}
	
	@AfterMethod
	public void tearDown(){
		Driver.quit();
	}

}

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
		testUtil.testWaitEight();
		homePageAdmin.clickAcceptAllCookies();
		testUtil.testWaitEleven();
		//homePageAdmin.clickUserLogo();
		//testUtil.testWaitTwo();
		homePageAdmin.clickDasAssignmentOverviewTab();
		testUtil.testWaitFourteen();
		testUtil.scrollDown();
		testUtil.testWaitFour();
		
	}
	
	@Test
	public void UlogoDasAssignmentsPage()throws Exception{
		uLogoDasAssignmentsPage.enterValueSearchByAssignment("QA");
		testUtil.testWaitEight();
		uLogoDasAssignmentsPage.clickResetSearchByAssignment();
		testUtil.testWaitEight();
		uLogoDasAssignmentsPage.enterValueSearchByLocation("nl");
		testUtil.testWaitEight();
		uLogoDasAssignmentsPage.clickResetSearchByLocation();
		testUtil.testWaitEight();
	}
	
	@AfterMethod
	public void tearDown(){
		//Driver.quit();
	}

}

package com.younited.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.younited.qa.base.TestBase;
import com.younited.qa.pages.AssignmentsPageAdmin;
import com.younited.qa.pages.AssignmentsPageFree;
import com.younited.qa.pages.HomePageAdmin;
import com.younited.qa.pages.LeadsAssignmentPageAdmin;
import com.younited.qa.pages.LoginPage;
import com.younited.qa.util.TestUtil;

public class LeadsAssignmentPageAdminTest extends TestBase{
	
	LoginPage loginPage;
	HomePageAdmin homePageAdmin;
	LeadsAssignmentPageAdmin leadsAssignmentPageAdmin;
	AssignmentsPageFree assignmentsPageFree;
	TestUtil testUtil;
	
	public LeadsAssignmentPageAdminTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp()throws Exception {
		initialization();
		loginPage=new LoginPage();
		assignmentsPageFree=new AssignmentsPageFree();
		leadsAssignmentPageAdmin=new LeadsAssignmentPageAdmin();
		testUtil=new TestUtil();
		homePageAdmin=loginPage.loginHomePageAdmin(prop.getProperty("usernametwo"), prop.getProperty("passwordtwo"));
		testUtil.testWaitFourteen();
		homePageAdmin.clickAssignmentsTab();
		testUtil.testWaitFourteen();
		assignmentsPageFree.clickAssignmentBox();
		testUtil.testWaitFourteen();
		testUtil.switchToWindow02();
		testUtil.testWaitEight();
			
	}
	
	@Test
	public void test()throws Exception {
		leadsAssignmentPageAdmin.clickAddLead();
		testUtil.testWaitFourteen();
		testUtil.switchToWindow03();
		testUtil.testWaitFourteen();
		leadsAssignmentPageAdmin.clickAddNewLead();
		testUtil.testWaitEight();
		leadsAssignmentPageAdmin.enterFirstName("Ajay");
		testUtil.testWaitFour();
		leadsAssignmentPageAdmin.enterMiddleName("B");
		testUtil.testWaitFour();
		leadsAssignmentPageAdmin.enterLastName("Patel");
		testUtil.testWaitFour();
		leadsAssignmentPageAdmin.enterEmailID("tarun.butani+Leade@nowonlinetech.com");
		testUtil.testWaitFour();
		leadsAssignmentPageAdmin.clickOriginDropDown();
		testUtil.testWaitFour();
		leadsAssignmentPageAdmin.selectOrigin();
		testUtil.testWaitFour();
		leadsAssignmentPageAdmin.clickSaveBtn();
		testUtil.testWaitFourteen();
		leadsAssignmentPageAdmin.clickCloseSign();
		testUtil.testWaitEight();
		//leadsAssignmentPageAdmin.clickCancelBtn();
	}
	
	@AfterMethod
	public void tearDown() {
		Driver.quit();
	}
	

}

package com.younited.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.younited.qa.base.TestBase;
import com.younited.qa.pages.HomePageAdmin;
import com.younited.qa.pages.LeadsPageAdmin;
import com.younited.qa.pages.LoginPage;
import com.younited.qa.util.TestUtil;

public class LeadsPageAdminTest extends TestBase{
	
	LoginPage loginPage;
	HomePageAdmin homePageAdmin;
	LeadsPageAdmin leadsPageAdmin;
	TestUtil testUtil;
	
	public LeadsPageAdminTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp()throws Exception {
		initialization();
		loginPage=new LoginPage();
		leadsPageAdmin=new LeadsPageAdmin();
		testUtil=new TestUtil();
		homePageAdmin=loginPage.loginHomePageAdmin(prop.getProperty("usernametwo"), prop.getProperty("passwordtwo"));
		testUtil.testWaitFourteen();
		testUtil.scrollDown();
		testUtil.testWaitEight();
		homePageAdmin.clickLeadTab();
		testUtil.testWaitFourteen();
		
	}
	
	@Test
	public void test()throws Exception {
		leadsPageAdmin.clickRoleDropDown();
		testUtil.testWaitFour();
		leadsPageAdmin.selectRole();
		testUtil.testWaitEight();
		leadsPageAdmin.enterLead("Test");
		testUtil.testWaitFour();
		leadsPageAdmin.clickResetBtn();
		testUtil.testWaitEight();
		leadsPageAdmin.clickNewLeadAdd();
		testUtil.testWaitFour();
		leadsPageAdmin.clickRoleDropDownAddLead();
		testUtil.testWaitFour();
		leadsPageAdmin.selectRoleDropDownAddLead();
		testUtil.testWaitFour();
		leadsPageAdmin.enterFirstName("Ajay");
		testUtil.testWaitTwo();
		leadsPageAdmin.enterMiddleName("B");
		testUtil.testWaitTwo();
		leadsPageAdmin.enterLastName("Patel");
		testUtil.testWaitTwo();
		leadsPageAdmin.emailAddress("tarun.butani+LeadSeven@nowonlinetech.com");
		testUtil.testWaitFour();
		testUtil.scrollDown();
		testUtil.testWaitFour();
		leadsPageAdmin.clickOriginDropDown();
		testUtil.testWaitTwo();
		leadsPageAdmin.selectOrigin();
		testUtil.testWaitFour();
		leadsPageAdmin.clickOriginDropDown();
		testUtil.testWaitFour();
		leadsPageAdmin.clickSaveBtn();
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

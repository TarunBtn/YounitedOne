package com.younited.qa.testcases;

import org.openqa.selenium.NoSuchElementException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.younited.qa.base.TestBase;
import com.younited.qa.pages.AssignmentsPageAdmin;
import com.younited.qa.pages.HomePageAdmin;
import com.younited.qa.pages.LoginPage;
import com.younited.qa.util.TestUtil;

public class HomePageAdminTest extends TestBase{
	LoginPage loginPage;
	HomePageAdmin homePageAdmin;
	AssignmentsPageAdmin assignmentsPageAdmin;
	TestUtil testUtil;
	
	public HomePageAdminTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp()throws Exception {
		initialization();
		loginPage=new LoginPage();
		assignmentsPageAdmin=new AssignmentsPageAdmin();
		testUtil=new TestUtil();
		homePageAdmin=loginPage.loginHomePageAdmin(prop.getProperty("usernametwo"), prop.getProperty("passwordtwo"));
		testUtil.testWaitFourteen();
		try {
			homePageAdmin.clickAcceptAllCookies();
			testUtil.testWaitEight();
			
		}catch(NoSuchElementException e) {
			e.printStackTrace();
		}
		testUtil.testWaitEight();
		//homePageAdmin.clickAcceptAllCookies();
		//testUtil.testWaitEleven();
		//testUtil.testWaitFour();
		
	}
	
	@Test
	public void test()throws Exception {
		//testUtil.testWaitEight();
		try {
		  homePageAdmin.clickAssignmentsTab();
		  testUtil.testWaitFourteen();
		}catch(NoSuchElementException e) {
			e.printStackTrace();
		}
		testUtil.testWaitFour();
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

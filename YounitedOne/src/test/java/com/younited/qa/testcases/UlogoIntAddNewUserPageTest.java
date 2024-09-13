package com.younited.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.younited.qa.base.TestBase;
import com.younited.qa.pages.HomePageAdmin;
import com.younited.qa.pages.LoginPage;
import com.younited.qa.pages.UlogoIntAddNewUserPage;
import com.younited.qa.pages.UlogoIntermediaryPage;
import com.younited.qa.util.TestUtil;

public class UlogoIntAddNewUserPageTest extends TestBase{
	
	LoginPage loginPage;
	HomePageAdmin homePageAdmin;
	UlogoIntermediaryPage uLogoIntermediaryPage;
	UlogoIntAddNewUserPage uLogoIntAddNewUserPage;
	TestUtil testUtil;
	
	
	public UlogoIntAddNewUserPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp()throws Exception {
		initialization();
		loginPage=new LoginPage();
		uLogoIntermediaryPage=new UlogoIntermediaryPage();
		uLogoIntAddNewUserPage=new UlogoIntAddNewUserPage();
		testUtil=new TestUtil();
		homePageAdmin=loginPage.loginHomePageAdmin(prop.getProperty("usernametwo"), prop.getProperty("passwordtwo"));
		testUtil.testWaitFourteen();
		homePageAdmin.clickUserLogo();
		testUtil.testWaitFour();
		homePageAdmin.clickIntermediaryTab();
		testUtil.testWaitEight();
		uLogoIntermediaryPage.clickUserSymbol();
		testUtil.testWaitEight();
			
	}
	
	@Test
	public void test()throws Exception {
		uLogoIntAddNewUserPage.clickSearchUser();
		testUtil.testWaitFour();
		uLogoIntAddNewUserPage.enterSearchUser("Ajay");
		testUtil.testWaitEight();
		uLogoIntAddNewUserPage.cancelSearchUser();
		testUtil.testWaitEight();
		uLogoIntAddNewUserPage.clickAddUser();
		testUtil.testWaitFourteen();
		testUtil.switchToAlert(null);
		testUtil.testWaitFourteen();
		uLogoIntAddNewUserPage.clickEmailAddress();
		testUtil.testWaitFour();
		uLogoIntAddNewUserPage.enterEmailAddress("tarun.butani+bt@nowonlinetech.com");
		testUtil.testWaitTwo();
		uLogoIntAddNewUserPage.enterFirstName("Ajay");
		testUtil.testWaitTwo();
		uLogoIntAddNewUserPage.enterLastName("Patel");
		testUtil.testWaitTwo();
		uLogoIntAddNewUserPage.clickAddUser();
		testUtil.testWaitFourteen();
	}
	
	@AfterMethod
	public void tearDown() {
		//Driver.quit();
	}

}

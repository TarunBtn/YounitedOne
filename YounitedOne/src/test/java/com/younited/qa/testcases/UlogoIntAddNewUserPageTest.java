package com.younited.qa.testcases;

import org.openqa.selenium.NoSuchElementException;
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
		try {
			homePageAdmin.clickAcceptAllCookies();
		}catch(NoSuchElementException e) {
				e.printStackTrace();
		}
		testUtil.testWaitFour();
		//homePageAdmin.clickUserLogo();
		//testUtil.testWaitFour();
		homePageAdmin.clickIntermediaryTab();
		testUtil.testWaitEight();
		uLogoIntermediaryPage.clickUserSymbol();
		//testUtil.testWaitEight();
		testUtil.testWaitFour();
			
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
		//testUtil.switchToWindow02();
		//testUtil.testWaitFourteen();
		uLogoIntAddNewUserPage.clickEmailAddress();
		testUtil.testWaitFour();
		uLogoIntAddNewUserPage.enterEmailAddress("tarun.butani+ha@nowonlinetech.com");
		testUtil.testWaitEight();
		uLogoIntAddNewUserPage.selectEmailTooltip();
		testUtil.testWaitEight();
		//uLogoIntAddNewUserPage.enterFirstName("Ajay");
		//testUtil.testWaitFour();
		//uLogoIntAddNewUserPage.enterLastName("Patel");
		//testUtil.testWaitFour();
		uLogoIntAddNewUserPage.addUser();
		testUtil.testWaitFourteen();
		uLogoIntAddNewUserPage.clickCancelBtn();
		testUtil.testWaitFourteen();
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

package com.younited.qa.testcases;

import org.openqa.selenium.NoSuchElementException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.younited.qa.base.TestBase;
import com.younited.qa.pages.HomePageAdmin;
import com.younited.qa.pages.LoginPage;
import com.younited.qa.pages.UlogoAddIntermediaryPage;
import com.younited.qa.pages.UlogoIntAddNewCompanyPage;
import com.younited.qa.pages.UlogoIntermediaryPage;
import com.younited.qa.util.TestUtil;

public class UlogoIntAddNewCompanyPageTest extends TestBase{
	LoginPage loginPage;
	HomePageAdmin homePageAdmin;
	UlogoIntermediaryPage uLogoIntermediaryPage;
	UlogoAddIntermediaryPage uLogoAddIntermediaryPage;
	UlogoIntAddNewCompanyPage uLogoIntAddNewCompanyPage;
	TestUtil testUtil;
	
	public UlogoIntAddNewCompanyPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp()throws Exception {
		initialization();
		loginPage=new LoginPage();
		uLogoIntermediaryPage=new UlogoIntermediaryPage();
		uLogoAddIntermediaryPage=new UlogoAddIntermediaryPage();
		uLogoIntAddNewCompanyPage=new UlogoIntAddNewCompanyPage();
		testUtil=new TestUtil();
		homePageAdmin=loginPage.loginHomePageAdmin(prop.getProperty("usernametwo"), prop.getProperty("passwordtwo"));
		testUtil.testWaitFourteen();
		try {
			homePageAdmin.clickAcceptAllCookies();
		}catch(NoSuchElementException e) {
				e.printStackTrace();
		}
		testUtil.testWaitFour();
		homePageAdmin.clickUserLogo();
		testUtil.testWaitEight();
		homePageAdmin.clickIntermediaryTab();
		testUtil.testWaitFourteen();
		testUtil.scrollDown();
		testUtil.testWaitFour();
		uLogoIntermediaryPage.clickSubCompanySymbol();
		testUtil.testWaitEight();
		uLogoIntermediaryPage.clickAddNewCompany();
		testUtil.testWaitEight();
		
	}
	
	@Test
	public void test()throws Exception {
		uLogoAddIntermediaryPage.enterCompanyName("H&");
		testUtil.testWaitFourteen();
		uLogoAddIntermediaryPage.selectCompanyNameTooltip();
		testUtil.testWaitEight();
		testUtil.scrollDown();
		testUtil.testWaitFour();
		testUtil.scrollDown();
		testUtil.testWaitFour();
		uLogoAddIntermediaryPage.clickEmployeeDropdown();
		testUtil.testWaitFour();
		uLogoAddIntermediaryPage.selectEmployee();
		testUtil.testWaitEight();
		uLogoAddIntermediaryPage.clickEmployeeDropdown();
		testUtil.testWaitFour();
		uLogoAddIntermediaryPage.clickSectorDropDown();
		testUtil.testWaitFour();
		uLogoAddIntermediaryPage.selectSector();
		testUtil.testWaitFour();
		testUtil.scrollDown();
		testUtil.testWaitFour();
		testUtil.scrollDown();
		testUtil.testWaitFour();
		testUtil.scrollDown();
		testUtil.testWaitFour();
		//uLogoAddIntermediaryPage.clickSaveBtn();
		uLogoAddIntermediaryPage.clickCancelBtn();
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

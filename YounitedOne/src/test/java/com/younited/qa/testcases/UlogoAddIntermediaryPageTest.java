package com.younited.qa.testcases;

import org.openqa.selenium.NoSuchElementException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.younited.qa.base.TestBase;
import com.younited.qa.pages.HomePageAdmin;
import com.younited.qa.pages.LoginPage;
import com.younited.qa.pages.UlogoAddIntermediaryPage;
import com.younited.qa.pages.UlogoIntermediaryPage;
import com.younited.qa.util.TestUtil;

public class UlogoAddIntermediaryPageTest extends TestBase{	
	
	LoginPage loginPage;
	HomePageAdmin homePageAdmin;
	UlogoIntermediaryPage uLogoIntermediaryPage;
	UlogoAddIntermediaryPage uLogoAddIntermediaryPage;
	TestUtil testUtil;
	
	public UlogoAddIntermediaryPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp()throws Exception {
		initialization();
		loginPage=new LoginPage();
		uLogoIntermediaryPage=new UlogoIntermediaryPage();
		uLogoAddIntermediaryPage=new UlogoAddIntermediaryPage();
		testUtil=new TestUtil();
		homePageAdmin=loginPage.loginHomePageAdmin(prop.getProperty("usernametwo"), prop.getProperty("passwordtwo"));
		testUtil.testWaitFourteen();
		homePageAdmin.clickUserLogo();
		testUtil.testWaitEight();
		homePageAdmin.clickIntermediaryTab();
		testUtil.testWaitFourteen();
		uLogoIntermediaryPage.clickAddIntermediary();
		testUtil.testWaitEleven();
			
	}
	
	@Test
	public void test()throws Exception {
		uLogoAddIntermediaryPage.clickCompanyName();
		testUtil.testWaitFour();
		uLogoAddIntermediaryPage.enterCompanyName("B&");
		testUtil.testWaitFourteen();
		uLogoAddIntermediaryPage.selectCompanyNameTooltip();
		testUtil.testWaitEight();
		testUtil.scrollDown();
		testUtil.testWaitEight();
		uLogoAddIntermediaryPage.clickBrandLabelDropDown();
		testUtil.testWaitEight();
		//uLogoAddIntermediaryPage.explicitWait();
		try {
		    uLogoAddIntermediaryPage.selectBrandLabel();
		    testUtil.testWaitEight();
		}catch(NoSuchElementException e) {
			e.printStackTrace();
		}
		testUtil.testWaitEight();
		testUtil.scrollDown();
		testUtil.testWaitFour();
		testUtil.scrollDown();
		testUtil.testWaitFour();
		uLogoAddIntermediaryPage.clickSectorDropDown();
		testUtil.testWaitFour();
		uLogoAddIntermediaryPage.selectSector();
		testUtil.testWaitFour();
		testUtil.scrollDown();
		testUtil.testWaitFour();
		testUtil.scrollDown();
		testUtil.testWaitFour();
		uLogoAddIntermediaryPage.clickSaveBtn();
		testUtil.testWaitEight();
		homePageAdmin.clickSignOutLink();
		testUtil.testWaitFour();
		homePageAdmin.clickSignOutBtn();
		testUtil.testWaitEight();
		
	}
	
	@AfterMethod
	public void tearDown() {
		//Driver.quit();
	}

}

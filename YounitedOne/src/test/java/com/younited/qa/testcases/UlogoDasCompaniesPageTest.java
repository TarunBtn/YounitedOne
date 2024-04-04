package com.younited.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.younited.qa.base.TestBase;
import com.younited.qa.pages.HomePageAdmin;
import com.younited.qa.pages.LoginPage;
import com.younited.qa.pages.UlogoDasCompaniesPage;
import com.younited.qa.util.TestUtil;

public class UlogoDasCompaniesPageTest extends TestBase{
	
	LoginPage loginPage;
	HomePageAdmin homePageAdmin;
	UlogoDasCompaniesPage uLogoDasCompaniesPage;
	TestUtil testUtil;
	
	public UlogoDasCompaniesPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp()throws Exception {
		initialization();
		loginPage=new LoginPage();
		uLogoDasCompaniesPage=new UlogoDasCompaniesPage();
		testUtil=new TestUtil();
		homePageAdmin=loginPage.loginHomePageAdmin(prop.getProperty("usernametwo"), prop.getProperty("passwordtwo"));
		testUtil.testWaitFourteen();
		//homePageAdmin.clickAcceptAllCookies();
		//testUtil.testWaitEleven();
		homePageAdmin.clickUserLogo();
		testUtil.testWaitTwo();
		homePageAdmin.clickDasCompaniesTab();
		testUtil.testWaitFour();
			
	}
	
	@Test
	public void UlogoDasCompaniesPage()throws Exception {
		uLogoDasCompaniesPage.clickAddNewCompany();
		testUtil.testWaitFour();
		//testUtil.scrollDown();
		//testUtil.testWaitTwo();
		//uLogoDasCompaniesPage.clickDasGroupDropDown();
		//testUtil.testWaitTwo();
		//uLogoDasCompaniesPage.selectDasGroupFromDropDown();
		//testUtil.testWaitTwo();
		uLogoDasCompaniesPage.enterCompanyName("Green Company B.V.");
		testUtil.testWaitFour();
		uLogoDasCompaniesPage.selectCompanyNameToolTip();
		testUtil.testWaitFour();
		testUtil.scrollDown();
		testUtil.testWaitTwo();
		testUtil.scrollDown();
		testUtil.testWaitTwo();
		uLogoDasCompaniesPage.clickSectorDropDown();
		testUtil.testWaitTwo();
		uLogoDasCompaniesPage.selectSectorDropDown();
		testUtil.testWaitTwo();
		testUtil.scrollDown();
		testUtil.testWaitTwo();
		testUtil.scrollDown();
		testUtil.testWaitTwo();
		uLogoDasCompaniesPage.clickCancelBtn();
		testUtil.testWaitFour();
		testUtil.scrollUp();
		testUtil.testWaitTwo();
		testUtil.scrollUp();
		testUtil.testWaitTwo();
		testUtil.scrollUp();
		testUtil.testWaitTwo();
		
	}
	
	@AfterMethod
	public void tearDown() {
		Driver.quit();
	}

}

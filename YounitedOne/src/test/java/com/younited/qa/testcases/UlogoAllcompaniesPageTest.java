package com.younited.qa.testcases;

import org.openqa.selenium.NoSuchElementException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.younited.qa.base.TestBase;
import com.younited.qa.pages.HomePageAdmin;
import com.younited.qa.pages.LoginPage;
import com.younited.qa.pages.UlogoAllcompaniesPage;
import com.younited.qa.pages.UlogoMycompanyPage;
import com.younited.qa.util.TestUtil;

public class UlogoAllcompaniesPageTest extends TestBase{
	LoginPage loginPage;
	HomePageAdmin homePageAdmin;
	UlogoMycompanyPage uLogoMycompanyPage;
	UlogoAllcompaniesPage uLogoAllcompaniesPage;
	TestUtil testUtil;
	
	public UlogoAllcompaniesPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp()throws Exception{
		initialization();
		loginPage=new LoginPage();
		uLogoMycompanyPage=new UlogoMycompanyPage();
		uLogoAllcompaniesPage=new UlogoAllcompaniesPage();
		testUtil=new TestUtil();
		homePageAdmin=loginPage.loginHomePageAdmin(prop.getProperty("usernametwo"), prop.getProperty("passwordtwo"));
		testUtil.testWaitFourteen();
		try {
			homePageAdmin.clickAcceptAllCookies();
		}catch(NoSuchElementException e) {
				e.printStackTrace();
		}
		testUtil.testWaitFour();
		  //homePageAdmin.clickAcceptAllCookies();
		  //testUtil.testWaitEleven();
		homePageAdmin.clickUserLogo();
		testUtil.testWaitFour();
		homePageAdmin.clickAllCompaniesTab();
		testUtil.testWaitFourteen();
		  //homePageAdmin.moveHoverTologoImage();
		  //testUtil.testWaitFour();
		  //testUtil.scrollDown();
		  //testUtil.testWaitTwo();
								
	}
	
	@Test
	public void UlogoAllcompaniesPage()throws Exception {
		//Company verified
		uLogoAllcompaniesPage.clickVerifiedCompanyDropDown();
		testUtil.testWaitFour();
		uLogoAllcompaniesPage.selectVerifiedCompany();
		testUtil.testWaitEight();		
		uLogoAllcompaniesPage.selectNotVerifiedCompany();
		testUtil.testWaitEight();	
		uLogoAllcompaniesPage.selectAllCompany();
		testUtil.testWaitEight();
		uLogoAllcompaniesPage.clickVerifiedCompanyDropDown();
		testUtil.testWaitFour();
		//Search Deleted company
		uLogoAllcompaniesPage.clickSearchDeletedCompany();
		testUtil.testWaitFour();
		uLogoAllcompaniesPage.clickSearchDeletedCompany();
		testUtil.testWaitFour();
		uLogoAllcompaniesPage.enterValueCompanyFilter("Silver");
		testUtil.testWaitFour();
		testUtil.scrollDown();
		testUtil.testWaitTwo();
		testUtil.scrollUp();
		testUtil.testWaitFour();
		//Exact match
		  //uLogoAllcompaniesPage.clickExactMatch();
		  //testUtil.testWaitFour();
		  //uLogoAllcompaniesPage.clickExactMatch();
		  //testUtil.testWaitFour();
		uLogoAllcompaniesPage.clickResetCompanyFilter();
		testUtil.testWaitFour();
		testUtil.scrollUp();
		testUtil.testWaitFour();
		//AddNewCompany
		uLogoAllcompaniesPage.clickAddNewCompany();
		testUtil.testWaitFourteen();
		uLogoAllcompaniesPage.enterCompanyName("Cybage");
		testUtil.testWaitEight();
		uLogoAllcompaniesPage.selectCompanyTooltip();
		testUtil.testWaitFour();
		testUtil.scrollDown();
		testUtil.testWaitTwo();
		testUtil.scrollDown();
		testUtil.testWaitFour();
		uLogoAllcompaniesPage.clickEmployeeDropDown();
		testUtil.testWaitFour();
		uLogoAllcompaniesPage.selectEmployees();
		testUtil.testWaitFour();
		uLogoAllcompaniesPage.clickEmployeeDropDown();
		testUtil.testWaitFour();
		  //testUtil.scrollDown();
		  //testUtil.testWaitTwo();
		uLogoAllcompaniesPage.clickSectorDropDown();
		testUtil.testWaitFour();
		uLogoAllcompaniesPage.selectSectorCompany();
		testUtil.testWaitFour();
		testUtil.scrollDown();
		testUtil.testWaitFour();
		uLogoAllcompaniesPage.clearWebsiteField();
		testUtil.testWaitFour();
		uLogoAllcompaniesPage.enterWebsite("https://cybage.com");
		testUtil.testWaitFour();
		testUtil.scrollDown();
		testUtil.testWaitFour();
		testUtil.scrollDown();
		testUtil.testWaitFour();
		uLogoAllcompaniesPage.clickSaveBtn();
		  //uLogoAllcompaniesPage.clickCancelBtn();
		testUtil.testWaitEight();
		testUtil.scrollUp();
		testUtil.testWaitFour();
		  //uLogoMycompanyPage.clickDeleteCompanySign();
		  //testUtil.testWaitFour();
		  //System.out.println(uLogoAllcompaniesPage.companyLink());
		  //testUtil.testWaitFour();
		  //if(uLogoAllcompaniesPage.companyLink().equals("Cybage Software B.V.")) {
			//testUtil.testWaitTwo();
		  //uLogoMycompanyPage.clickDeleteCompany();
		  //uLogoMycompanyPage.clickCancelDelete();
		  //testUtil.testWaitFour();
			//testUtil.testWaitEight();
		  //}else {
			//System.out.println("Company name not exist");
		  //}
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

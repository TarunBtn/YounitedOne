package com.younited.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.younited.qa.base.TestBase;
import com.younited.qa.pages.HomePage;
import com.younited.qa.pages.LoginPage;
import com.younited.qa.pages.ManageProfilePage;
import com.younited.qa.util.TestUtil;

public class ManageProfilePageTest extends TestBase{
	
	LoginPage loginPage;
	HomePage homePage;
	TestUtil testUtil;
	ManageProfilePage manageProfilePage;
	
	public ManageProfilePageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp()throws Exception {
		initialization();
		loginPage=new LoginPage();
		manageProfilePage=new ManageProfilePage();
		testUtil=new TestUtil();
		homePage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		testUtil.testWaitFourteen();
		homePage.clickUserLogo();
		testUtil.testWaitEight();
		homePage.clickManageProfileLink();
		testUtil.testWaitFourteen();
		
	}
	
	@Test
	public void test()throws Exception {
		manageProfilePage.clickMyProfilePageLogo();
		testUtil.testWaitEight();
		manageProfilePage.clickEditYourProfileLink();
		testUtil.testWaitFourteen();
		testUtil.scrollDown();
		testUtil.testWaitFour();
		testUtil.scrollUp();
		testUtil.testWaitFour();
		manageProfilePage.clickInstitutionsTab();
		testUtil.testWaitEight();
		testUtil.scrollDown();
		testUtil.testWaitFour();
		testUtil.scrollUp();
		testUtil.testWaitFour();
		/*manageProfilePage.clickGeneralTab();
		testUtil.testWaitFour();
		testUtil.scrollDown();
		testUtil.testWaitFour();
		testUtil.scrollDown();
		testUtil.testWaitFour();*/
		//manageProfilePage.clickCancelBtn();
		//testUtil.testWaitEight();
		homePage.clickSignOutLink();
		testUtil.testWaitFour();
		homePage.clickSignOutBtn();
		testUtil.testWaitEight();
		
	}
	
	@AfterMethod
	public void tearDown() {
		Driver.quit();
	}

}

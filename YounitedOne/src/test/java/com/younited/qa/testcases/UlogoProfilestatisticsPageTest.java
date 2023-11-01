package com.younited.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.younited.qa.base.TestBase;
import com.younited.qa.pages.HomePageAdmin;
import com.younited.qa.pages.LoginPage;
import com.younited.qa.pages.UlogoProfilestatisticsPage;
import com.younited.qa.util.TestUtil;

public class UlogoProfilestatisticsPageTest extends TestBase{
	
	LoginPage loginPage;
	HomePageAdmin homePageAdmin;
	UlogoProfilestatisticsPage uLogoProfilestatisticsPage;
	TestUtil testUtil;
	
	
	public UlogoProfilestatisticsPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp()throws Exception {
		initialization();
		loginPage=new LoginPage();
		uLogoProfilestatisticsPage=new UlogoProfilestatisticsPage();
		testUtil=new TestUtil();
		homePageAdmin=loginPage.loginHomePageAdmin(prop.getProperty("usernametwo"), prop.getProperty("passwordtwo"));
		testUtil.testWaitEleven();
		homePageAdmin.clickAcceptAllCookies();
		testUtil.testWaitEight();
		homePageAdmin.clickUserLogo();
		testUtil.testWaitTwo();
		homePageAdmin.clickProfileStatistics();
		testUtil.testWaitFour();
		homePageAdmin.moveHoverTologoImage();
		testUtil.testWaitTwo();
				
	}
	
	@Test
	public void UlogoProfilestatisticsPage()throws Exception {
		uLogoProfilestatisticsPage.clickRoleDropDown();
		testUtil.testWaitTwo();
		uLogoProfilestatisticsPage.selectRole();
		testUtil.testWaitFour();
		//uLogoProfilestatisticsPage.clickRoleDropDown();
		//testUtil.testWaitTwo();
		//uLogoProfilestatisticsPage.clickRoleDropDown();
		//testUtil.testWaitTwo();
		uLogoProfilestatisticsPage.resetRoleDropDown();
		testUtil.testWaitFour();
	}
	
	@AfterMethod
	public void tearDown() {
		//Driver.quit();
	}
	

}

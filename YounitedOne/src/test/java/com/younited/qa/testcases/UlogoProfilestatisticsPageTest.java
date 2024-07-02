package com.younited.qa.testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
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
		testUtil.testWaitFourteen();
		//homePageAdmin.clickAcceptAllCookies();
		//testUtil.testWaitEleven();
		homePageAdmin.clickUserLogo();
		testUtil.testWaitEight();
		homePageAdmin.clickProfileStatistics();
		testUtil.testWaitEight();
		//homePageAdmin.moveHoverTologoImage();
		//testUtil.testWaitTwo();
				
	}
	
	@Test
	public void UlogoProfilestatisticsPage()throws Exception {
		uLogoProfilestatisticsPage.clickSearchField();
		testUtil.testWaitFour();
		uLogoProfilestatisticsPage.enterValueSearchField("Arjan");
		testUtil.testWaitEight();
		uLogoProfilestatisticsPage.clickResetBtn();
		testUtil.testWaitFour();
		uLogoProfilestatisticsPage.clickRoleDropDown();
		testUtil.testWaitFour();
		uLogoProfilestatisticsPage.selectRole();
		testUtil.testWaitFour();
		uLogoProfilestatisticsPage.clickRoleDropDown();
		testUtil.testWaitFour();
		testUtil.scrollDown();
		testUtil.testWaitFour();
		testUtil.scrollUp();
		testUtil.testWaitFour();
		uLogoProfilestatisticsPage.clickRoleDropDown();
		testUtil.testWaitTwo();
		uLogoProfilestatisticsPage.resetRoleDropDown();
		testUtil.testWaitFour();
		uLogoProfilestatisticsPage.clickRoleDropDown();
		testUtil.testWaitFour();
		homePageAdmin.clickSignOutLink();
	  	testUtil.testWaitFour();
	  	homePageAdmin.clickSignOutBtn();
	  	testUtil.testWaitFour();
				
	}
	
	@AfterMethod
	public void tearDown() {
		Driver.quit();
	}
	

}

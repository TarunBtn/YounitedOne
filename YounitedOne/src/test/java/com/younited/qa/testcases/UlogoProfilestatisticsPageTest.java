package com.younited.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.younited.qa.base.TestBase;
import com.younited.qa.pages.HomePageAdmin;
import com.younited.qa.pages.LoginPage;
import com.younited.qa.util.TestUtil;

public class UlogoProfilestatisticsPageTest extends TestBase{
	
	LoginPage loginPage;
	HomePageAdmin homePageAdmin;
	
	TestUtil testUtil;
	
	
	public UlogoProfilestatisticsPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp()throws Exception {
		initialization();
		loginPage=new LoginPage();
		testUtil=new TestUtil();
		homePageAdmin=loginPage.loginHomePageAdmin(prop.getProperty("username"), prop.getProperty("password"));
		testUtil.testWaitEleven();
		homePageAdmin.clickUserLogo();
		testUtil.testWaitFour();
		homePageAdmin.clickProfileStatistics();
		testUtil.testWaitEight();
		
		
		
		
		
	}
	
	@Test
	public void UlogoProfilestatisticsPage() {
		
	}
	
	@AfterMethod
	public void tearDown() {
		//Driver.quit();
	}
	

}

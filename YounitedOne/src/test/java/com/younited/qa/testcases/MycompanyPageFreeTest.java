package com.younited.qa.testcases;

import org.openqa.selenium.NoSuchElementException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.younited.qa.base.TestBase;
import com.younited.qa.pages.HomePageFree;
import com.younited.qa.pages.LoginPage;
import com.younited.qa.pages.MycompanyPageFree;
import com.younited.qa.util.TestUtil;

public class MycompanyPageFreeTest extends TestBase{	
	
	LoginPage loginPage;
	HomePageFree homePageFree;
	MycompanyPageFree myCompanyPageFree;
	TestUtil testUtil;
	
	public MycompanyPageFreeTest() {
		super();
	} 
	
	@BeforeMethod
	public void setUp()throws Exception {
		initialization();
		loginPage=new LoginPage();
		myCompanyPageFree=new MycompanyPageFree();
		testUtil=new TestUtil();
		homePageFree=loginPage.loginHomePageFree(prop.getProperty("usernameone"), prop.getProperty("passwordone"));
		testUtil.testWaitFourteen();
		try {
			homePageFree.clickAcceptAllCookies();
		}catch(NoSuchElementException e) {
				e.printStackTrace();
		}
		testUtil.testWaitFour();
		homePageFree.clickUserLogo();
		testUtil.testWaitFour();
		homePageFree.clickMyCompanyTab();
		testUtil.testWaitEleven();
			
	}
	
	@Test
	public void myCompanyPageFreeTest()throws Exception {
		System.out.println("Test is passed");
		testUtil.testWaitTwo();
		homePageFree.clickSignOutLink();
		testUtil.testWaitFour();
		homePageFree.clickSignOutBtn();
		testUtil.testWaitEight();
	}
	
	@AfterMethod
	public void tearDown(){
		Driver.quit();
	}

}

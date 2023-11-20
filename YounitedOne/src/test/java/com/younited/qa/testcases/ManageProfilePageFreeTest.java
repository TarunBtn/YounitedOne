package com.younited.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.younited.qa.base.TestBase;
import com.younited.qa.pages.HomePageAdmin;
import com.younited.qa.pages.HomePageFree;
import com.younited.qa.pages.LoginPage;
import com.younited.qa.pages.ManageProfilePageFree;
import com.younited.qa.pages.UlogoMyprofilePage;
import com.younited.qa.util.TestUtil;

public class ManageProfilePageFreeTest extends TestBase{
	
	LoginPage loginPage;
	HomePageFree homePageFree;
	HomePageAdmin homePageAdmin;
	ManageProfilePageFree manageProfilePageFree;
	UlogoMyprofilePage uLogoMyprofilePage;
	TestUtil testUtil;
	
	public ManageProfilePageFreeTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp()throws Exception {
		initialization();
		loginPage=new LoginPage();
		homePageAdmin=new HomePageAdmin();
		manageProfilePageFree=new ManageProfilePageFree();
		uLogoMyprofilePage=new UlogoMyprofilePage();
		testUtil=new TestUtil();
		homePageFree=loginPage.loginHomePageFree(prop.getProperty("usernameone"), prop.getProperty("passwordone"));
		testUtil.testWaitEleven();
		homePageFree.clickAcceptAllCookies();
		testUtil.testWaitEleven();
		homePageAdmin.clickUserLogo();
		testUtil.testWaitTwo();
		homePageAdmin.clickMyProfileTab();
		testUtil.testWaitEleven();
		homePageAdmin.moveHoverTologoImage();
		testUtil.testWaitFour();
				
	}
	
	@Test
	public void test()throws Exception {
		testUtil.scrollDown();
		testUtil.testWaitTwo();
		testUtil.scrollDown();
		testUtil.testWaitTwo();
		testUtil.scrollDown();
		testUtil.testWaitTwo();
	}
	
	@AfterMethod
	public void tearDown() {
		//Driver.quit();
	}

}

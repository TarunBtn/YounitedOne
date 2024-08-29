package com.younited.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.younited.qa.base.TestBase;
import com.younited.qa.pages.HomePage;
import com.younited.qa.pages.HomePageFree;
import com.younited.qa.pages.LoginPage;
import com.younited.qa.pages.MyReactionsPageFree;
import com.younited.qa.util.TestUtil;

public class MyReactionsPageFreeTest extends TestBase{
	
	LoginPage loginPage;
	HomePage homePage;
	TestUtil testUtil;
	HomePageFree homePageFree;
	MyReactionsPageFree myReactionsPageFree;
	
	public MyReactionsPageFreeTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp()throws Exception {
		initialization();
		loginPage=new LoginPage();
		homePage=new HomePage();
		testUtil=new TestUtil();
		myReactionsPageFree=new MyReactionsPageFree();
		homePageFree=loginPage.loginHomePageFree(prop.getProperty("usernameone"), prop.getProperty("passwordone"));
		testUtil.testWaitFourteen();
		homePageFree.clickUserLogo();
		testUtil.testWaitEight();
		homePageFree.clickMyReactionsTab();
		testUtil.testWaitFourteen();
			
	}
	
	@Test
	public void test()throws Exception {
		//myReactionsPageFree.clickMyReactionsPageLogo();
		//testUtil.testWaitFour();
		myReactionsPageFree.clickStatusDropDown();
		testUtil.testWaitFour();
		myReactionsPageFree.selectInTreatment();
		testUtil.testWaitEight();
		myReactionsPageFree.clickStatusDropDown();
		testUtil.testWaitFour();
		myReactionsPageFree.selectOnInterview();
		testUtil.testWaitEight();
		myReactionsPageFree.clickStatusDropDown();
		testUtil.testWaitFour();
		myReactionsPageFree.selectRegisterAgreement();
		testUtil.testWaitEight();
		myReactionsPageFree.clickStatusDropDown();
		testUtil.testWaitFour();
		myReactionsPageFree.selectWithdrawnRejected();
		testUtil.testWaitEight();
		myReactionsPageFree.clickStatusDropDown();
		testUtil.testWaitFour();
		myReactionsPageFree.selectAllStatus();
		testUtil.testWaitEight();
		//myReactionsPageFree.clickAssignmentLink();
		//testUtil.testWaitFour();
		//myReactionsPageFree.clickMyReactionsPageLogo();
		//testUtil.testWaitFour();
		homePageFree.clickSignOutLink();
		testUtil.testWaitFour();
		homePageFree.clickSignOutBtn();
		testUtil.testWaitEight();
	}
	
	@AfterMethod
	public void tearDown() {
		Driver.quit();
	}

}

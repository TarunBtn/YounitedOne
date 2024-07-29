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
		testUtil.testWaitFour();
		homePageFree.clickMyReactionsTab();
		testUtil.testWaitEight();
			
	}
	
	@Test
	public void test()throws Exception {
		myReactionsPageFree.clickMyReactionsPageLogo();
		testUtil.testWaitFour();
		myReactionsPageFree.clickStatusDropDown();
		testUtil.testWaitTwo();
		myReactionsPageFree.selectInTreatment();
		testUtil.testWaitFour();
		myReactionsPageFree.clickStatusDropDown();
		testUtil.testWaitTwo();
		myReactionsPageFree.selectOnInterview();
		testUtil.testWaitFour();
		myReactionsPageFree.clickStatusDropDown();
		testUtil.testWaitTwo();
		myReactionsPageFree.selectRegisterAgreement();
		testUtil.testWaitEight();
		myReactionsPageFree.clickStatusDropDown();
		testUtil.testWaitTwo();
		myReactionsPageFree.selectWithdrawnRejected();
		testUtil.testWaitFour();
		myReactionsPageFree.clickStatusDropDown();
		testUtil.testWaitTwo();
		myReactionsPageFree.selectAllStatus();
		testUtil.testWaitFour();
		/*myReactionsPageFree.clickAssignmentLink();
		testUtil.testWaitFour();
		myReactionsPageFree.clickMyReactionsPageLogo();
		testUtil.testWaitFour();*/
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

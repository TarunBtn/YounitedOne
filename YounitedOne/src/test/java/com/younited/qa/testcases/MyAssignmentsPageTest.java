package com.younited.qa.testcases;

import org.openqa.selenium.NoSuchElementException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.younited.qa.base.TestBase;
import com.younited.qa.pages.AddCommandPage;
import com.younited.qa.pages.HomePage;
import com.younited.qa.pages.LoginPage;
import com.younited.qa.pages.MyAssignmentsPage;
import com.younited.qa.util.TestUtil;

public class MyAssignmentsPageTest extends TestBase{
	LoginPage loginPage;
	HomePage homePage;
	MyAssignmentsPage myAssignmentsPage;
	AddCommandPage addCommandPage;
	//CheckCommandPage checkCommandPage;
	TestUtil testUtil;
	
	public MyAssignmentsPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp()throws Exception {
		initialization();					
		loginPage=new LoginPage();
		addCommandPage=new AddCommandPage();
		myAssignmentsPage=new MyAssignmentsPage();
		testUtil=new TestUtil();
		homePage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		testUtil.testWaitFourteen();
		try {
			homePage.clickAcceptAllCookies();
		}catch(NoSuchElementException e) {
				e.printStackTrace();
		}
		testUtil.testWaitFour();
		//homePage.clickAcceptAllCookies();
		//testUtil.testWaitEleven();		
		homePage.clickMyAssignmentsLink();
		testUtil.testWaitEleven();
		//testUtil.testWaitEight();
		//checkCommandPage=new CheckCommandPage();
		testUtil.scrollDown();
		testUtil.testWaitTwo();
		testUtil.scrollUp();
		testUtil.testWaitTwo();
													
	}
	
	@Test
	public void myAssignmentsPageTest()throws Exception {
		myAssignmentsPage.enterValueInFilter("Test");
		testUtil.testWaitEleven();
		myAssignmentsPage.clickResetFilter();
		testUtil.testWaitEleven();
		myAssignmentsPage.clickChooseCompanyDropDown();
		testUtil.testWaitFour();
		myAssignmentsPage.selectCompanyFromDropDown();
		testUtil.testWaitFour();
		myAssignmentsPage.clickChooseCompanyDropDown();
		testUtil.testWaitTwo();
		testUtil.scrollDown();
		testUtil.testWaitTwo();
		testUtil.scrollUp();
		testUtil.testWaitTwo();
		myAssignmentsPage.clickStatusDropDown();
		testUtil.testWaitFour();
		myAssignmentsPage.selectStatusFromDropDownOpen();
		testUtil.testWaitEight();
		//myAssignmentsPage.StatusDropDown();
		//testUtil.testWaitFour();
		//myAssignmentsPage.selectStatusFromDropDownClosed();
		//testUtil.testWaitFour();
		myAssignmentsPage.clickStatusDropDown();
		testUtil.testWaitTwo();
		testUtil.scrollDown();
		testUtil.testWaitTwo();
		testUtil.scrollUp();
		testUtil.testWaitTwo();
		myAssignmentsPage.clickStatusDropDown();
		testUtil.testWaitFour();
		myAssignmentsPage.clearStatusFromDropDown();
		testUtil.testWaitFour();
		myAssignmentsPage.clickStatusDropDown();
		testUtil.testWaitTwo();
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

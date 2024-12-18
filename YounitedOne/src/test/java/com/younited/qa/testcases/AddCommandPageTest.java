package com.younited.qa.testcases;

import org.openqa.selenium.NoSuchElementException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.younited.qa.base.TestBase;
import com.younited.qa.pages.AddCommandPage;
import com.younited.qa.pages.CheckCommandPage;
import com.younited.qa.pages.HomePage;
import com.younited.qa.pages.LoginPage;
import com.younited.qa.pages.MyAssignmentsPage;
import com.younited.qa.util.TestUtil;

public class AddCommandPageTest extends TestBase{
	LoginPage loginPage;
	HomePage homePage;
	MyAssignmentsPage myAssignmentsPage;
	AddCommandPage addCommandPage;
	CheckCommandPage checkCommandPage;
	TestUtil testUtil;
	
	public AddCommandPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp()throws Exception {
		initialization();
		loginPage=new LoginPage();
		myAssignmentsPage=new MyAssignmentsPage();
		addCommandPage=new AddCommandPage();
		checkCommandPage=new CheckCommandPage();
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
		//homePage.clickReactiesDropDown();
		//testUtil.testWaitEight();
		homePage.clickMyAssignmentsLink();
		testUtil.testWaitFourteen();
		myAssignmentsPage.clickAddNewCommand();
		testUtil.testWaitEight();
		testUtil.scrollDown();
		testUtil.testWaitFour();
		
	}
	
	@Test
	public void uploadFileTest()throws Exception {
		addCommandPage.clickChooseFile();
		testUtil.testWaitFour();
		testUtil.uploadFile("D:\\Assignment.docx");
		testUtil.testWaitEight();
		try {
		    checkCommandPage=addCommandPage.clickUploadFile();
		}catch(NoSuchElementException e) {
			e.printStackTrace();
		}
		testUtil.testWaitEight();
		testUtil.scrollUp();
		testUtil.testWaitFour();
		
	}
	
	@AfterMethod
	public void tearDown() {
		Driver.quit();
		
	}

}

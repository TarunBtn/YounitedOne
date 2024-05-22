package com.younited.qa.testcases;

import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.NoSuchElementException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.younited.qa.base.TestBase;
import com.younited.qa.pages.AddCommandPage;
import com.younited.qa.pages.CheckCommandPage;
import com.younited.qa.pages.CompleteAssignment;
import com.younited.qa.pages.HomePage;
import com.younited.qa.pages.LoginPage;
import com.younited.qa.pages.MyAssignmentsPage;
import com.younited.qa.util.TestUtil;

public class CompleteAssignmentTest extends TestBase{
	LoginPage loginPage;
	HomePage homePage;
	MyAssignmentsPage myAssignmentsPage;
	AddCommandPage addCommandPage;
	CheckCommandPage checkCommandPage;
	CompleteAssignment completeAssignment;
	TestUtil testUtil;
	
	public CompleteAssignmentTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp()throws Exception {
		initialization();
		loginPage=new LoginPage();
		addCommandPage=new AddCommandPage();
		checkCommandPage=new CheckCommandPage();
		myAssignmentsPage=new MyAssignmentsPage();
		completeAssignment=new CompleteAssignment();
		testUtil=new TestUtil();		
		homePage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		testUtil.testWaitFourteen();
		//homePage.clickAcceptAllCookies();
		//testUtil.testWaitEleven();		
		homePage.clickMyAssignmentsLink();
		testUtil.testWaitFourteen();
		//testUtil.testWaitEight();
		//addCommandPage=myAssignmentsPage.clickAddNewCommand();
		myAssignmentsPage.clickAddNewCommand();
		testUtil.testWaitEight();
		testUtil.scrollDown();
		testUtil.testWaitTwo();
		addCommandPage.clickChooseFile();		
		testUtil.testWaitFour();
		testUtil.uploadFile("D:\\Assignment.docx");
		testUtil.testWaitEight();
		addCommandPage.clickUploadFile();
		testUtil.testWaitEight();
		testUtil.scrollUp();
		testUtil.testWaitTwo();
		//checkCommandPage.clickFillInComplete();
		//testUtil.testWaitEight();
		//testUtil.scrollDown();
		//testUtil.testWaitFour();
	}
	
	@Test
	public void completeAssignmentTest()throws Exception {
		/*completeAssignment.clickCompanyDropDown();
		testUtil.testWaitTwo();
		completeAssignment.selectCompany();
		testUtil.testWaitFour();
		testUtil.scrollDown();
		testUtil.testWaitTwo();
		completeAssignment.assignmentName("QA EngineerEight");
		testUtil.testWaitFour();*/
		//completeAssignment.clickSectorDropDown();
		//testUtil.testWaitTwo();
		//completeAssignment.selectSectorFromDropDown();
		testUtil.testWaitFour();
		testUtil.scrollDown();
		testUtil.testWaitFour();
		completeAssignment.clickDesciplineDropDown();
		testUtil.testWaitTwo();
		completeAssignment.selectDescipline();
		testUtil.testWaitFour();
		testUtil.scrollDown();
		testUtil.testWaitFour();
		/*completeAssignment.clickWorkLocation();
		testUtil.testWaitTwo();
		completeAssignment.selectWorkLocation("Punthorst, Netherlands");
		testUtil.testWaitFour();
		completeAssignment.clickWorkLocationTooltip();
		testUtil.testWaitFour();
		completeAssignment.clickWorkLocation();
		testUtil.testWaitTwo();
		completeAssignment.clickWorkLocationTooltip();
		testUtil.testWaitFour();
		completeAssignment.clickWorkingThinkingLevel();
		testUtil.testWaitFour();
		completeAssignment.selectWorkingThinkingLevel();
		testUtil.testWaitFour();*/
		completeAssignment.clickNextButton();
		testUtil.testWaitEight();
		//completeAssignment.clickNextButton();
		//testUtil.testWaitFourteen();
		//testUtil.scrollUp();
		//testUtil.testWaitFour();
		
		//completeAssignment.selectWorkLocation();
		//testUtil.testWaitFour();
		//completeAssignment.clickWorkLocationTooltip();
		//testUtil.testWaitFour();
		//try {
			//Driver.findElement(By.name("date")).sendKeys("01-08-2024");
				
		//}catch(ElementNotInteractableException e) {
			//e.printStackTrace();
		//}	
		completeAssignment.clickProfileField();
		testUtil.testWaitTwo();
		completeAssignment.enterProfile("Database administrator");
		testUtil.testWaitFour();
		completeAssignment.clickProfileTooltip();
		testUtil.testWaitFour();
		completeAssignment.clickNextButton();
		testUtil.testWaitEight();
		testUtil.scrollUp();
		testUtil.testWaitFour();
		/*testUtil.scrollUp();
	    testUtil.testWaitFour();
		//Generate description
	    try {
		    completeAssignment.clickGenerateDescription();
		    //testUtil.testWaitEleven();
	   }catch(NoSuchElementException e) {
	   	  e.printStackTrace();
	   }
	    testUtil.scrollDown();
	    testUtil.testWaitFour();
	    //testUtil.scrollDown();
	    //testUtil.testWaitTwo();
	    try {
		   completeAssignment.clickUseThisText();
	    }catch(ElementClickInterceptedException e) {
	    	e.printStackTrace();
	    }
	    
	    try {
			   completeAssignment.clickUseThisTextOne();
		    }catch(ElementClickInterceptedException e) {
		    	e.printStackTrace();
		    }
		testUtil.testWaitEight();*/
		//Select start date
	    completeAssignment.clickStartDateDropDown();
		testUtil.testWaitFour();
		//completeAssignment.selectStartYear();
		//testUtil.testWaitTwo();
		completeAssignment.selectStartDate();
		testUtil.testWaitFour();	
		//Select end date
		completeAssignment.clickEndDateDropDown();
		testUtil.testWaitFour();
		//completeAssignment.selectEndYear();
		//testUtil.testWaitTwo();
		//completeAssignment.selectEndYear();
		//testUtil.testWaitTwo();
		completeAssignment.selectEndDate();
		testUtil.testWaitFour();
		testUtil.scrollDown();
		testUtil.testWaitFour();
		//NumberofHours
		/*completeAssignment.selectNumberOfHours();
		testUtil.testWaitFour();
		testUtil.scrollDown();
		testUtil.testWaitTwo();
		//selectWorkingThinkingLevel
		completeAssignment.selectWorkingThinkingLevel();
		testUtil.testWaitFour();
		//Select FieldOfExpertise/Descipline
		completeAssignment.clickFieldOfExpertise();
		testUtil.testWaitFour();
		completeAssignment.selectFieldOfExpertise();
		testUtil.testWaitFour();
		testUtil.scrollDown();
		testUtil.testWaitTwo();
		testUtil.scrollDown();
		testUtil.testWaitTwo();
		testUtil.scrollDown();
		testUtil.testWaitTwo();
		//Add Skills and remove skills
		completeAssignment.clickSkillsField();
		testUtil.testWaitTwo();
		completeAssignment.enterSkills("Security Management");
		testUtil.testWaitFour();
		completeAssignment.skillsToolTip();
		testUtil.testWaitTwo();
		completeAssignment.enterSkills("Databases");
		testUtil.testWaitFour();
		completeAssignment.skillsToolTip();
		testUtil.testWaitTwo();
		completeAssignment.enterSkills("Test Engineering");
		testUtil.testWaitFour();
		completeAssignment.skillsToolTip();
		testUtil.testWaitTwo();
		completeAssignment.unSelectSkillsOne();
		testUtil.testWaitTwo();
		completeAssignment.unSelectSkillsTwo();
		testUtil.testWaitTwo();*/
		completeAssignment.clickNextButton();
		testUtil.testWaitEight();
		testUtil.scrollDown();
		testUtil.testWaitFour();
		completeAssignment.clickNextButton();
		testUtil.testWaitEight();
		testUtil.scrollDown();
		testUtil.testWaitFour();
		completeAssignment.clickNextButton();
		testUtil.testWaitEight();
		testUtil.scrollDown();
		testUtil.testWaitFour();
		completeAssignment.clickVisibleDateTo();
		testUtil.testWaitFour();
		completeAssignment.selectVisibleDateTo();
		testUtil.testWaitFour();
		//completeAssignment.clickSaveButton();
			
	}
	
	@AfterMethod
	public void tearDown() {
		Driver.quit();
		
	}

}

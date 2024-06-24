package com.younited.qa.testcases;

import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.NoSuchElementException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.younited.qa.base.TestBase;
import com.younited.qa.pages.AssignmentsPageFree;
import com.younited.qa.pages.HomePageFree;
import com.younited.qa.pages.LoginPage;
import com.younited.qa.util.TestUtil;

public class AssignmentsPageFreeTest extends TestBase{
	LoginPage loginPage;
	HomePageFree homePageFree;
	AssignmentsPageFree assignmentsPageFree;
	TestUtil testUtil;
	
	public AssignmentsPageFreeTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp()throws Exception {
		initialization();
		loginPage=new LoginPage();		
		assignmentsPageFree=new AssignmentsPageFree();
		testUtil=new TestUtil();
		homePageFree=loginPage.loginHomePageFree(prop.getProperty("usernameone"), prop.getProperty("passwordone"));
		testUtil.testWaitEleven();	
		//homePageFree.clickAcceptAllCookies();
		//testUtil.testWaitEleven();
		homePageFree.clickAssignmentsLink();
		testUtil.testWaitEight();
			
	}
	
	@Test
	public void clickFiltersTest()throws Exception {
		//ValueFilterAssignment
		assignmentsPageFree.enterAssignmentsName("QA EngineerEight");
		testUtil.testWaitEight();
		assignmentsPageFree.selectAssignmentsValue();
		testUtil.testWaitFour();
		assignmentsPageFree.clearAssignmentsFilter();
		testUtil.testWaitFour();
		//Sector
		assignmentsPageFree.clickSectorTab();
		testUtil.testWaitTwo();
		assignmentsPageFree.selectSector();
		testUtil.testWaitFour();
		assignmentsPageFree.selectSector();
		testUtil.testWaitFour();
		assignmentsPageFree.clickSectorTab();
		testUtil.testWaitTwo();
		//Descipline
		assignmentsPageFree.clickDescipline();
		testUtil.testWaitTwo();
		assignmentsPageFree.selectDescipline();
		testUtil.testWaitFour();
		assignmentsPageFree.selectDescipline();
		testUtil.testWaitFour();
		assignmentsPageFree.clickDescipline();
		testUtil.testWaitTwo();
		//Skill
		assignmentsPageFree.clickSkillTab();
		testUtil.testWaitTwo();
		assignmentsPageFree.enterSkill();
		testUtil.testWaitTwo();
		assignmentsPageFree.enterSkillValue("Postman");
		testUtil.testWaitTwo();
		assignmentsPageFree.selectSkillToolTip();
		testUtil.testWaitTwo();
		assignmentsPageFree.clickSkillTab();
		testUtil.testWaitFour();
		assignmentsPageFree.applySkillFilter();
		testUtil.testWaitEight();
		assignmentsPageFree.clickSkillTab();
		testUtil.testWaitTwo();
		assignmentsPageFree.clickSkillTab();
		testUtil.testWaitTwo();
		assignmentsPageFree.clickResetFilterSkill();
		testUtil.testWaitFour();
		assignmentsPageFree.clickSkillTab();
		testUtil.testWaitFour();
		assignmentsPageFree.clickCancelSkill();
		testUtil.testWaitFour();
		//Duration
		assignmentsPageFree.clickDuration();
		testUtil.testWaitTwo();
		assignmentsPageFree.selectDuration();
		testUtil.testWaitFour();
		assignmentsPageFree.clickDuration();
		testUtil.testWaitTwo();
		assignmentsPageFree.clickDuration();
		testUtil.testWaitTwo();
		assignmentsPageFree.selectDuration();
		testUtil.testWaitFour();
		assignmentsPageFree.clickDuration();
		testUtil.testWaitTwo();
		//Work & Thinking level
		assignmentsPageFree.clickWorkAndThinkingLevel();
		testUtil.testWaitTwo();
	    assignmentsPageFree.selectWorkAndThinkingLevel();
		testUtil.testWaitFour();
	    assignmentsPageFree.clickWorkAndThinkingLevel();
		testUtil.testWaitTwo();
	    assignmentsPageFree.clickWorkAndThinkingLevel();
		testUtil.testWaitTwo();
		assignmentsPageFree.selectWorkAndThinkingLevel();
		testUtil.testWaitFour();
		assignmentsPageFree.clickWorkAndThinkingLevel();
		testUtil.testWaitTwo();
		//Hours
	    assignmentsPageFree.clickHoursTab();
		testUtil.testWaitTwo();
		assignmentsPageFree.selectHours();
		testUtil.testWaitEight();
		assignmentsPageFree.applyHoursFilter();
		testUtil.testWaitEight();
		assignmentsPageFree.clickHoursTab();
		testUtil.testWaitTwo();
		assignmentsPageFree.resetHoursFilter();
		testUtil.testWaitEight();
		assignmentsPageFree.clickHoursTab();
		testUtil.testWaitTwo();
		assignmentsPageFree.clickCancelHours();
		testUtil.testWaitTwo();
		//Hourly rate
		assignmentsPageFree.clickHourlyRateTab();
		testUtil.testWaitTwo();
		assignmentsPageFree.selectHourlyRate();
		testUtil.testWaitFour();
		assignmentsPageFree.applyHourlyRateFilter();
		testUtil.testWaitEight();
		assignmentsPageFree.clickHourlyRateTab();
		testUtil.testWaitTwo();
		assignmentsPageFree.resetHourlyRateFilter();
		testUtil.testWaitEight();
		assignmentsPageFree.clickHourlyRateTab();
		testUtil.testWaitTwo();
		assignmentsPageFree.clickCancelHourlyRate();
		testUtil.testWaitTwo();
		//Location
		assignmentsPageFree.clickLocationTab();
		testUtil.testWaitTwo();
		assignmentsPageFree.enterLocation("Noordwijk Netherlands");
		testUtil.testWaitTwo();
		try {
			  	assignmentsPageFree.enterLocationToolTip();
			  	testUtil.testWaitTwo();
		}catch(ElementNotInteractableException e) {
			   e.printStackTrace();
		}
		testUtil.testWaitTwo();
		try {
			  	assignmentsPageFree.applyLocationFilter();
			  	testUtil.testWaitFour();
		}catch(NoSuchElementException e) {
			    e.printStackTrace();
		}
		testUtil.testWaitFour();
		assignmentsPageFree.clickLocationTab();
		testUtil.testWaitFour();
		assignmentsPageFree.clickLocationTab();
		testUtil.testWaitFour();
		assignmentsPageFree.resetLocation();
		testUtil.testWaitEight();
		//View matches
		assignmentsPageFree.clickViewMatches();
		testUtil.testWaitEleven();
		assignmentsPageFree.clickViewMatches();
		testUtil.testWaitEleven();
		//Favourites
		assignmentsPageFree.clickFavorites();
		testUtil.testWaitEleven();
		assignmentsPageFree.clickFavorites();
		testUtil.testWaitEleven();
		//Sorting
		assignmentsPageFree.clickSortingDropDown();
		testUtil.testWaitTwo();
		assignmentsPageFree.selectPublicationDateOldFirst();
		testUtil.testWaitEight();	
		assignmentsPageFree.selectAtHourlyRate();
		testUtil.testWaitEight();
		assignmentsPageFree.selectByNumberOfHours();
		testUtil.testWaitEight();
		assignmentsPageFree.selectPublicationDateNewFirst();
		testUtil.testWaitEight();
		assignmentsPageFree.clickSortingDropDown();
		testUtil.testWaitTwo();
		
	}
	
	@AfterMethod
	public void tearDown() {
		//Driver.quit();
		
	}

}

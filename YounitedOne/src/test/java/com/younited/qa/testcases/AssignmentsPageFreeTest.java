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
		//try {
		//homePageFree.clickAcceptAllCookies();
		//}catch(NoSuchElementException e) {
			//e.printStackTrace();
		//}
		//testUtil.testWaitEleven();
		homePageFree.clickAssignmentsLink();
		testUtil.testWaitEight();
			
	}
	
	//public void assignmentsPageTitleTest()throws Exception {
		//String title=assignmentsPageFree.assignmentsPageTitle();
		//Assert.assertEquals(title, "Opdrachten - Younited®");
		//testUtil.testWaitTwo();
	//}
	
	@Test
	public void clickFiltersTest()throws Exception {
		//Sector
		assignmentsPageFree.clickSectorTab();
		testUtil.testWaitFour();
		assignmentsPageFree.selectSector();
		testUtil.testWaitFour();
		assignmentsPageFree.selectSector();
		testUtil.testWaitFour();
		//Descipline
		assignmentsPageFree.clickDescipline();
		testUtil.testWaitFour();
		assignmentsPageFree.selectDescipline();
		testUtil.testWaitFour();
		assignmentsPageFree.selectDescipline();
		testUtil.testWaitFour();
		//Skill
		assignmentsPageFree.clickSkillTab();
		testUtil.testWaitFour();
		assignmentsPageFree.enterSkill();
		testUtil.testWaitFour();
		assignmentsPageFree.enterSkillValue("Postman");
		testUtil.testWaitFour();
		assignmentsPageFree.selectSkillToolTip();
		testUtil.testWaitFour();
		assignmentsPageFree.clickSkillTab();
		testUtil.testWaitFour();
		assignmentsPageFree.applySkillFilter();
		testUtil.testWaitFour();
		assignmentsPageFree.clickSkillTab();
		testUtil.testWaitFour();
		assignmentsPageFree.clickSkillTab();
		testUtil.testWaitFour();
		assignmentsPageFree.clickClearFilterSkill();
		testUtil.testWaitFour();
		assignmentsPageFree.clickCancelSkill();
		testUtil.testWaitFour();
		//Duration
		assignmentsPageFree.clickDuration();
		testUtil.testWaitFour();
		assignmentsPageFree.selectDuration();
		testUtil.testWaitFour();
		assignmentsPageFree.clickDuration();
		testUtil.testWaitTwo();	
		assignmentsPageFree.clickDuration();
		testUtil.testWaitTwo();
		assignmentsPageFree.selectDuration();
		testUtil.testWaitFour();
		assignmentsPageFree.clickDuration();
		testUtil.testWaitEight();
		//WorkAndThinkingLevel
		assignmentsPageFree.clickWorkAndThinkingLevel();
		testUtil.testWaitTwo();
		assignmentsPageFree.selectWorkAndThinkingLevel();
		testUtil.testWaitFour();
		assignmentsPageFree.clickWorkAndThinkingLevel();
		testUtil.testWaitTwo();
		assignmentsPageFree.clickWorkAndThinkingLevel();
		testUtil.testWaitFour();
		assignmentsPageFree.selectWorkAndThinkingLevel();
		testUtil.testWaitFour();
		assignmentsPageFree.clickWorkAndThinkingLevel();
		testUtil.testWaitEight();
		//Hours
		assignmentsPageFree.clickHoursTab();
		testUtil.testWaitFour();
		assignmentsPageFree.selectHours();
		testUtil.testWaitFour();
		assignmentsPageFree.applyHoursFilter();
		testUtil.testWaitFour();
		assignmentsPageFree.clickHoursTab();
		testUtil.testWaitFour();
		assignmentsPageFree.resetHoursFilter();
		testUtil.testWaitFour();
		assignmentsPageFree.clickHoursTab();
		testUtil.testWaitTwo();
		assignmentsPageFree.clickCancelHours();
		testUtil.testWaitTwo();
		//Hourly rate
		assignmentsPageFree.clickHourlyRateTab();
		testUtil.testWaitFour();
		assignmentsPageFree.selectHourlyRate();
		testUtil.testWaitFour();
		assignmentsPageFree.applyHourlyRateFilter();
		testUtil.testWaitFour();
		assignmentsPageFree.clickHourlyRateTab();
		testUtil.testWaitFour();
		assignmentsPageFree.resetHourlyRateFilter();
		testUtil.testWaitFour();
		assignmentsPageFree.clickHourlyRateTab();
		testUtil.testWaitTwo();
		assignmentsPageFree.clickCancelHourlyRate();
		testUtil.testWaitTwo();
		//Location
		assignmentsPageFree.clickLocationTab();
		testUtil.testWaitTwo();
		assignmentsPageFree.locationRemove();
		testUtil.testWaitFour();
		assignmentsPageFree.enterLocation("Noordwijk, Netherlands");
		testUtil.testWaitEight();
		assignmentsPageFree.enterLocationToolTip();
		testUtil.testWaitEight();
		try {
		assignmentsPageFree.applyLocationFilter();
		testUtil.testWaitEight();
		}catch(ElementNotInteractableException e) {
			e.printStackTrace();
		}
		testUtil.testWaitFour();
		assignmentsPageFree.clickLocationTab();
		testUtil.testWaitFour();
		try {
			assignmentsPageFree.clickLocationTab();
			testUtil.testWaitFour();
		}catch(ElementNotInteractableException e) {
			e.printStackTrace();
		}
		//testUtil.testWaitFour();
		assignmentsPageFree.resetLocation();
		testUtil.testWaitEight();
		//assignmentsPageFree.clickLocationTab();
		//testUtil.testWaitTwo();
		//assignmentsPageFree.clickCancelLocation();
		//testUtil.testWaitTwo();
		//View matches
		assignmentsPageFree.clickViewMatches();
		testUtil.testWaitEight();
		assignmentsPageFree.clickViewMatches();
		testUtil.testWaitEight();
		//Favourites
		assignmentsPageFree.clickFavorites();
		testUtil.testWaitEight();
		assignmentsPageFree.clickFavorites();
		testUtil.testWaitEight();
		//Sorting
		assignmentsPageFree.clickSortingDropDown();
		testUtil.testWaitTwo();
		assignmentsPageFree.selectPublicationDateOldFirst();
		testUtil.testWaitFour();
		assignmentsPageFree.selectAtHourlyRate();
		testUtil.testWaitFour();
		assignmentsPageFree.selectByNumberOfHours();
		testUtil.testWaitFour();
		assignmentsPageFree.selectPublicationDateNewFirst();
		testUtil.testWaitFour();
		assignmentsPageFree.clickSortingDropDown();
		testUtil.testWaitFour();
		
	}
	
	@AfterMethod
	public void tearDown() {
		Driver.quit();
		
	}

}

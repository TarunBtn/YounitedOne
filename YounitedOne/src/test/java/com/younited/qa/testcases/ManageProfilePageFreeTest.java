package com.younited.qa.testcases;

import org.openqa.selenium.ElementClickInterceptedException;
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
		testUtil.testWaitFourteen();
		//homePageFree.clickAcceptAllCookies();
		//testUtil.testWaitEleven();
		homePageFree.clickUserLogo();		
		testUtil.testWaitEight();	
		homePageFree.clickManageProfileTab();
		testUtil.testWaitFourteen();
		//homePageFree.mouseHoverToLogoImage();
		//testUtil.testWaitEight();
				
	}
	
	@Test
	public void test()throws Exception {
		//General Tab
		//testUtil.scrollDown();
		//testUtil.testWaitTwo();
		//testUtil.scrollDown();
		//testUtil.testWaitTwo();
		//testUtil.scrollDown();
		//testUtil.testWaitTwo();	
		//testUtil.scrollDown();
		//testUtil.testWaitTwo();
		//testUtil.scrollDown();
		//testUtil.testWaitTwo();
		uLogoMyprofilePage.clickMyProfileLogo();
		testUtil.testWaitFour();
		uLogoMyprofilePage.clickChangeMyGeneralInformation();
		testUtil.testWaitEleven();
		testUtil.scrollDown();
		testUtil.testWaitTwo();
		testUtil.scrollDown();
		testUtil.testWaitTwo();	
		testUtil.scrollUp();
		testUtil.testWaitTwo();
		testUtil.scrollUp();
		testUtil.testWaitTwo();
		//testUtil.scrollDown();
		//testUtil.testWaitTwo();
		//testUtil.scrollDown();
		//testUtil.testWaitTwo();
		//testUtil.scrollDown();
		//testUtil.testWaitTwo();
		//testUtil.scrollDown();
		//testUtil.testWaitTwo();
		//testUtil.scrollDown();
		//testUtil.testWaitFour();
		//uLogoMyprofilePage.clickChangeMyGeneralInformationCancel();
		//testUtil.testWaitEleven();
		//testUtil.scrollDown();
		//testUtil.testWaitTwo();
		//testUtil.scrollUp();
		//testUtil.testWaitFour();
		//uLogoMyprofilePage.clickFillInCompany();
		//testUtil.testWaitFour();
		//testUtil.scrollDown();
		//testUtil.testWaitTwo();
		//testUtil.scrollDown();
		//testUtil.testWaitTwo();
		//testUtil.scrollDown();
		//testUtil.testWaitTwo();
		//testUtil.scrollDown();
		//testUtil.testWaitTwo();
		//testUtil.scrollDown();
		//testUtil.testWaitTwo();
		//uLogoMyprofilePage.clickFillInCompanyCancel();
		//testUtil.testWaitFour();
		//testUtil.scrollUp();
		//testUtil.testWaitTwo();
		//testUtil.scrollUp();
		//testUtil.testWaitTwo();
		//testUtil.scrollUp();
		//testUtil.testWaitTwo();
		//testUtil.scrollUp();
		//testUtil.testWaitTwo();
		//testUtil.scrollUp();
		//testUtil.testWaitTwo();
		//testUtil.scrollUp();
		//testUtil.testWaitTwo();
		//testUtil.scrollUp();
		//testUtil.testWaitTwo();
		//testUtil.scrollUp();
		//testUtil.testWaitFour();
		//testUtil.scrollUp();
		//testUtil.testWaitFour();
		//Availability Tab
		uLogoMyprofilePage.clickAvailabilityTab();
		testUtil.testWaitEight();
		testUtil.scrollDown();
		testUtil.testWaitTwo();
		testUtil.scrollDown();
		testUtil.testWaitTwo();
		testUtil.scrollUp();
		testUtil.testWaitTwo();
		testUtil.scrollUp();
		testUtil.testWaitTwo();
		//Skills Tab
		uLogoMyprofilePage.clickSkillsTab();
		testUtil.testWaitEight();
		testUtil.scrollDown();
		testUtil.testWaitTwo();
		testUtil.scrollDown();
		testUtil.testWaitTwo();
		testUtil.scrollUp();
		testUtil.testWaitTwo();
		testUtil.scrollUp();
		testUtil.testWaitTwo();
		//Enter skill value
		//uLogoMyprofilePage.enterSkillsValue("Account");
		//testUtil.testWaitEight();
		//try {
		  //  uLogoMyprofilePage.selectSkillsValue();
		   // testUtil.testWaitEight();
		//}catch(ElementClickInterceptedException e) {
			//e.printStackTrace();
			//testUtil.testWaitEleven();
		//}
		//testUtil.testWaitTwo();
		//testUtil.scrollUp();
		//testUtil.testWaitTwo();
		//Save additional skills
		//uLogoMyprofilePage.clickSaveAdditionalSkills();
		//testUtil.testWaitFour();
		//testUtil.scrollDown();
		//testUtil.testWaitTwo();
		//testUtil.scrollDown();
		//testUtil.testWaitTwo();
		//testUtil.scrollDown();
		//testUtil.testWaitTwo();
		//Remove skills
		//uLogoMyprofilePage.clickRemoveSkills();
		//testUtil.testWaitFour();
		//uLogoMyprofilePage.clickDeleteSkills();
		//testUtil.testWaitFour();
		//testUtil.scrollUp();
		//testUtil.testWaitTwo();
		//testUtil.scrollUp();
		//testUtil.testWaitTwo();
		//Work experience
		uLogoMyprofilePage.clickWorkExperienceTab();
		testUtil.testWaitFour();
		testUtil.scrollDown();
		testUtil.testWaitTwo();
		uLogoMyprofilePage.clickAddWorkExperience();
		testUtil.testWaitFour();
		testUtil.scrollDown();
		testUtil.testWaitFour();
		uLogoMyprofilePage.enterFunction("DBA");
		testUtil.testWaitTwo();
		uLogoMyprofilePage.enterCompany("TCS");
		testUtil.testWaitTwo();
		uLogoMyprofilePage.clickTypeWorkExperience();
		testUtil.testWaitFour();
		uLogoMyprofilePage.selectTypeWorkExperience();
		testUtil.testWaitFour();
		uLogoMyprofilePage.clickTypeWorkExperience();
		testUtil.testWaitTwo();
		uLogoMyprofilePage.enterDescription("This is test data");
		testUtil.testWaitTwo();
		testUtil.scrollDown();
		testUtil.testWaitTwo();
		uLogoMyprofilePage.clickStartDateCalender();
		testUtil.testWaitTwo();
		//uLogoMyprofilePage.selectStartYear();
		//testUtil.testWaitTwo();
		//uLogoMyprofilePage.selectStartYear();
		//testUtil.testWaitTwo();
		//uLogoMyprofilePage.selectStartYear();
		//testUtil.testWaitTwo();
		uLogoMyprofilePage.selectStartDate();
		testUtil.testWaitTwo();
		uLogoMyprofilePage.clickEndDateCalender();
		testUtil.testWaitTwo();
		uLogoMyprofilePage.selectEndDate();
		testUtil.testWaitTwo();
		testUtil.scrollDown();
		testUtil.testWaitTwo();
		uLogoMyprofilePage.enterProfile("Database administrator");
		testUtil.testWaitEight();
		uLogoMyprofilePage.selectProfile();
		testUtil.testWaitEight();
		testUtil.scrollDown();
		testUtil.testWaitTwo();
		uLogoMyprofilePage.clickSaveBtn();
		testUtil.testWaitEight();
		testUtil.scrollDown();
		testUtil.testWaitFour();
		//testUtil.scrollUp();
		//testUtil.testWaitTwo();
		//testUtil.scrollUp();
		//testUtil.testWaitTwo();
		//testUtil.scrollUp();
		//testUtil.testWaitTwo();
		//testUtil.scrollUp();
		//testUtil.testWaitTwo();
		//testUtil.scrollUp();
		//testUtil.testWaitTwo();
		//uLogoMyprofilePage.clickEditWorkExperience();
		//testUtil.testWaitFour();
		//testUtil.scrollDown();
		//testUtil.testWaitTwo();
		//testUtil.scrollDown();
		//testUtil.testWaitTwo();
		//testUtil.scrollDown();
		//testUtil.testWaitTwo();
		//testUtil.scrollDown();
		//testUtil.testWaitTwo();
		//uLogoMyprofilePage.deleteWorkExperience();
		//testUtil.testWaitFour();
		//uLogoMyprofilePage.clickDeleteWorkExperience();
		//testUtil.testWaitFour();
		//testUtil.scrollDown();
		//testUtil.testWaitTwo();
		//testUtil.scrollDown();
		//testUtil.testWaitTwo();
		//testUtil.scrollUp();
		//testUtil.testWaitFour();
		//Upload CV
		uLogoMyprofilePage.clickUploadCV();
		testUtil.testWaitFour();
		uLogoMyprofilePage.clickChooseFile();
		testUtil.testWaitFour();
		testUtil.uploadFile("D:\\CV Jort Zwolsman.doc");
		//testUtil.uploadFile("D:\\Voorbeeld CV PDF (1).pdf");
		testUtil.testWaitEight();
		uLogoMyprofilePage.clickUploadFile();
		testUtil.testWaitFour();
		uLogoMyprofilePage.clickUpdateMyProfile();
		testUtil.testWaitFourteen();
		//uLogoMyprofilePage.clickCancelUploadCV();
		//testUtil.testWaitFour();
		testUtil.scrollDown();
		testUtil.testWaitFour();
		testUtil.scrollUp();
		testUtil.testWaitFour();
		//Educations
		uLogoMyprofilePage.clickEducationsTab();
		testUtil.testWaitFour();
		testUtil.scrollDown();
		testUtil.testWaitFour();
		uLogoMyprofilePage.clickAddEducations();
		testUtil.testWaitFour();
		testUtil.scrollDown();
		testUtil.testWaitTwo();
		uLogoMyprofilePage.enterFieldOfStudy("Computer Science");
		testUtil.testWaitFour();
		uLogoMyprofilePage.clickEducationLevel();
		testUtil.testWaitTwo();
		uLogoMyprofilePage.selectEducationLevel();
		testUtil.testWaitTwo();
		uLogoMyprofilePage.clickEducationLevel();
		testUtil.testWaitTwo();
		uLogoMyprofilePage.clickStartingYear();
		testUtil.testWaitTwo();
		uLogoMyprofilePage.selectStartingYear();
		testUtil.testWaitTwo();
		uLogoMyprofilePage.clickStartingYear();
		testUtil.testWaitTwo();
		testUtil.scrollDown();
		testUtil.testWaitTwo();
		uLogoMyprofilePage.clickSaveBtnOne();
		testUtil.testWaitEight();
		testUtil.scrollUp();
		testUtil.testWaitTwo();
		testUtil.scrollUp();
		testUtil.testWaitFour();
		//uLogoMyprofilePage.clickEditEducations();
		//testUtil.testWaitTwo();
		//testUtil.scrollDown();
		//testUtil.testWaitTwo();
		//testUtil.scrollDown();
		//testUtil.testWaitFour();
		//uLogoMyprofilePage.clickDeleteEducations();
		//testUtil.testWaitFour();
		//uLogoMyprofilePage.clickConfirmDeleteEducations();
		//testUtil.testWaitEight();
		//testUtil.scrollDown();
		//testUtil.testWaitTwo();
		//Courses
		uLogoMyprofilePage.clickCoursesTab();
		testUtil.testWaitEight();
		testUtil.scrollDown();
		testUtil.testWaitFour();
		uLogoMyprofilePage.clickAddCourse();
		testUtil.testWaitFour();
		testUtil.scrollDown();
		testUtil.testWaitFour();
		uLogoMyprofilePage.enterCourse("Data Security");
		testUtil.testWaitTwo();
		uLogoMyprofilePage.enterDescriptionCourse("This is test data");
		testUtil.testWaitTwo();
		uLogoMyprofilePage.clickCompletedOnDateCourse();
		testUtil.testWaitFour();
		uLogoMyprofilePage.selectCompletedOnDateCourse();
		testUtil.testWaitTwo();
		//testUtil.scrollDown();
		//testUtil.testWaitTwo();
		uLogoMyprofilePage.clickSaveCourse();
		testUtil.testWaitEight();
		testUtil.scrollUp();
		testUtil.testWaitFour();
		testUtil.scrollUp();
		testUtil.testWaitFour();
		//testUtil.scrollDown();
		//testUtil.testWaitTwo();
		//uLogoMyprofilePage.clickEditCourse();
		//testUtil.testWaitFour();
		//testUtil.scrollDown();
		//testUtil.testWaitTwo();
		//testUtil.scrollDown();
		//testUtil.testWaitTwo();
		//uLogoMyprofilePage.clickDeleteCourse();
		//testUtil.testWaitFour();
		//uLogoMyprofilePage.clickConfirmDeleteCourse();
		//testUtil.testWaitFour();
		//testUtil.scrollDown();
		//testUtil.testWaitTwo();
		//testUtil.scrollDown();
		//testUtil.testWaitTwo();
		//testUtil.scrollUp();
		//testUtil.testWaitTwo();
		//testUtil.scrollUp();
		//testUtil.testWaitTwo();
		//Institutions Tab
		uLogoMyprofilePage.clickInstitutionsTab();
		testUtil.testWaitFour();
		testUtil.scrollDown();
		testUtil.testWaitTwo();
		testUtil.scrollDown();
		testUtil.testWaitTwo();
		testUtil.scrollUp();
		testUtil.testWaitTwo();
		testUtil.scrollUp();
		testUtil.testWaitFour();
		
	}
	
	@AfterMethod
	public void tearDown() {
		Driver.quit();
	}

}

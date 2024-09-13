package com.younited.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.younited.qa.base.TestBase;
import com.younited.qa.pages.HomePageAdmin;
import com.younited.qa.pages.LoginPage;
import com.younited.qa.pages.UlogoIntAddNewUserPage;
import com.younited.qa.pages.UlogoIntermediaryPage;

public class UlogoIntAddNewUserPageTest extends TestBase{
	
	LoginPage loginPage;
	HomePageAdmin homePageAdmin;
	UlogoIntermediaryPage uLogoIntermediaryPage;
	UlogoIntAddNewUserPage uLogoIntAddNewUserPage;
	
	
	public UlogoIntAddNewUserPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		
	}
	
	@Test
	public void test() {
		
	}
	
	@AfterMethod
	public void tearDown() {
		Driver.quit();
	}

}

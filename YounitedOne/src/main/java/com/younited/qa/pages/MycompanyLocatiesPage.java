package com.younited.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.younited.qa.base.TestBase;

public class MycompanyLocatiesPage extends TestBase{
	//Page factory OR Object Repository
	@FindBy(xpath="//nav[@class='nav nav-pills page-nav flex-column flex-md-row gap-10']//a[@class='nav-link']")
	WebElement companyDetails;
	
	@FindBy(xpath="//a[@class='router-link-active router-link-exact-active btn nav-link active']")
	WebElement locaties;
	
	//Initialization
	public MycompanyLocatiesPage() {
		PageFactory.initElements(Driver, this);
	}
	
	//Actions
	public void clickCompanyDetails() {
		companyDetails.click();
	}
	
	public void clickLocaties() {
		locaties.click();
	}
	

}

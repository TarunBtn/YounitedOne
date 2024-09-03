package com.younited.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.younited.qa.base.TestBase;

public class UlogoIntermediaryPage extends TestBase{
	//Page factory Or Object Repository
	@FindBy(xpath="//input[@id='filter-input']")
	WebElement companySearch;
	
	@FindBy(xpath="//a[@title='Voeg intermediair toe']")
	WebElement addIntermediary;
	
	@FindBy(xpath="//tbody/tr[1]/td[5]/div[1]/a[1]/span[1]")
	WebElement subCompanySymbol;
	
	@FindBy(xpath="//tbody/tr[1]/td[5]/div[1]/a[2]/span[1]")
	WebElement userSymbol;
	
	//Initialization
	

}

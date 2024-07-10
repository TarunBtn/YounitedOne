package com.younited.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.younited.qa.base.TestBase;

public class UlogoDeleteRequestsPage extends TestBase{
	
	//Pagefactory OR Object Repository
	@FindBy(xpath="//input[@id='filter-input']")
	WebElement searchRequest;
	
	@FindBy(xpath="//button[normalize-space()='Reset']")
	WebElement resetBtn;
	
	//Initialization
	public UlogoDeleteRequestsPage() {
		PageFactory.initElements(Driver, this);
	}
	
	//Actions
	public void enterSearchRequest(String request) {
		searchRequest.sendKeys(request);
	}
	
	public void clickResetBtn() {
		resetBtn.click();
	}

}

package com.younited.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.younited.qa.base.TestBase;

public class UlogoDasPlatformPage extends TestBase{
	
	//Page factory OR Object Repository
	
	@FindBy(xpath="/html/body/div[1]/main/div/div[2]/div/div[1]/div[1]/a")
	WebElement addNewDasPlatform;
	
	@FindBy(id="name")
	WebElement name;
	
	@FindBy(id="order")
	WebElement order;
	
	@FindBy(xpath="//*[@id=\"app\"]/main/div/div[2]/form/div[3]/div/a")
	WebElement clickCancel;
	
	//Initialization
	public UlogoDasPlatformPage() {
		PageFactory.initElements(Driver, this);
	}
	
	//Actions
	public void clickAddNewDasPlatform() {
		addNewDasPlatform.click();
	}
	
	public void enterName(String value) {
		name.sendKeys(value);
	}
	
	public void enterOrder(String value) {
		order.sendKeys(value);
	}
	
	public void clickCancel() {
		clickCancel.click();
	}
	
	
}

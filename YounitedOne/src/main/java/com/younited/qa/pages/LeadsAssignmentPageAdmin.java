package com.younited.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.younited.qa.base.TestBase;

public class LeadsAssignmentPageAdmin extends TestBase{
	//PageFactory Or Object Repository
	@FindBy(xpath="//button[@class='btn btn-primary d-block btn-gold']")
	WebElement addLead;
	
	@FindBy(xpath="//input[@id='lead_toggle']")
	WebElement addNewLead;
	
	@FindBy(xpath="//button[normalize-space()='Lead toevoegen']")
	WebElement firstName;
	
	@FindBy(xpath="//button[normalize-space()='Lead toevoegen']")
	WebElement middleName;
	
	@FindBy(xpath="//button[normalize-space()='Lead toevoegen']")
	WebElement lastName;
	
	@FindBy(xpath="//button[normalize-space()='Lead toevoegen']")
	WebElement emailID;
	
	@FindBy(xpath="//button[normalize-space()='Lead toevoegen']")
	WebElement origin;
	
	@FindBy(xpath="//option[@value='Event']")
	WebElement selectOrigin;
	
	@FindBy(xpath="//option[@value='Event']")
	WebElement saveBtn;
	
	@FindBy(xpath="LeadsAssignmentPageAdmin")
	WebElement cancelBtn;
	
	@FindBy(xpath="//button[@class='close']")
	WebElement closeSign;
	
	//Initialization
	public LeadsAssignmentPageAdmin() {
		PageFactory.initElements(Driver, this);
	}
	
	//Actions
	public void clickAddLead() {
		addLead.click();
	}
	
	public void clickAddNewLead() {
		addNewLead.click();
	}
	
	public void enterFirstName(String value) {
		firstName.sendKeys(value);
	}
	
	public void enterMiddleName(String value) {
		middleName.sendKeys(value);
	}
	
	public void enterLastName(String value) {
		lastName.sendKeys(value);
	}
	
	public void enterEmailID(String value) {
		emailID.sendKeys(value);
	}
	
	public void clickOriginDropDown() {
		origin.click();
	}
	
	public void selectOrigin() {
		selectOrigin.click();
	}
	
	public void clickSaveBtn() {
		saveBtn.click();
	}
	
	public void clickCancelBtn() {
		cancelBtn.click();
	}
	
	public void clickCloseSign() {
		closeSign.click();
	}
	

}

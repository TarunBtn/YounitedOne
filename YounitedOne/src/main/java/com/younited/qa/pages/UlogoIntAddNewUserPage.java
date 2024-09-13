package com.younited.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.younited.qa.base.TestBase;

public class UlogoIntAddNewUserPage extends TestBase{
	//Pagefactory OR Object Repository
	@FindBy(xpath="//input[@id='filter-input']")
	WebElement searchUser;
	
	@FindBy(xpath="//a[@class='btn btn-primary-outline mr-auto']")
	WebElement addUser;
	
	@FindBy(xpath="//a[@class='btn btn-primary-outline mr-auto']")
	WebElement emailAddress;
	
	@FindBy(xpath="//a[@class='btn btn-primary-outline mr-auto']")
	WebElement firstName;
	
	@FindBy(xpath="//a[@class='btn btn-primary-outline mr-auto']")
	WebElement lastName;
	
	@FindBy(xpath="//a[@class='btn btn-primary-outline mr-auto']")
	WebElement addUserBtn;
	
	@FindBy(xpath="//a[@class='btn btn-primary-outline mr-auto']")
	WebElement cancelBtn;
	
	//Initialization
	public UlogoIntAddNewUserPage() {
		PageFactory.initElements(Driver, this);
	}
	
	//Actions
	public void clickSearchUser() {
		searchUser.click();
	}
	
	public void enterSearchUser(String value) {
		searchUser.sendKeys(value);
	}
	
	public void clickAddUser() {
		addUser.click();
	}
	
	public void clickEmailAddress() {
		emailAddress.click();
	}
	
	public void enterEmailAddress(String value) {
		emailAddress.sendKeys(value);
	}
	
	public void enterFirstName(String value) {
		firstName.sendKeys(value);
	}
	
	
	

}

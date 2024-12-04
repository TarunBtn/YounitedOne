package com.younited.qa.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.younited.qa.base.TestBase;

public class UlogoIntAddNewUserPage extends TestBase{
	//Pagefactory OR Object Repository
			@FindBy(xpath="//input[@id='filter-input']")
			WebElement searchUser;
			
			@FindBy(xpath="//input[@id='filter-input']")
			WebElement cancelSearchUser;
			
			@FindBy(xpath="//a[@class='btn btn-primary-outline mr-auto']")
			WebElement addUser;
			
			@FindBy(xpath="//input[@class='simple-typeahead-input']")
			WebElement emailAddress;
			
			@FindBy(xpath="//input[@id='voornaam']")
			WebElement firstName;
			
			@FindBy(xpath="//input[@id='achternaam']")
			WebElement lastName;
			
			@FindBy(xpath="//button[@class='btn btn-primary btn-sm']")
			WebElement addUserBtn;
			
			@FindBy(xpath="//button[@class='btn btn-primary-outline btn-sm']")
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
			
			public void cancelSearchUser() {
				cancelSearchUser.click();
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
			
			public void selectEmailTooltip() {
				emailAddress.sendKeys(Keys.TAB);
			}
			
			public void enterFirstName(String value) {
				firstName.sendKeys(value);
			}
			
			public void enterLastName(String value) {
				lastName.sendKeys(value);
			}
			
			public void addUser() {
				addUserBtn.click();
			}
			
			public void clickCancelBtn() {
				cancelBtn.click();
			}
	

}

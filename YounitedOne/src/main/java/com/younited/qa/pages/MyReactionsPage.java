package com.younited.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.younited.qa.base.TestBase;

public class MyReactionsPage extends TestBase{
	//Page factory OR Object Repository
	@FindBy(xpath="//span[normalize-space()='chevron_left']")
	WebElement myReactionsPageLogo;
	
	@FindBy(xpath="//div[@aria-owns='listbox-initial-sort-select']//div[@class='multiselect__select']")
	WebElement companyDropDown;
	
	@FindBy(xpath="//span[contains(text(),'Soft Design B.V.')]")
	WebElement selectCompany;
	
	@FindBy(xpath="//div[@aria-owns='listbox-initial-sort-select2']//div[@class='multiselect__select']")
	WebElement roleDropDown;
	
	@FindBy(xpath="//*[@id=\"initial-sort-select2-2\"]/span/span")
	WebElement selectRole;
	
	//Initialization
	public MyReactionsPage () {
		PageFactory.initElements(Driver, this);
	}
	
	//Actions
	public void clickMyReactionsPageLogo() {
		myReactionsPageLogo.click();
	}
	
	public void clickCompanyDropDown() {
		companyDropDown.click();
	}
	
	public void selectCompany() {
		selectCompany.click();
	}
	
	public void clickRoleDropDown() {
		roleDropDown.click();
	}
	
	public void selectRole() {
		selectRole.click();
	}
	
	

}

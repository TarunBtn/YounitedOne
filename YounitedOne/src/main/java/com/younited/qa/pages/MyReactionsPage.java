package com.younited.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.younited.qa.base.TestBase;

public class MyReactionsPage extends TestBase{
	//Page factory OR Object Repository
	@FindBy(xpath="//span[normalize-space()='chevron_left']")
	WebElement myReactionsPageLogo;
	
	@FindBy(xpath="//*[@id=\"page-header\"]/div[2]/div[1]/div/div[2]/div/div[1]/div/div[1]")
	WebElement companyDropDown;
	
	@FindBy(xpath="//span[contains(text(),'Soft Design B.V.')]")
	WebElement selectCompany;
	
	@FindBy(xpath="//div[@class='multiselect--active multiselect inverted-width-select-menu fixed-width resolve-jump-issue custom-width-selectMenu visable-selected-option']//div[@class='multiselect__select']")
	WebElement roleDropDown;
	
	@FindBy(xpath="//span[@class='multiselect__option--highlight multiselect__option--selected multiselect__option']//span[contains(text(),'Software Design BV Test 01')]")
	WebElement selectRole;
	
	//Initialization
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

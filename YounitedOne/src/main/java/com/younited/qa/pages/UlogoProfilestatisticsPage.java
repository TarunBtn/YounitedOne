package com.younited.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.younited.qa.base.TestBase;

public class UlogoProfilestatisticsPage extends TestBase{
	//Page factory OR Object Repository
	@FindBy(id="initial-sort-select")
	WebElement roleDropDown;
	
	@FindBy(xpath="//*[@id=\"initial-sort-select\"]/option[2]")
	WebElement selectRole;
	
	@FindBy(xpath="//*[@id=\"initial-sort-select\"]/option[1]")
	WebElement resetRoleDropDown;
	
	@FindBy(id="filter-input")
	WebElement searchField;
	
	@FindBy(xpath="//*[@id=\"__BVID__18\"]/div/div/div")
	WebElement resetBtn;
	
	//Initialization
	public UlogoProfilestatisticsPage() {
		PageFactory.initElements(Driver, this);
	}
	
	//Actions
	public void clickRoleDropDown() {
		roleDropDown.click();
	}
	
	public void selectRole() {
		selectRole.click();
	}
	
	public void resetRoleDropDown() {
		resetRoleDropDown.click();
	}
	
	public void clickSearchField() {
		searchField.click();
	}
	
	public void enterValueSearchField(String value) {
		searchField.sendKeys(value);
	}
	
	public void clickResetBtn() {
		resetBtn.click();
	}
	
	
	

}

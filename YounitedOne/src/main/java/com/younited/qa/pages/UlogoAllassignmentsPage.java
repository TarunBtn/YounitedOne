package com.younited.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.younited.qa.base.TestBase;

public class UlogoAllassignmentsPage extends TestBase{
	//Pagefactory OR Object Repository
	@FindBy(id="filter-input")
	WebElement searchCompany;
	
	@FindBy(xpath="//button[@class='btn btn-secondary btn-primary common-reset-button']")
	WebElement resetBtn;
	
	@FindBy(xpath="//label[@class='ml-5 pl-3 mt-2']")
	WebElement exactSearch;
	
	@FindBy(xpath="/html/body/div[1]/div/span/div/main/span/div/div[2]/div/div[1]/div[3]/div/select")
	WebElement clickSelectFilterDropDown;
	
	@FindBy(xpath="//option[@value='Open']")
	WebElement selectFilterDropDown;
	
	@FindBy(xpath="/html/body/div[1]/div/span/div/main/span/div/div[2]/div/div[1]/div[4]/div/select")
	WebElement clickStatusDropDown;
	
	@FindBy(xpath="//option[@value='0']")
	WebElement selectStatus;
	
	
	//Initialization
	public UlogoAllassignmentsPage() {
		PageFactory.initElements(Driver, this);
	}
	
	//Actions
	public void enterSearchCompany(String value) {
		searchCompany.sendKeys(value);
	}
	
	public void clickResetCompany() {
		resetBtn.click();
	}
	
	public void clickExactSearch() {
		exactSearch.click();
	}
	
	public void clickFilterDropDown() {
		clickSelectFilterDropDown.click();
	}
	
	public void selectFilterDropDown() {
		selectFilterDropDown.click();
	}
	
	public void clickStatusDropDown() {
		clickStatusDropDown.click();
	}
	
	public void selectStatusDropDown() {
		selectStatus.click();
	}

}

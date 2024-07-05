package com.younited.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.younited.qa.base.TestBase;

public class UlogoStoresuppliersPage extends TestBase{
	//Pagefactory OR Object Repository
	@FindBy(xpath="//a[@class='btn btn-primary-outline mb-3 mb-lg-0']")
	WebElement addSupplier;
	
	@FindBy(xpath="//a[@class='mb-3 mb-lg-0 ml-md-3 btn btn-primary-outline']")
	WebElement productGroups;
	
	@FindBy(xpath="//input[@id='filter-input']")
	WebElement searchSupplier;
	
	@FindBy(xpath="//button[@class='btn btn-secondary btn-primary common-reset-button']")
	WebElement resetBtn;
	
	@FindBy(xpath="//input[@id='naam']")
	WebElement name;
	
	@FindBy(xpath="//input[@id='emailadres']")
	WebElement emailAddress;
	
	@FindBy(xpath="//input[@id='algemeneurl']")
	WebElement generalUrl;
	
	@FindBy(xpath="//button[normalize-space()='Gegevens opslaan']")
	WebElement saveBtn;
	
	@FindBy(xpath="//a[@class='btn btn-primary-outline']")
	WebElement cancelBtn;
	
	//Initialization
	public UlogoStoresuppliersPage() {
		PageFactory.initElements(Driver, this);
	}
	
	//Actions
	public void clickAddSupplierBtn() {
		addSupplier.click();
	}
	
	public void clickAddGroups() {
		productGroups.click();
	}
	
	public void clickSearchSupplier() {
		searchSupplier.click();
	}
	
	public void enterSearchSupplier(String supplierName) {
		searchSupplier.sendKeys(supplierName);
	}
	
	public void clickResetBtn() {
		resetBtn.click();
	}
	
	public void enterName(String sname) {
		name.sendKeys(sname);
	}
	
	public void enterEmailAddress(String emailid) {
		emailAddress.sendKeys(emailid);
	}
	
	public void enterGeneralUrl(String url) {
		generalUrl.sendKeys(url);
	}
	
	public void clickSaveBtn() {
		saveBtn.click();
	}
	
	public void clickCancelBtn() {
		cancelBtn.click();
	}

}

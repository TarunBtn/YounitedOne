package com.younited.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.younited.qa.base.TestBase;

public class UlogoIntermediaryPage extends TestBase{
	//Page factory Or Object Repository
	@FindBy(xpath="//input[@id='filter-input']")
	WebElement companySearch;
	
	@FindBy(xpath="//input[@id='filter-input']")
	WebElement companySearchCancel;
	
	@FindBy(xpath="//a[@title='Voeg intermediair toe']")
	WebElement addIntermediary;
	
	@FindBy(xpath="//tbody/tr[2]/td[5]/div[1]/a[1]/span[1]")
	WebElement subCompanySymbol;
	
	@FindBy(xpath="//tbody/tr[1]/td[5]/div[1]/a[2]/span[1]")
	WebElement userSymbol;
	
	@FindBy(xpath="//body/div[@id='app']/div/span/div[@id='app']/main/span/div[@class='componentTemplate']/div[@id='my-companies']/div[@class='container']/div[1]/a[1]")
	WebElement addNewCompany;
	
	//@FindBy(xpath="//a[@class='btn btn-primary-outline mr-auto']")
	//WebElement AddUserBtn;
	
	//@FindBy(xpath="//input[@id='filter-input']")
	//WebElement userSearch;
	
	
	//Initialization
	public UlogoIntermediaryPage() {
		PageFactory.initElements(Driver, this);
	}
	
	//Actions
	public void clickCompanySearch() {
		companySearch.click();
	}
	
	public void enterValueCompany(String value) {
		companySearch.sendKeys(value);
	}
	
	public void companySearchCancel() {
		//companySearchCancel.click();
		companySearchCancel.clear();
	}
	
	public void clickAddIntermediary() {
		addIntermediary.click();
	}
	
	public void clickSubCompanySymbol() {
		subCompanySymbol.click();
	}
	
	public void clickUserSymbol() {
		userSymbol.click();
	}
	
	public void clickAddNewCompany() {
		addNewCompany.click();
	}
	
	/*public void clickUserSearch() {
		userSearch.click();
	}
	
	public void enterValueUserSearch(String value) {
		userSearch.sendKeys(value);
	}
	
	public void clickAddUser() {
		AddUserBtn.click();
	}*/

}

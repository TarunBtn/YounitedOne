package com.younited.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.younited.qa.base.TestBase;

public class UlogoIntermediaryPage extends TestBase{
	//Page factory Or Object Repository
	@FindBy(xpath="//input[@id='filter-input']")
	WebElement companySearch;
	
	@FindBy(xpath="/html/body/div[2]/div/span/div/main/span/div/div[2]/div/div[1]/div[2]/div/div/input")
	WebElement companySearchCancel;
	
	@FindBy(xpath="//a[@title='Voeg intermediair toe']")
	WebElement addIntermediary;
	
	@FindBy(xpath="//tbody/tr[1]/td[5]/div[1]/a[1]/span[1]")
	WebElement subCompanySymbol;
	
	@FindBy(xpath="//tbody/tr[1]/td[5]/div[1]/a[2]/span[1]")
	WebElement userSymbol;
	
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
		companySearchCancel.click();
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
	

}

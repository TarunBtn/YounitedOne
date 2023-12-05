package com.younited.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.younited.qa.base.TestBase;

public class UlogoIntermediarycompaniesPage extends TestBase{
	//Pagefactory OR Object Repository
	@FindBy(id="filter-input")
	WebElement searchCompany;
	
	@FindBy(xpath="/html/body/div[1]/main/div/div[2]/div/div[1]/div[2]/div/div/input")
	WebElement cancelSearch;
	
	@FindBy(xpath="//*[@id=\"my-companies\"]/div/div[1]/div[1]/a")
	WebElement addNewCompany;
	
	@FindBy(xpath="/html/body/div[1]/main/div/div[2]/section/div/div/form/div[1]/div[2]/div/div[1]/input")
	WebElement companyName;
	
	@FindBy(xpath="/html/body/div[1]/main/div/div[2]/section/div/div/form/div[1]/div[2]/div/div[2]/a/div[2]/span/span")
	WebElement selectCompanyTooltip;
	
	@FindBy(xpath="//*[@id=\"general-company-edit\"]/form/div[7]/div[2]/div/div/div[1]")
	WebElement sectorDropDown;
	
	@FindBy(xpath="//*[@id=\"sector-1\"]/span/span")
	WebElement selectSector;
	
	@FindBy(id="websitelink")
	WebElement enterWebsite;
	
	@FindBy(xpath="//*[@id=\"general-company-edit\"]/form/div[18]/div/button")
	WebElement clickSaveBtn;
	
	@FindBy(xpath="/html/body/div[1]/main/div/div[2]/div/div[3]/div/table/tbody/tr[1]/td[4]/span/a[1]/span")
	WebElement clickEditSign;
	
	@FindBy(xpath="//*[@id=\"general-company-edit\"]/form/div[19]/div/button")
	WebElement clickEditSaveBtn;
	
	@FindBy(xpath="/html/body/div[1]/main/div/div[2]/div/div[3]/div/table/tbody/tr[1]/td[4]/span/a[2]/span")
	WebElement clickDeleteSign;
	
	@FindBy(xpath="//*[@id=\"remove_company\"]/div/div/div[3]/button[1]")
	WebElement clickDeleteCompany;
	
	//Initialization
	public UlogoIntermediarycompaniesPage() {
		PageFactory.initElements(Driver, this);
	}

	//Actions
	public void enterSearchCompany(String value) {
		searchCompany.sendKeys(value);
	}
	
	public void clickSearchCompany() {
		searchCompany.click();			
	}
	
	public void clickCancelSearch() {	
		cancelSearch.click();	
	}
	
	public void clickAddNewCompany() {
		addNewCompany.click();
	}
	
	public void enterCompanyName(String value) {
		companyName.sendKeys(value);
	}
	
	public void selectCompanyTooltip() {
		selectCompanyTooltip.click();
	}
	
	public void clickSectorDropDown() {
		sectorDropDown.click();
	}
	
	public void selectSector() {
		selectSector.click();
	}
		
	public void enterWebsite(String value) {
		enterWebsite.sendKeys(value);
	}
	
	public void clearWebsiteValue() {
		enterWebsite.clear();
	}
	
	public void clickSaveBtn() {
		clickSaveBtn.click();
	}
	
	public void clickEditBtn() {
		clickEditSign.click();
	}
	
	public void clearCompanyName(){
		companyName.clear();
	}

	public void clickSaveBtnEdit() {
		clickEditSaveBtn.click();
	}
	
	public void clickDeleteSign() {
		clickDeleteSign.click();
	}
	
	public void clickDeleteCompany() {
		clickDeleteCompany.click();
	}

}

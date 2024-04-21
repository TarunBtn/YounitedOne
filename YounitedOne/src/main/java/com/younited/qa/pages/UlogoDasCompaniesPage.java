package com.younited.qa.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.younited.qa.base.TestBase;

public class UlogoDasCompaniesPage extends TestBase{	
	//PageFactory OR Object Repository
	@FindBy(xpath="//*[@id=\"my-companies\"]/div/div[1]/div[1]/a")
	WebElement addNewCompany;
	
	@FindBy(id="dasgroup")
	WebElement clickDasGroupDropDown;
	
	@FindBy(xpath="//*[@id=\"dasgroup\"]/option[2]")
	WebElement selectDasGroupDropDown;
	
	@FindBy(id="bedrijfsnaam")
	WebElement companyNameField;
	
	@FindBy(xpath="/html/body/div[1]/main/div/div[2]/section/div/div/form/div[1]/div[2]/div/div[2]/a[3]/div[2]/span/span")
	WebElement companyNameToolTip;
	
	@FindBy(xpath="//div[@class='multiselect__select']")
	WebElement sectorDropDown;
	
	@FindBy(xpath="//span[contains(text(),'Agrarisch / Visserij')]")
	WebElement selectSectorDropDown;
	
	@FindBy(xpath="//a[@title='Annuleren']")
	WebElement clickCancel;
	
	
	//Initialization
	public UlogoDasCompaniesPage() {
		PageFactory.initElements(Driver, this);
	}
	
	//Actions
	public void clickAddNewCompany() {
		addNewCompany.click();
	}
	
	public void clickDasGroupDropDown() {
		clickDasGroupDropDown.click();
	}
	
	public void selectDasGroupFromDropDown() {
		selectDasGroupDropDown.click();
	}
	
	public void enterCompanyName(String value) {
		companyNameField.sendKeys(value);
	}
	
	public void selectCompanyNameToolTip() {
		//companyNameToolTip.click();
		companyNameField.sendKeys(Keys.TAB);
	}
	
	public void clickSectorDropDown() {
		sectorDropDown.click();
	}
	
	public void selectSectorDropDown() {
		selectSectorDropDown.click();
	}
	
	public void clickCancelBtn() {
		clickCancel.click();
	}

}

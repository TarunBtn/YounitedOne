package com.younited.qa.pages;

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
	
	@FindBy(xpath="/html/body/div[1]/main/div/div[2]/section/div/div/form/div[1]/div[2]/div/div[1]/input")
	WebElement companyNameField;
	
	@FindBy(xpath="/html/body/div[1]/main/div/div[2]/section/div/div/form/div[1]/div[2]/div/div[2]/a[3]/div[2]/span/span")
	WebElement companyNameToolTip;
	
	@FindBy(xpath="//*[@id=\"general-company-edit\"]/form/div[7]/div[2]/div/div/div[1]")
	WebElement sectorDropDown;
	
	@FindBy(xpath="//*[@id=\"sector-2\"]/span/span")
	WebElement selectSectorDropDown;
	
	@FindBy(xpath="//*[@id=\"general-company-edit\"]/form/div[18]/div/a")
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
		companyNameToolTip.click();
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

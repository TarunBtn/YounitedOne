package com.younited.qa.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.younited.qa.base.TestBase;

public class UlogoAddIntermediaryPage extends TestBase{
	//Pagefactory OR Object Repository
	@FindBy(xpath="//input[@id='bedrijfsnaam']")
	WebElement companyName;
	
	@FindBy(xpath="//span[@data-text='B&B Fabrics B.V.']")
	WebElement companyNameTooltip;
	
	@FindBy(xpath="//div[@class='col-md-7 col-lg-4']//div[@class='multiselect__select']")
	WebElement brandLabelDropDown;
	
	@FindBy(xpath="//span[contains(text(),'SMI | Medi Interim Powered by Younited®')]")
	WebElement selectBrandLabel;
	
	@FindBy(xpath="//select[@id='totaal_aantal_medewerkers']")
	WebElement employeeDropdown;
	
	@FindBy(xpath="//option[@id='51-100']")
	WebElement selectEmployee;
	
	@FindBy(xpath="//div[@class='col-md-7 col-lg-4 col-xl-3']//div[@class='multiselect__select']")
	WebElement sectorDropDown;
	
	@FindBy(xpath="//span[contains(text(),'Agrarisch / Visserij')]")
	WebElement selectSector;
	
	@FindBy(xpath="//button[normalize-space()='Bedrijf opslaan']")
	WebElement saveBtn;
	
	//Initialization
	public UlogoAddIntermediaryPage() {
		PageFactory.initElements(Driver, this);
	}
	
	//Actions
	public void clickCompanyName() {
		companyName.click();
	}
	
	public void enterCompanyName(String value) {
		companyName.sendKeys(value);
	}
	
	public void selectCompanyNameTooltip() {
		companyNameTooltip.click();
	}
	
	public void clickBrandLabelDropDown() {
		brandLabelDropDown.click();
	}
	
	public void selectBrandLabel() {
		selectBrandLabel.click();
	}
	
	public void clickEmployeeDropdown() {
		employeeDropdown.click();
	}
	
	public void selectEmployee() {
		selectEmployee.click();
	}
	
	public void clickSectorDropDown() {
		sectorDropDown.click();
	}
	
	public void selectSector() {
		selectSector.click();
	}
	
	public void clickSaveBtn() {
		saveBtn.click();
	}
	
	public void explicitWait() {
	    WebDriverWait wait = new WebDriverWait(Driver, Duration.ofSeconds(20));
	    WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'ASC | ASA Campus Powered by Younited®')]")));
	
	}
	
}

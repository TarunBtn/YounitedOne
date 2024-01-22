package com.younited.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.younited.qa.base.TestBase;

public class UlogoNativeAssignmentsPage extends TestBase{
	
	//Pagefactory OR Object Repository
	@FindBy(xpath="//input[@id='filter-input']")
	WebElement searchNativeAssignment;
	
	@FindBy(xpath="//button[@style='width: 100%;']")
	WebElement resetBtn;
	
	@FindBy(id="dropdown-uurtarief-btn")
	WebElement hourlyRate;
	
	@FindBy(xpath="//*[@id=\"dropdown-uurtarief\"]/div/form/div[1]/div/div[2]/div[4]/div[1]")
	WebElement selectHourlyRate;
	
	@FindBy(id="dropdown-uurtarief-apply")
	WebElement applyFilterHourlyRate;
	
	@FindBy(id="dropdown-uurtarief-reset")
	WebElement clearFilterHourlyRate;
	
	@FindBy(id="dropdown-uurtarief-cancel")
	WebElement clickCancelHourlyRate;
	
	@FindBy(xpath="//*[@id=\"my-companies\"]/div/div[3]/div[1]/div[2]/select")
	WebElement numberOfEntrepreneursDropDown;
	
	@FindBy(xpath="//*[@id=\"my-companies\"]/div/div[3]/div[1]/div[2]/select/option[3]")
	WebElement selectNumberOfEntrepreneurs;
	
	@FindBy(xpath="//*[@id=\"my-companies\"]/div/div[3]/div[1]/div[2]/select/option[1]")
	WebElement resetNumberOfEntrepreneurs;
	
	
	
	
	//Initialization
	public UlogoNativeAssignmentsPage() {
		PageFactory.initElements(Driver, this);
	}
	
	//Actions
	public void enterSearchAssignment(String value) {
		searchNativeAssignment.sendKeys(value);
	}
	
	public void clickResetSearchAssignment() {
		resetBtn.click();
	}
	
	public void clickHourlyRate() {
		hourlyRate.click();
	}
	
	public void selectHourlyRate() {
		selectHourlyRate.click();
	}
	
	public void clickApplyFilterHourlyRate() {
		applyFilterHourlyRate.click();
	}
	
	public void clickClearFilterHourlyRate() {
		clearFilterHourlyRate.click();
	}
	
	public void clickCancelHourlyRate() {
		clickCancelHourlyRate.click();
	}
	
	public void clickNumberOfEntrepreneurs() {
		numberOfEntrepreneursDropDown.click();
	}
	
	public void selectNumberOfEntrepreneurs() {
		selectNumberOfEntrepreneurs.click();
	}
	
	public void resetNumberOfEntrepreneurs() {
		resetNumberOfEntrepreneurs.click();
	}

}

package com.younited.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.younited.qa.base.TestBase;

public class UlogoDasAssignmentsPage extends TestBase{
	
	//Page factory OR Object Repository
	@FindBy(id="filter-input")
	WebElement searchByAssignment;
	
	@FindBy(xpath="//button[text()='Reset']")
	WebElement resetSearchByAssignment;
	
	@FindBy(xpath="/html/body/div[1]/div/div[1]/main/div/div[2]/div/div/div[2]/div/div/div[3]/fieldset[2]/div/div/input")
	WebElement searchByLocation;
	
	@FindBy(xpath="//*[@id=\"__BVID__851\"]/div/div/div/button")
	WebElement searchByLocationReset;
	
	@FindBy(id="dropdown-uurtarief-btn")
	WebElement clickHourlyRateDropDown;
	
	@FindBy(xpath="//*[@id=\"dropdown-uurtarief\"]/div/form/div[1]/div/div[2]/div[4]/div[1]")
	WebElement selectHourlyRate;
	
	@FindBy(id="dropdown-uurtarief-apply")
	WebElement clickApplyFilterHourlyRate;
	
	@FindBy(id="dropdown-uurtarief-reset")
	WebElement clickResetHourlyRate;
	
	@FindBy(id="dropdown-uurtarief-cancel")
	WebElement clickCancelHourlyRate;
	
	@FindBy(xpath="//*[@id=\"my-das-assignment\"]/div/div/div[2]/div/div/div[4]/div[1]/div[2]/select")
	WebElement numberOfEntrepreneurs;
	
	@FindBy(xpath="//*[@id=\"my-das-assignment\"]/div/div/div[2]/div/div/div[4]/div[1]/div[2]/select/option[3]")
	WebElement selectNumberOfEntrepreneurs;
	
	@FindBy(xpath="//*[@id=\"my-das-assignment\"]/div/div/div[2]/div/div/div[4]/div[1]/div[2]/select/option[1]")
	WebElement resetNumberOfEntrepreneurs;
	
	@FindBy(xpath="//*[@id=\"my-das-assignment\"]/div/div/div[2]/div/div/div[4]/div[1]/div[3]/label")
	WebElement Archive;
	
	@FindBy(xpath="//*[@id=\"my-das-assignment\"]/div/div/div[2]/div/div/div[4]/div[2]/div/select")
	WebElement sorting;
	
	@FindBy(xpath="//*[@id=\"my-das-assignment\"]/div/div/div[2]/div/div/div[4]/div[2]/div/select/option[1]")
	WebElement closingDateNew;
	
	@FindBy(xpath="//*[@id=\"my-das-assignment\"]/div/div/div[2]/div/div/div[4]/div[2]/div/select/option[2]")
	WebElement closingDateOld;
	
	@FindBy(xpath="//*[@id=\"my-das-assignment\"]/div/div/div[2]/div/div/div[4]/div[2]/div/select/option[3]")
	WebElement hourlyRateDesc;
	
	@FindBy(xpath="//*[@id=\"my-das-assignment\"]/div/div/div[2]/div/div/div[4]/div[2]/div/select/option[4]")
	WebElement hourlyRateRising;
	
	@FindBy(xpath="//*[@id=\"my-das-assignment\"]/div/div/div[2]/div/div/div[4]/div[2]/div/select/option[5]")
	WebElement numberRequestedDesc;
	
	@FindBy(xpath="//*[@id=\"my-das-assignment\"]/div/div/div[2]/div/div/div[4]/div[2]/div/select/option[6]")
	WebElement numberRequestedRising;
	
	
	
	//Initialization
	public UlogoDasAssignmentsPage() {	
	    PageFactory.initElements(Driver, this);
	
	}
	
	//Actions
	public void enterValueSearchByAssignment(String value) {
		searchByAssignment.sendKeys(value);
	}
	
	public void clickResetSearchByAssignment() {
		resetSearchByAssignment.click();
	}
	
	public void enterValueSearchByLocation(String value) {
		searchByLocation.sendKeys(value);
	}
	
	public void clickResetSearchByLocation() {
		searchByLocationReset.click();
	}
	
	public void clickHourlyRateDropDown() {
		clickHourlyRateDropDown.click();
	}
	
	public void selectHourlyRate() {
		selectHourlyRate.click();
	}
	
	public void clickApplyFilterHourlyRate() {
		clickApplyFilterHourlyRate.click();
	}
	
	public void clickResetHourlyRate() {
		clickResetHourlyRate.click();
	}
	
	public void clickCancelHourlyRate() {
		clickCancelHourlyRate.click();
	}
	
	public void clickNumberOfEntrePreneurs() {
		numberOfEntrepreneurs.click();
	}
	
	public void selectNumberOfEntrepreneurs() {
		selectNumberOfEntrepreneurs.click();
	}
	
	public void resetNumberOfEntrepreneurs() {
		resetNumberOfEntrepreneurs.click();
	}
	
	public void clickArchive() {
		Archive.click();
	}
	
	public void clickSorting() {
		sorting.click();
	}
	
	public void selectClosingDateNew() {
		closingDateNew.click();
	}
	
	public void selectClosingDateOld() {
		closingDateOld.click();
	}
	
	public void selectHourlyRateDesc() {
		hourlyRateDesc.click();
	}
	
	public void selectHourlyRateRising() {
		hourlyRateRising.click();
	}
	
	public void selectNumberRequestedDesc() {
		numberRequestedDesc.click();
	}
	
	public void selectNumberRequestedRising() {
		numberRequestedRising.click();
	}
	
	
}

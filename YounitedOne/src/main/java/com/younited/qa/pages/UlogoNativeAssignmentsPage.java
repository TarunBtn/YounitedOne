package com.younited.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

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
	
	@FindBy(xpath="//*[@id=\"dropdown-uurtarief-reset\"]/font/font")
	WebElement clearFilterHourlyRate;
	
	@FindBy(xpath="//*[@id=\"dropdown-uurtarief-cancel\"]/font/font")
	WebElement clickCancel;
	
	//Initialization
	
	

}

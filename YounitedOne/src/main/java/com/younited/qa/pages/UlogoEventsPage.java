package com.younited.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.younited.qa.base.TestBase;

public class UlogoEventsPage extends TestBase{
	
	//Pagefactory OR Object Repository
	@FindBy(xpath="//li[@class='breadcrumb-item active']")
	WebElement eventPageLogo;
	
	@FindBy(xpath="//a[@class='mb-3 mb-md-0 btn btn-primary-outline']")
	WebElement addNewEvent;
	
	@FindBy(xpath="//input[@id='filter-input']")
	WebElement searchEvent;
	
	@FindBy(xpath="//button[normalize-space()='Reset']")
	WebElement resetBtn;
	
	@FindBy(xpath="//input[@id='titel']")
	WebElement title;
	
	@FindBy(xpath="//div[@class='dp__input_wrap']//div//*[name()='svg']")
	WebElement dateField;
	
	@FindBy(xpath="//div[@class='dp__cell_inner dp__pointer dp__today dp__date_hover']")
	WebElement selectDate;
	
	@FindBy(xpath="//button[normalize-space()='Gegevens opslaan']")
	WebElement saveBtn;
	
	@FindBy(xpath="//a[@class='btn btn-primary-outline']")
	WebElement cancelBtn;
	
	//Initialization
	public UlogoEventsPage() {
		PageFactory.initElements(Driver, this);
	}
	
	//Actions
	public void clickEventPageLogo() {
		eventPageLogo.click();
	}
	
	public void enterSearchEvent(String event) {
		searchEvent.sendKeys(event);
	}
	
	public void clickResetBtn() {
		resetBtn.click();
	}
	
	public void clickAddNewEvent() {
		addNewEvent.click();
	}
	
	public void enterTitle(String titleValue) {
		title.sendKeys(titleValue);
	}
	
	public void clickDateField() {
		dateField.click();
	}
	
	public void selectDate() {
		selectDate.click();
	}
	
	public void clickSaveBtn() {
		saveBtn.click();
	}
	
	public void clickCancelBtn() {
		cancelBtn.click();
	}
	

}

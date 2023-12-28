package com.younited.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.younited.qa.base.TestBase;

public class UlogoDasGroupsPage extends TestBase{
	
	//Pagefactory OR Object Repository
	@FindBy(xpath="//*[@id=\"my-companies\"]/div/div[1]/div[1]/a")
	WebElement addNewDasGroup;
	
	@FindBy(id="dasgroup")
	WebElement clickDasPlatformDropDown;
	
	@FindBy(xpath="//*[@id=\"dasgroup\"]/option[5]")
	WebElement selectDasPlatformDropDown;
	
	@FindBy(id="name")
	WebElement nameDasGroup;
	
	@FindBy(id="order")
	WebElement orderDasGroup;
	
	@FindBy(xpath="//*[@id=\"app\"]/main/div/div[2]/form/div[4]/div/button")
	WebElement saveBtnDasGroup;
	
	@FindBy(xpath="//*[@id=\"app\"]/main/div/div[2]/form/div[4]/div/a")
	WebElement cancelDasGroup;
	
	//Initialization
	public UlogoDasGroupsPage() {
		PageFactory.initElements(Driver, this);
	}
	
	//Actions
	public void clickAddNewDasGroup() {
		addNewDasGroup.click();
	}
	
	public void clickDasPlatformDropDown() {
		clickDasPlatformDropDown.click();
	}
	
	public void selectDasPlatformDropDown() {
		selectDasPlatformDropDown.click();	
	}
	
	public void enterNameDasGroupPage(String value) {
		nameDasGroup.sendKeys(value);
	}
	
	public void enterOrderDasGroupPage(String value) {
		orderDasGroup.sendKeys(value);
	}
	
	public void clickSaveBtnDasGroupPage() {
		saveBtnDasGroup.click();
	}
	
	public void clickCancelBtnDasGroupPage() {
		cancelDasGroup.click();
	}
	
	
	

}

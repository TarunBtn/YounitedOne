package com.younited.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.younited.qa.base.TestBase;

public class UlogoStoreProductAddPage extends TestBase{
	
	//Pagefactory OR Object Repository
	@FindBy(xpath="//input[@id='naam']")
	WebElement name;
	
	@FindBy(xpath="//input[@id='subtitel']")
	WebElement subTitle;
	
	@FindBy(xpath="//button[normalize-space()='Productgroep opslaan']")
	WebElement saveBtn;
	
	@FindBy(xpath="//a[@class='btn btn-primary-outline']")
	WebElement cancelBtn;
	
	//Initialization
	public UlogoStoreProductAddPage() {
		PageFactory.initElements(Driver, this);
	}
	
	//Actions
	public void enterName(String group) {
		name.sendKeys(group);
	}
	
	public void enterSubTitle(String subtitle) {
		subTitle.sendKeys(subtitle);
	}
	
	public void clickSaveBtn() {
		saveBtn.click();
	}
	
	public void clickCancel() {
		cancelBtn.click();
	}

}

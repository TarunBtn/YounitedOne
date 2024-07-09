package com.younited.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.younited.qa.base.TestBase;

public class UlogoStoreProductGroupsPage extends TestBase{
	
	//Pagefactory OR Object Repository
	@FindBy(xpath="//li[@class='breadcrumb-item active']")
	WebElement storeProductsPageLogo;
	
	@FindBy(xpath="//a[@class='btn btn-primary-outline mb-3 mb-md-0']")
	WebElement addNewProduct;
	
	@FindBy(xpath="//input[@id='filter-input']")
	WebElement searchProductGroup;
	
	@FindBy(xpath="//button[normalize-space()='Reset']")
	WebElement resetBtn;
	
	//Initialization
	public UlogoStoreProductGroupsPage() {
		PageFactory.initElements(Driver, this);
	}
	
	//Actions
	public void clickAddNewProduct() {
		addNewProduct.click();
	}
	
	public void clickStoreProductsPageLogo() {
		storeProductsPageLogo.click();
	}
	
	public void clickSearchProductGroup() {
		searchProductGroup.click();
	}
	
	public void enterSearchProductGroup(String value) {
		searchProductGroup.sendKeys(value);
	}
	
	public void clickResetBtn() {
		resetBtn.click();
	}

}

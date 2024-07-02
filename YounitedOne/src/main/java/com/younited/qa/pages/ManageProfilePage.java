package com.younited.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.younited.qa.base.TestBase;

public class ManageProfilePage extends TestBase{
	
	//Pagefactory Or Object Repository
	@FindBy(xpath="//li[@class='breadcrumb-item active']")
	WebElement myProfilePageLogo;
	
	@FindBy(xpath="//button[@class='btn btn-gold ml-4']")
	WebElement editYourProfile;
	
	@FindBy(xpath="//a[@class='btn btn-primary-outline']")
	WebElement cancelBtn;
	
	@FindBy(xpath="//a[@title='Algemeen']")
	WebElement generalTab;
	
	@FindBy(xpath="//a[@title='Instellingen']")
	WebElement institutionsTab;
	
	//Initialization
	public ManageProfilePage() {
		PageFactory.initElements(Driver, this);
	}
	
	//Actions
	public void clickMyProfilePageLogo() {
		myProfilePageLogo.click();
	}
	
	public void clickEditYourProfileLink() {
		editYourProfile.click();
	}
	
	public void clickGeneralTab() {
		generalTab.click();
	}
	
	public void clickCancelBtn() {
		cancelBtn.click();
	}
	
	public void clickInstitutionsTab() {
		institutionsTab.click();
	}
	
	

}

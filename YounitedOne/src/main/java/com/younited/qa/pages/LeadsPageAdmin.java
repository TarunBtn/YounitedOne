package com.younited.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.younited.qa.base.TestBase;

public class LeadsPageAdmin extends TestBase{
	
	//Pagefactory OR Object Repository
	@FindBy(xpath="//span[@class='multiselect__single']")
	WebElement role;
	
	@FindBy(xpath="/html/body/div[2]/div/span/div/main/span/div/div[2]/div/div[1]/div[2]/div/div[1]/div/div[3]/ul/li[2]/span/span")
	WebElement selectRole;
	
	@FindBy(xpath="//div[@class='multiselect--active multiselect resolve-jump-issue']//div[@class='multiselect__select']")
	WebElement owner;
	
	@FindBy(xpath="//span[contains(text(),'Younited®')]")
	WebElement selectOwner;
	
	@FindBy(xpath="//input[@id='filter-input']")
	WebElement searchLead;
	
	@FindBy(xpath="//button[normalize-space()='Reset']")
	WebElement resetBtn;
	
	@FindBy(xpath="//a[@title='Voeg een nieuwe lead toe']")
	WebElement newLead;
	
	@FindBy(xpath="//select[@id='profiel.lead.rol']")
	WebElement roleAddLead;
	
	@FindBy(xpath="//option[@id='Freelancer']")
	WebElement selectRoleAddLead;
	
	@FindBy(xpath="//input[@id='profiel.lead.voornaam']")
	WebElement firstName;
	
	@FindBy(xpath="//input[@id='tussenvoegsel']")
	WebElement middleName;
	
	@FindBy(xpath="//input[@id='profiel.lead.achternaam']")
	WebElement lastName;
	
	@FindBy(xpath="//input[@id='profiel.lead.emailadres']")
	WebElement emailAddress;
	
	@FindBy(xpath="//select[@id='profiel.lead.herkomst']")
	WebElement origin;
	
	@FindBy(xpath="//option[@id='Event']")
	WebElement selectOrigin;
	
	@FindBy(xpath="//button[normalize-space()='Gegevens opslaan']")
	WebElement saveBtn;
	
	
	//Initialization
	public LeadsPageAdmin() {
		PageFactory.initElements(Driver, this);
	}
	
	//Actions
	public void clickRoleDropDown() {
		role.click();
	}
	
	public void selectRole() {
		selectRole.click();
	}
	
	public void enterLead(String value) {
		searchLead.sendKeys(value);
	}
	
	public void clickResetBtn() {
		resetBtn.click();
	}
	
	public void clickNewLeadAdd() {
		newLead.click();
	}
	
	public void clickRoleDropDownAddLead() {
		roleAddLead.click();
	}
	
	public void selectRoleDropDownAddLead() {
		selectRoleAddLead.click();
	}
	
	public void enterFirstName(String value) {
		firstName.sendKeys(value);
	}
	
	public void enterMiddleName(String value) {
		middleName.sendKeys(value);
	}
	
	public void enterLastName(String value) {
		lastName.sendKeys(value);
	}
	
	public void emailAddress(String value) {
		emailAddress.sendKeys(value);
	}
	
	public void clickOriginDropDown() {
		origin.click();
	}
	
	public void selectOrigin() {
		selectOrigin.click();
	}
	
	public void clickSaveBtn() {
		saveBtn.click();
	}
	

}

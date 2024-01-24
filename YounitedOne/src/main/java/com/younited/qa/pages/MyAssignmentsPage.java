package com.younited.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.younited.qa.base.TestBase;

public class MyAssignmentsPage extends TestBase{
	//Page factory or Object Repository
		@FindBy(xpath="//*[@id=\"page-header\"]/div[2]/div/div/div/div/a")
		WebElement addNewCommand;
			
		@FindBy(id="filter-input")
		WebElement filter;
			
		@FindBy(xpath="//button[normalize-space()='Reset']")
		WebElement resetFilter;
			
		@FindBy(xpath="//*[@id=\"initial-sort-select\"]")
		WebElement chooseCompanyDropDown;
			
		@FindBy(xpath="//option[text()='The Green Clean Company']")
		WebElement selectCompanyFromDropDown;
		
		@FindBy(xpath="//a[@href='/mijn-opdrachten/reacties/e1d8e64f-23c5-4719-ac61-eb72e9193f9d']")
		WebElement clickComments;
		
		@FindBy(xpath="document.querySelector(\"#my-companies > div > div > div > div > table > tbody > tr:nth-child(1)\")")
		WebElement scrollRight;
		
		@FindBy(xpath="//span[text()='thumb_up_off_alt']")
		WebElement clickStatusThumbsup;
		
		@FindBy(xpath="//*[@id=\"my-companies\"]/div/div/div/div[2]/div/div/div[1]/div[3]/div/div[1]")
		WebElement ownerDropDown;
			
		@FindBy(xpath="//*[@id=\"my-companies\"]/div/div/div/div[2]/div/div/div[1]/div[3]/div/div[3]/ul/li[2]/span")
		WebElement selectOwnerFromDropDown;
			
		@FindBy(xpath="//div[@class='ml-auto my-1 col-lg-3']//select[@id='initial-sort-select']")
		WebElement statusDropDown;
		
		@FindBy(xpath="//*[@id=\"my-companies\"]/div/div/div/div/table/tbody/tr[1]/td[1]/label/input")
		WebElement selectEntrepreneurCheckbox;
		
		@FindBy(id="statuses")
		WebElement statusEntrepreneurDropDown;
		
		@FindBy(xpath="//*[@id=\"statuses\"]/option[2]")
		WebElement selectStatusEntrepreneur;
		
		@FindBy(id="change-status")
		WebElement updateStatusEntrepreneur;
		
		@FindBy(xpath="//*[@id=\"navigation\"]/div/div/nav[1]/a[2]")
		WebElement newTab;
		
		@FindBy(xpath="//*[@id=\"navigation\"]/div/div/nav[1]/a[3]")
		WebElement pendingTab;
			
		@FindBy(xpath="//option[@value='Open']")
		WebElement selectStatusFromDropDownOpen;
		
		@FindBy(xpath="//*[@id=\"initial-sort-select\"]/option[4]")
		WebElement selectStatusFromDropDownClosed;
		
		@FindBy(xpath="/html/body/div[1]/main/div/div[2]/div/div/div/div/div/div/div[1]/div[3]/select/option[1]")
		WebElement clearStatusFromDropDown;
			
			
			
		//Initialization
		public MyAssignmentsPage() {
			PageFactory.initElements(Driver, this);
		}
			
		//Actions
		public void enterValueInFilter(String value) {
			filter.sendKeys(value);
		}
			
		public void clickResetFilter() {
			resetFilter.click();
		}
			
		public void clickChooseCompanyDropDown() {
			chooseCompanyDropDown.click();		
		}
			
		public void selectCompanyFromDropDown() {
			selectCompanyFromDropDown.click();
		}
		
		public void clickCommentsLink() {
			clickComments.click();
		}
		
		public void clickScrollRight() {
			scrollRight.click();
			//JavascriptExecutor js=(JavascriptExecutor)Driver;
			//Object document;
			//js.executeScript(Driver.findElement(By.cssSelector("#my-companies > div > div > div > div > table > tbody > tr:nth-child(1)"))).scrollLeft=300;  
		}
		
		public void clickStatusThumbsup() {
			clickStatusThumbsup.click();
		}
		
		public void clickEntrepreneurCheckbox() {
			selectEntrepreneurCheckbox.click();
		}
		
		public void clickEntrepreneurDropDown() {
			statusEntrepreneurDropDown.click();
		}
		
		public void selectStatusEntrepreneur() {
			selectStatusEntrepreneur.click();
		}
		
		public void updateStatusEntrepreneur() {
			updateStatusEntrepreneur.click();
		}
		
		public void clickNewTab() {
			newTab.click();
		}
		
		public void clickPendingTab() {
			pendingTab.click();
		}
			
		public void selectOwner() {
			ownerDropDown.click();
			selectOwnerFromDropDown.click();
		}
			
		public void StatusDropDown() {
			statusDropDown.click();	
		}
			
		public void selectStatusFromDropDownOpen() {
			selectStatusFromDropDownOpen.click();
		}
		
		public void selectStatusFromDropDownClosed() {
			selectStatusFromDropDownClosed.click();
		}
		
		public void clearStatusFromDropDown() {
			clearStatusFromDropDown.click();
		}
			
		public AddCommandPage clickAddNewCommand() {
			addNewCommand.click();
			return new AddCommandPage();
		}

}

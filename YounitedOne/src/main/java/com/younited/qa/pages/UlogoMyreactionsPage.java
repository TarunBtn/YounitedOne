package com.younited.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.younited.qa.base.TestBase;

public class UlogoMyreactionsPage extends TestBase{
	//Page factory OR Object Repository
	@FindBy(xpath="//span[@class='fs-16']")
	WebElement suggestedResponses;
	
	@FindBy(id="reactions")
	WebElement myRunningReactions;
	
	@FindBy(id="reactionshistory")
	WebElement responseHistory;
	
	@FindBy(xpath="//button[@class='btn btn-secondary btn-sm reacties-sidebar-button close-button']")
	WebElement viewAssignment;
	
	//Initialization
	public UlogoMyreactionsPage() {
		PageFactory.initElements(Driver, this);
	}
	
	//Actions
	public void clickSuggestedResponses() {
		suggestedResponses.click();
	}
	
	public void clickMyRunningReactions() {
		myRunningReactions.click();
	}
	
	public void clickResponseHistory() {
		responseHistory.click();
	}
	
	public void clickViewAssignment() {
		viewAssignment.click();
	}

}

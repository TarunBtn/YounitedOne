package com.younited.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.younited.qa.base.TestBase;

public class MyReactionsPageFree extends TestBase{
	
	//PageFactory OR Object Repository
	@FindBy(xpath="//li[@class='breadcrumb-item active']")
	WebElement myReactionsPageLogo;
	
	@FindBy(xpath="//span[normalize-space()='Test 2']")
	WebElement assignmentLink;
	
	@FindBy(xpath="//div[@class='multiselect__select']")
	WebElement statusDropdown;
	
	@FindBy(xpath="//span[contains(text(),'Alle statussen')]")
	WebElement selectAllStatus;
	
	@FindBy(xpath="//span[contains(text(),'In behandeling')]")
	WebElement selectInTreatment;
	
	@FindBy(xpath="//span[contains(text(),'Op gesprek')]")
	WebElement selectOnInterview;
	
	@FindBy(xpath="//span[contains(text(),'Overeenkomst aanmelden')]")
	WebElement selectRegisterAgreement;
	
	@FindBy(xpath="//span[contains(text(),'Ingetrokken/afgewezen')]")
	WebElement selectWithdrawnRejected;
	
	//Initialization
	public MyReactionsPageFree() {
		PageFactory.initElements(Driver, this);
	}
	
	//Actions
	public void clickMyReactionsPageLogo() {
		myReactionsPageLogo.click();
	}
	
	public void clickAssignmentLink() {
		assignmentLink.click();
	}
	
	public void clickStatusDropDown() {
		statusDropdown.click();
	}
	
	public void selectAllStatus() {
		selectAllStatus.click();
	}
	
    public void selectInTreatment() {
		selectInTreatment.click();
	}

    public void selectOnInterview() {
        selectOnInterview.click();	
    }

    public void selectRegisterAgreement() {
	    selectRegisterAgreement.click();
    }
    
    public void selectWithdrawnRejected() {
    	selectWithdrawnRejected.click();
    }

}

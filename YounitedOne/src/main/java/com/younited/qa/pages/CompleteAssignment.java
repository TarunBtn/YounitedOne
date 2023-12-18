package com.younited.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.younited.qa.base.TestBase;

public class CompleteAssignment extends TestBase{
	//Page factory or Object Repository
		@FindBy(id="selected_company")
		WebElement companyDropDown;
		
		@FindBy(xpath="//*[@id=\"selected_company\"]/option[3]")
		WebElement selectCompany;
		
		@FindBy(xpath="//*[@id=\"general-company-edit\"]/div/form/div[10]/div[2]/div/div[1]")
		WebElement sectorDropDown;
		
		@FindBy(xpath="//*[@id=\"sector-1\"]/span/span")
		WebElement sectorSelect;
		
		@FindBy(id="werklocatie")
		WebElement workLocation;
		
		@FindBy(xpath="//*[@id=\"general-company-edit\"]/div/form/div[12]/div[2]/div[2]")
		WebElement workLocationTooltip;
		
		@FindBy(xpath="//*[@id=\"general-company-edit\"]/div/form/div[6]/div[2]/div[1]/div/button[2]")
		WebElement generateDescription;
		
		@FindBy(xpath="//*[@id=\"chatGPT-module___BV_modal_body_\"]/div[2]/div[3]/div/div[2]/div")
		WebElement useThisText;
		
		@FindBy(xpath="/html/body/div[8]/div[1]/div/div/div/div[2]/div[3]/div/div[2]/div")
		WebElement useThisTextOne;
		
		@FindBy(id="startdatumopdracht")
		WebElement clickStartDateDropDown;
		
		@FindBy(xpath="//*[@id=\"assignment\"]/div[7]/div/div/div/div[1]/button[4]/i")
		WebElement selectStartYear;
		
		@FindBy(xpath="//*[@id=\"assignment\"]/div[7]/div/div/div/div[2]/table/tbody/tr[5]/td[4]/div")
		WebElement selectStartDate;
		
		@FindBy(id="einddatumopdracht")
		WebElement endDateDropDown;
		
		@FindBy(xpath="//*[@id=\"assignment\"]/div[7]/div/div/div/div[1]/button[3]/i")
		WebElement selectEndYear;
		
		@FindBy(xpath="//*[@id=\"assignment\"]/div[7]/div/div/div/div[2]/table/tbody/tr[5]/td[4]/div")
		WebElement selectEndDate;
		
		@FindBy(xpath="//*[@id=\"aantaluurperweek\"]/div/div[2]/div[2]/div[1]")
		WebElement numberOfHours;
		
		@FindBy(xpath="//*[@id=\"uurtarief\"]/div/div[4]/div[1]")
		WebElement hourlyRateFromTo;
		
		@FindBy(xpath="//*[@id=\"opleidingsniveau\"]")
		WebElement workingThinkingLevel;
		
		@FindBy(xpath="//*[@id=\"opleidingsniveau\"]/option[5]")
		WebElement selectWorkingThinkingLevel;
		
		@FindBy(xpath="//*[@id=\"general-company-edit\"]/div/form/div[24]/div/button[2]")
		WebElement clickSaveButton;
		
		@FindBy(xpath="//*[@id=\"general-company-edit\"]/div/form/div[20]/div[2]/div/div/div[1]")
		WebElement clickFieldOfExpertise;
			
		@FindBy(xpath="//*[@id=\"vakgebied-6\"]/span/span")
		WebElement selectFieldOfExpertise;
		
		@FindBy(xpath="/html/body/div[1]/main/div/div[2]/div/form/span[3]/div[2]/div/div[2]/div[1]/input")
		WebElement skillsField;
		
		@FindBy(xpath="/html/body/div[1]/main/div/div[2]/div/form/span[3]/div[2]/div/div[2]/div[2]/a[1]/div[2]/span/span")
		WebElement skillsFieldToolTip;
		
		@FindBy(xpath="//*[@id=\"general-company-edit\"]/div/form/span[3]/div[2]/div/form/div/div/div[2]/div[1]/label")
		WebElement unSelectSkillsOne;
		
		@FindBy(xpath="//*[@id=\"general-company-edit\"]/div/form/span[3]/div[2]/div/form/div/div/div[2]/div[2]/label")
		WebElement unSelectSkillsTwo;
		
		//Initialization
		public CompleteAssignment(){
			PageFactory.initElements(Driver, this);
		}
		
		//Actions
		public void clickCompanyDropDown() {
			companyDropDown.click();		
		}
		
		public void selectCompany() {
			selectCompany.click();
		}
		
		public void clickSectorDropDown() {
			sectorDropDown.click();
		}
		
		public void selectSectorFromDropDown() {
			sectorSelect.click();
		}
		
		public void selectWorkLocation() {
			workLocation.sendKeys("Punthorst, Netherlands");		
		}
		
		public void clickWorkLocationTooltip() {
			//workLocationTooltip.click();
		    Actions builder=new Actions(Driver);
		    builder.moveToElement(workLocationTooltip).build().perform();
			
		}
		
		public void clickGenerateDescription() {
			generateDescription.click();
		}
		
		public void clickUseThisText() {
			useThisText.click();
		}
		
		public void clickUseThisTextOne() {
			useThisTextOne.click();
		}
		
		public void clickStartDateDropDown() {
			clickStartDateDropDown.click();			
		}
		
		public void selectStartYear() {
			selectStartYear.click();
		}
		
		public void selectStartDate() {
			selectStartDate.click();
		} 
		
		public void clickEndDateDropDown() {
			endDateDropDown.click();
		}
		
		public void selectEndYear() {
			selectEndYear.click();
		}
		
		public void selectEndDate() {
			selectEndDate.click();
		}
		
		public void selectNumberOfHours() {
			numberOfHours.click();
		}
		
		public void selectHourlyRateFromTo() {
			hourlyRateFromTo.click();
		}
		
		public void selectWorkingThinkingLevel() {
			Select oSelect=new Select(workingThinkingLevel);
			oSelect.selectByIndex(4);
		}
		
		public void clickSaveButton() {
			clickSaveButton.click();
		}
		
		public void clickFieldOfExpertise() {
			clickFieldOfExpertise.click();
		}
		
		public void selectFieldOfExpertise() {
			selectFieldOfExpertise.click();	
		}
		
		public void clickSkillsField() {
			skillsField.click();
		}
		
		public void enterSkills(String value) {
			skillsField.sendKeys(value);
		}
		
		public void skillsToolTip() {
			skillsFieldToolTip.click();
		}
		
		public void unSelectSkillsOne() {
			unSelectSkillsOne.click();
		}
		
		public void unSelectSkillsTwo() {
			unSelectSkillsTwo.click();
		}
		
}

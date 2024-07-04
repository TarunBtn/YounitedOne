package com.younited.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.younited.qa.base.TestBase;

public class MycompanyPage extends TestBase{
	//Pagefactory OR Object Repository
	@FindBy(xpath="//tbody/tr[1]/td[2]/a[1]")
	WebElement locaties;
	
	//Initialization
	public MycompanyPage() {
		PageFactory.initElements(Driver, this);
	}
	
	//Actions
	public void clickLocaties() {
		locaties.click();
	}

}

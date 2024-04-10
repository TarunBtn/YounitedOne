package com.younited.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.younited.qa.base.TestBase;

public class HomePage extends TestBase{
	//Page factory or Object Repository
	@FindBy(xpath="//*[@id=\"main-nav\"]/nav/div/div[2]/a/img")
	WebElement userNameLabel;
		
	@FindBy(xpath="//*[@id=\"main-nav\"]/nav/div/a/img[1]")
	WebElement imageLogo;
		
	@FindBy(xpath="//li[@class='nav-item']//a[@href='/mijn-opdrachten/']")
	WebElement myAssignmentsLink;
		
	@FindBy(xpath="//a[@class='nav-link active']")
	WebElement dashboardLink;
		
	@FindBy(xpath="//*[@id=\"main-nav\"]/nav/div/div/div[2]/ul[1]/li[2]/a")
	WebElement matchLink;
		
	@FindBy(xpath="/html/body/div[3]/div[2]/div/div[2]/div[2]/div[2]/div[1]/button/span")
	WebElement acceptAllCookies;
		
	//Initialization
	public HomePage() {
		PageFactory.initElements(Driver, this);
	}
		
	//Actions
	public String verifyHomePageTitle() {
		return Driver.getTitle();
	}
		
	public boolean verifyImageLogo() {
		return imageLogo.isDisplayed();
	}
		
	public HomePageFree clickMatchLink() {
		matchLink.click();
		return new HomePageFree();
	}
		
	public MyAssignmentsPage clickMyAssignmentsLink() {
		myAssignmentsLink.click();
		return new MyAssignmentsPage();
	}
		
	public void clickAcceptAllCookies() {
		acceptAllCookies.click();
	}

}

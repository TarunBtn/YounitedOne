package com.younited.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.younited.qa.base.TestBase;

public class HomePageFree extends TestBase{
	//Page factory OR Object repository
		@FindBy(xpath="//*[@id=\"navbarSupportedContent\"]/ul/li[1]/a")
		WebElement dashboard;
			
		@FindBy(xpath="//a[@href='/opdrachten']")
		WebElement assignmentsLink;
			
		@FindBy(xpath="//button[@data-cookiefirst-button='primary']")
		WebElement acceptAllCookies;
		
		@FindBy(xpath="//span[@class='material-icons-outlined downArraow']")
		WebElement networkTab;
		
		@FindBy(xpath="//*[@id=\"navbarSupportedContent\"]/ul/li[3]/a/ul/li[1]/a")
		WebElement networkTooltip;
		
		@FindBy(xpath="//*[@id=\"navbarSupportedContent\"]/ul/li[3]/a/ul/li[2]/a")
		WebElement storeTooltip;
		
		@FindBy(xpath="//*[@id=\"navbarSupportedContent\"]/ul/li[4]/a")
		WebElement communityTab;
		
		@FindBy(xpath="//a[@href='/community-volgers']")
		WebElement entrepreneurTab;
		
		@FindBy(xpath="//a[@href='/bedrijven']")
		WebElement BusinessesTab;
		
		@FindBy(xpath="//*[@id=\"main-nav\"]/nav/div/div/div[1]/ul/li[4]/div/button/img")
		WebElement userLogo;
		
		@FindBy(xpath="//*[@id=\"main-nav\"]/nav/div/div/div[1]/ul/li[4]/div/div/div/div[1]/a")
		WebElement manageProfile;
		
		@FindBy(xpath="//*[@id=\"main-nav\"]/nav/div/a/img[1]")
		WebElement logoImage;
		
		@FindBy(xpath="//*[@id=\"lead-reaction-modal___BV_modal_body_\"]/div[2]/button")
		WebElement suitableAssignments;
		
			
		//Initialization
		public HomePageFree() {
			PageFactory.initElements(Driver, this);
		}
			
		//Actions
		public void suitableAssignments() {
			suitableAssignments.click();
		}
		
		public void clickDashboardTab() {
			dashboard.click();
		}
			
		public AssignmentsPageFree clickAssignmentsLink() {
			assignmentsLink.click();
			return new AssignmentsPageFree();
		}
			
		public void clickAcceptAllCookies() {
			acceptAllCookies.click();
		}
		
		public void clickNetworkTab() {
			networkTab.click();
		}
		
		public void clickNetworkTabTooltip() {
			networkTooltip.click();
		}
		
		public StorePageFree clickStoreTooltip() {
			storeTooltip.click();
			return new StorePageFree();
		}
		
		public CommunityPageFree clickCommunityTab() {
			communityTab.click();
			return new CommunityPageFree();
		}
		
		public EntrepreneursPageFree clickEntrepreneurTab() {
			entrepreneurTab.click();
			return new EntrepreneursPageFree();
		}
		
		public void clickBusinessesTab() {
			BusinessesTab.click();
		}
		
		public void clickUserLogo() {
			userLogo.click();
		}
		
		public void clickManageProfileTab() {
			manageProfile.click();
		}
		
		public void mouseHoverToLogoImage() {
			Actions builder=new Actions(Driver);
			builder.moveToElement(logoImage).build().perform();
		}

}

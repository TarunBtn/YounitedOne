package com.younited.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.younited.qa.base.TestBase;

public class HomePageAdmin extends TestBase{
	//Page factory OR Object repository
	@FindBy(xpath="//span[@class='d-flex']")
	WebElement assignmentsTab;
		
	@FindBy(xpath="//a[@href='/community']")
	WebElement communityTab;
		
	@FindBy(xpath="//a[@href='/ondernemer']")
	WebElement matchTab;
		
	@FindBy(xpath="/html/body/div[3]/div[2]/div/div[2]/div[2]/div[2]/div[1]/button/span")
	WebElement acceptAllCookies;
	
	@FindBy(xpath="//*[@id=\"main-nav\"]/nav/div/div/div[1]/ul/li[4]/div/button/img")
	WebElement userLogo;
	
	@FindBy(xpath="//*[@id=\"main-nav\"]/nav/div/div/div[1]/ul/li[4]/div/div/div/div[2]/ul/span[1]/li[1]/a")
	WebElement myDashboard;
	
	@FindBy(xpath="//*[@id=\"main-nav\"]/nav/div/div[3]/a")
	WebElement openMenu;
	
	@FindBy(xpath="//*[@id=\"sidebar-right\"]/div/div/button/i")
	WebElement closeMenu;
	
	@FindBy(xpath="//*[@id=\"sidebar-right\"]/div/div/div/a[2]")
	WebElement chatTab;
	
	@FindBy(xpath="//*[@id=\"modal-chat___BV_modal_body_\"]/button")
	WebElement chatClose;
	
	@FindBy(xpath="//*[@id=\"sidebar-right\"]/div/div/div/a[3]")
	WebElement myNotificationsTab;
	
	@FindBy(xpath="//*[@id=\"main-nav\"]/nav/div/div/div[1]/ul/li[4]/div/div/div/div[1]/a")
	WebElement myProfileTab;
	
	@FindBy(xpath="//*[@id=\"main-nav\"]/nav/div/div/div[1]/ul/li[4]/div/div/div/div[2]/ul/span[2]/li/a")
	WebElement myAssignmentsTab;
	
	@FindBy(xpath="//*[@id=\"main-nav\"]/nav/div/div/div[1]/ul/li[4]/div/button/img")
	WebElement logoImage;
	
	@FindBy(xpath="//*[@id=\"main-nav\"]/nav/div/div/div[1]/ul/li[4]/div/div/div/div[1]/img")
	WebElement userLogoPhoto;
	
	@FindBy(xpath="//*[@id=\"main-nav\"]/nav/div/div/div[1]/ul/li[4]/div/div/div/div[2]/ul/span[3]/li/a")
	WebElement myCompanyTab;
	
	@FindBy(xpath="//*[@id=\"main-nav\"]/nav/div/div/div[1]/ul/li[4]/div/div/div/div[2]/ul/span[4]/li[1]/a")
	WebElement myReactionsTab;
	
	@FindBy(xpath="//*[@id=\"main-nav\"]/nav/div/div/div[1]/ul/li[4]/div/div/div/div[2]/ul/span[5]/li/a")
	WebElement userManagementTab;
	
	@FindBy(xpath="//*[@id=\"main-nav\"]/nav/div/div/div[1]/ul/li[4]/div/div/div/div[2]/ul/span[6]/li/a")
	WebElement allCompanies;
	
	@FindBy(xpath="//*[@id=\"main-nav\"]/nav/div/div/div[1]/ul/li[4]/div/div/div/div[2]/ul/span[10]/li[1]/a")
	WebElement nativeCompany;
	
	@FindBy(xpath="//*[@id=\"main-nav\"]/nav/div/div/div[1]/ul/li[4]/div/div/div/div[2]/ul/span[7]/li/a")
	WebElement allAssignments;
	
	@FindBy(xpath="//*[@id=\"main-nav\"]/nav/div/div/div[1]/ul/li[4]/div/div/div/div[2]/ul/span[8]/li[1]/a")
	WebElement profileStatistics;
	
	@FindBy(xpath="//a[@href='/netive-opdrachten']")
	WebElement nativeAssignmentsTab;
	
		
	//Initialization
	public HomePageAdmin() {
		PageFactory.initElements(Driver, this);
	}
		
	//Actions
	public AssignmentsPageAdmin clickAssignmentsTab() {
		assignmentsTab.click();		
		return new AssignmentsPageAdmin();
	}
		
	public CommunityPageAdmin clickCommunityPageAdmin() {
		communityTab.click();		
		return new CommunityPageAdmin();
	}
		
	public MatchPageAdmin clickMatchTab() {
		matchTab.click();			
		return new MatchPageAdmin();
	}
		
	public void clickAcceptAllCookies() {
		acceptAllCookies.click();
	}
	
	public void clickUserLogo() {
		userLogo.click();
	}
	
	public void clickOpenMenu() {
		openMenu.click();
	}
	
	public void clickCloseMenu() {
		closeMenu.click();
	}
	
	public void clickMydashboardTab() {
		myDashboard.click();
	}
	
	public void clickChatTab() {
		chatTab.click();
	}
	
	public void clickChatCloseSign() {
		chatClose.click();
	}
	
	public void clickMynotificationsTab() {
		myNotificationsTab.click();
	}
	
	public void clickMyProfileTab() {
		myProfileTab.click();
	}
	
	public void clickMyAssignmentsTab() {
		myAssignmentsTab.click();
	}
	
	public void moveHoverTologoImage() {
		Actions builder=new Actions(Driver);
		builder.moveToElement(logoImage).build().perform();
	}
	
	public void clickMyCompanyTab() {
		myCompanyTab.click();
	}
	
	public void clickMyReactionsTab() {
		myReactionsTab.click();
	}
	
	public void clickUserManagementTab() {
		userManagementTab.click();
	}
	
	public void clickAllCompaniesTab() {
		allCompanies.click();			
	}
	
	public void clickNativeCompanyTab() {
		//nativeCompany.click();
		Driver.get("https://acc-freelancemarktplaats-mobility.azurewebsites.net/netive-bedrijven");
	}
	
	public void clickAllassignmentsTab() {
		allAssignments.click();
	}
	
	public void clickProfileStatistics() {
		profileStatistics.click();
	}
	
	public void clickUserLogoPhoto() {
		userLogoPhoto.click();
	}
	
	public void clickDasAssignmentOverviewTab() {
		Driver.get("https://acc-freelancemarktplaats-mobility.azurewebsites.net/das-opdrachten/");
	}
	
	public void clickDasPlatformTab() {
		Driver.get("https://acc-freelancemarktplaats-mobility.azurewebsites.net/das-platform/");
	}
	
	public void clickDasGroupsTab() {
		Driver.get("https://acc-freelancemarktplaats-mobility.azurewebsites.net/das-groep/");
	}
	
	public void clickDasCompaniesTab() {
		Driver.get("https://acc-freelancemarktplaats-mobility.azurewebsites.net/das-bedrijven/");
	}
	
	public void clickNativeAssignmentsTab() {
		nativeAssignmentsTab.click();
	}

}

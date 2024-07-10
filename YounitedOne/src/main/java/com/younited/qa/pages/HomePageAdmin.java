package com.younited.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.younited.qa.base.TestBase;

public class HomePageAdmin extends TestBase{
	//Page factory OR Object repository
			@FindBy(xpath="//*[@id=\"main-nav\"]/nav/div/div/div[2]/ul[1]/li[2]/a/span")
			WebElement assignmentsTab;
						
			@FindBy(xpath="//a[@class='nav-link'][normalize-space()='Community']")
			WebElement communityTab;
						
			@FindBy(xpath="//*[@id=\"main-nav\"]/nav/div/div/div[2]/ul[1]/li[4]/a")
			WebElement matchTab;
						
			@FindBy(xpath="/html/body/div[3]/div[2]/div/div[2]/div[2]/div[2]/div[1]/button/span")
			WebElement acceptAllCookies;
					
			@FindBy(xpath="//img[@class='profile-img']")
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
					
			@FindBy(xpath="//a[@class='manage-profile-button flex-grow-1']")
			WebElement myProfileTab;
					
			@FindBy(xpath="//a[normalize-space()='Mijn opdrachten']")
			WebElement myAssignmentsTab;
					
			@FindBy(xpath="//*[@id=\"main-nav\"]/nav/div/div/div[1]/ul/li[4]/div/button/img")
			WebElement logoImage;
					
			@FindBy(xpath="//*[@id=\"main-nav\"]/nav/div/div/div[1]/ul/li[4]/div/div/div/div[1]/img")
			WebElement userLogoPhoto;
					
			@FindBy(xpath="//a[normalize-space()='Mijn bedrijf/bedrijven']")
			WebElement myCompanyTab;
					
			@FindBy(xpath="//a[normalize-space()='Mijn reacties']")
			WebElement myReactionsTab;
					
			@FindBy(xpath="//a[normalize-space()='Gebruikers']")
			WebElement userManagementTab;
					
			@FindBy(xpath="//a[normalize-space()='Bedrijven']")
			WebElement allCompanies;
					
			@FindBy(xpath="//a[@href='/netive-bedrijven']")
			WebElement nativeCompany;
					
			@FindBy(xpath="//a[normalize-space()='Opdrachten']")
			WebElement allAssignments;
					
			@FindBy(xpath="//a[normalize-space()='Profielstatistieken']")
			WebElement profileStatistics;
					
			@FindBy(xpath="//a[normalize-space()='Netive Opdrachten overzicht']")
			WebElement nativeAssignmentsTab;
			
			@FindBy(xpath="//a[normalize-space()='Store: leveranciers']")
			WebElement storeSuppliers;
			
			@FindBy(xpath="//a[normalize-space()='Store: producten']")
			WebElement storeProducts;
			
			@FindBy(xpath="//a[normalize-space()='Evenementen']")
			WebElement eventsTab;
			
			@FindBy(xpath="//p[normalize-space()='Verwijderverzoeken']")
			WebElement deleteRequestsBox;
			
			@FindBy(xpath="//a[@class='user-infoNav-item-link logout']//span[@class='material-icons'][normalize-space()='logout']")
			WebElement signOutLink;
			
			@FindBy(xpath="//button[@class='btn btn-primary btn btn-primary']")
			WebElement signOutBtn;
			
				
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
				//userManagementTab.click();
				Driver.get("https://acc-nox-freelancemarktplaats-mobility.azurewebsites.net/gebruikers");
			}
			
			public void clickAllCompaniesTab() {
				//allCompanies.click();	
				Driver.get("https://acc-nox-freelancemarktplaats-mobility.azurewebsites.net/alle-bedrijven");
			}
			
			public void clickNativeCompanyTab() {
				//nativeCompany.click();
				Driver.get("https://acc-nox-freelancemarktplaats-mobility.azurewebsites.net/netive-bedrijven");
			}
			
			public void clickAllassignmentsTab() {
				//allAssignments.click();
				Driver.get("https://acc-nox-freelancemarktplaats-mobility.azurewebsites.net/alleopdrachten/");
			}
			
			public void clickProfileStatistics() {
				profileStatistics.click();
			}
			
			public void clickUserLogoPhoto() {
				userLogoPhoto.click();
			}
			
			public void clickDasAssignmentOverviewTab() {
				Driver.get("https://acc-nox-freelancemarktplaats-mobility.azurewebsites.net/das-opdrachten/");
			}
			
			public void clickDasPlatformTab() {
				Driver.get("https://acc-nox-freelancemarktplaats-mobility.azurewebsites.net/das-platform/");
			}
			
			public void clickDasGroupsTab() {
				Driver.get("https://acc-nox-freelancemarktplaats-mobility.azurewebsites.net/das-groep/");
			}
			
			public void clickDasCompaniesTab() {
				Driver.get("https://acc-nox-freelancemarktplaats-mobility.azurewebsites.net/das-bedrijven/");
			}
			
			public void clickNativeAssignmentsTab() {
				//nativeAssignmentsTab.click();
				Driver.get("https://acc-nox-freelancemarktplaats-mobility.azurewebsites.net/netive-opdrachten");
			}
			
			public void clickStoreSuppliersTab() {
				storeSuppliers.click();
			}
			
			public void clickStoreProductsTab() {
				storeProducts.click();
			}
			
			public void clickEventsTab() {
				eventsTab.click();
			}
			
			public void clickDeleteRequestsTab() {
				deleteRequestsBox.click();
			}
			
			public void clickSignOutLink() {
				signOutLink.click();
			}
			
			public void clickSignOutBtn() {
				signOutBtn.click();
			}

}

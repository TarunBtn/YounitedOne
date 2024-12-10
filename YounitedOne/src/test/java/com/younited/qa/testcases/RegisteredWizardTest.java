package com.younited.qa.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.younited.qa.base.TestBase;
import com.younited.qa.pages.LoginPage;
import com.younited.qa.pages.RegisteredWizard;
import com.younited.qa.util.TestUtil;

public class RegisteredWizardTest extends TestBase{
	
	LoginPage loginPage;
	RegisteredWizard registeredWizard;
	TestUtil testUtil;
	
	public RegisteredWizardTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp()throws Exception {
		initialization();
		loginPage=new LoginPage();
		registeredWizard=new RegisteredWizard();
		testUtil=new TestUtil();
				
	}
	
	@Test
	public void test()throws Exception {
		
		/*Driver.get("https://acc-nox-freelancemarktplaats-mobility.azurewebsites.net/");
		Thread.sleep(11000);
		Driver.findElement(By.id("username")).sendKeys("roshani.patel+acc_og@nowonlinetech.com");
		Thread.sleep(4000);
		Driver.findElement(By.id("password")).sendKeys("Tester01!");
		Thread.sleep(4000);
		Driver.findElement(By.name("action")).click();
		Thread.sleep(14000);*/
		
		Driver.get("https://acc-nox-freelancemarktplaats-mobility.azurewebsites.net/");
		Thread.sleep(11000);
		Driver.findElement(By.linkText("Sign up")).click();
		Thread.sleep(8000);
		Driver.findElement(By.id("email")).sendKeys("tarun.butani+btb@nowonlinetech.com");
		//Driver.findElement(By.xpath("//input[@id='username']")).sendKeys("roshani.patel+acc_og@nowonlinetech.com");
		Thread.sleep(4000);
		Driver.findElement(By.id("password")).sendKeys("Tester01!");
		Thread.sleep(4000);
		Driver.findElement(By.name("action")).click();
		//Driver.findElement(By.xpath("/html/body/div/main/section/div/div[2]/div/form/div[3]/button")).click();
		Thread.sleep(14000);
		Driver.findElement(By.name("privacy_policies_approval_checkbox")).click();
		Thread.sleep(4000);
		Driver.findElement(By.xpath("//button[@type='button']")).click();
		Thread.sleep(8000);
		//Accept Btn
		Driver.findElement(By.xpath("//button[text()='Accept']")).click();
		Thread.sleep(14000);
		//Click New wizard
		//Driver.findElement(By.xpath("//*[@id=\"login\"]/div[1]/section/div/div[2]/div[2]/a/div/h3")).click();
		//Thread.sleep(8000);
		//Select Ondernemer OR Enterpreneur
		Driver.findElement(By.xpath("//h5[text()='Zelfstandig ondernemer']")).click();
		Thread.sleep(4000);
		
		JavascriptExecutor jsx=(JavascriptExecutor)Driver;
		jsx.executeScript("window.scrollBy(0,450)");
		Thread.sleep(4000);
		//Select checkbox
		//Driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/span[1]/div[1]/div[1]/div[1]/div[1]/span[1]/div[2]/div[1]/div[1]/label[1]")).click();
		//Thread.sleep(4000);
		//Next
		Driver.findElement(By.xpath("//button[@class='btn btn-secondary btn-sm btn btn-primary next-btn']")).click();
		Thread.sleep(8000);
		//Enter name
		Driver.findElement(By.id("voornaam")).sendKeys("Ajayone");
		Thread.sleep(1000);
		Driver.findElement(By.id("tussenvoegsel")).sendKeys("B");
		Thread.sleep(1000);
		Driver.findElement(By.id("achternaam")).sendKeys("Patel");
		Thread.sleep(2000);
		JavascriptExecutor jsxone=(JavascriptExecutor)Driver;
		jsxone.executeScript("window.scrollBy(0,450)");
		Thread.sleep(2000);
		//Enter company
		Driver.findElement(By.xpath("//input[@id='profiel.lead.bedrijfsnaam']")).sendKeys("B.T HOOF");
		Thread.sleep(11000);
		Driver.findElement(By.xpath("//input[@id='profiel.lead.bedrijfsnaam']")).sendKeys(Keys.TAB);
		Thread.sleep(11000);
		//Next
		Driver.findElement(By.xpath("//button[@class='btn btn-secondary btn-sm btn btn-primary next-btn']")).click();
		Thread.sleep(11000);
		try {
		    Driver.navigate().refresh();
		    Thread.sleep(8000);
		}catch(NoSuchElementException e) {
			e.printStackTrace();
		}
		Thread.sleep(8000);
		//Next
		Driver.findElement(By.xpath("//button[@class='btn btn-secondary btn-sm btn btn-primary next-btn']")).click();
		Thread.sleep(8000);
		
		JavascriptExecutor jsxNine=(JavascriptExecutor)Driver;
		jsxNine.executeScript("window.scrollBy(0,450)");
		Thread.sleep(2000);
		
		//Upload file
		Driver.findElement(By.xpath("//span[@class='input-group-text btn btn-white justify-content-center w-auto']")).click();
		Thread.sleep(8000);
		registeredWizard.uploadFile("D:\\CV Jort Zwolsman.doc");
		//uploadFile("D:\\Mohsin Adahchour CV.pdf");
		Thread.sleep(14000);
		//Next
		Driver.findElement(By.xpath("//button[@class='btn btn-secondary btn-sm btn btn-primary next-btn']")).click();
		Thread.sleep(14000);
		//Scroll down
		JavascriptExecutor jsxtwo=(JavascriptExecutor)Driver;
		jsxtwo.executeScript("window.scrollBy(0,450)");
		Thread.sleep(2000);
		//Havo dropdown
		Driver.findElement(By.xpath("//select[@id='werkdenkniveau']")).click();
		Thread.sleep(2000);
		Driver.findElement(By.xpath("//option[@value='HAVO']")).click();
		Thread.sleep(2000);
		Driver.findElement(By.xpath("//select[@id='werkdenkniveau']")).click();
		Thread.sleep(2000);
		//Select field-Engineering
		Driver.findElement(By.xpath("//div[@class='multiselect__select']")).click();
		Thread.sleep(2000);
		Driver.findElement(By.xpath("//span[text()='Engineering']")).click();
		Thread.sleep(8000);
		//Click Next
		Driver.findElement(By.xpath("//button[@class='btn btn-secondary btn-sm btn btn-primary next-btn']")).click();
		Thread.sleep(8000);
		//Scroll down
		JavascriptExecutor jsxfour=(JavascriptExecutor)Driver;
		jsxfour.executeScript("window.scrollBy(0,450)");
		Thread.sleep(4000);
		//Click Next
		Driver.findElement(By.xpath("//button[@class='btn btn-secondary btn-sm btn btn-primary next-btn']")).click();
		Thread.sleep(8000);
		//Scroll down
		//JavascriptExecutor jsxfive=(JavascriptExecutor)Driver;
		//jsxfive.executeScript("window.scrollBy(0,450)");
		//Thread.sleep(4000);
		
		Driver.findElement(By.xpath("//button[@class='btn btn-secondary btn-sm btn btn-primary next-btn']")).click();
		Thread.sleep(4000);
		//Unselect from website
		Driver.findElement(By.xpath("//label[@for='ikwilmijngegevensdelenopyounitednl']")).click();
		Thread.sleep(2000);
		//Scroll down
		JavascriptExecutor jsxsix=(JavascriptExecutor)Driver;
		jsxsix.executeScript("window.scrollBy(0,450)");
		Thread.sleep(2000);
		//Select advertise from younited website
		Driver.findElement(By.xpath("//select[@class='form-control custom-select w-50 mb-4']")).click();
		Thread.sleep(2000);
		Driver.findElement(By.xpath("//option[@value='Via website Younited®']")).click();
		Thread.sleep(2000);
		Driver.findElement(By.xpath("//select[@class='form-control custom-select w-50 mb-4']")).click();
		Thread.sleep(2000);
		//Next
		Driver.findElement(By.xpath("//button[@class='btn btn-secondary btn-sm btn btn-primary next-btn']")).click();
		Thread.sleep(4000);
		//Next
		Driver.findElement(By.xpath("//button[@class='btn btn-secondary btn-sm btn btn-primary next-btn']")).click();
		Thread.sleep(8000);
		//Logout
		Driver.findElement(By.xpath("//a[@class='user-infoNav-item-link logout']//span[@class='material-icons'][normalize-space()='logout']")).click();
		Thread.sleep(11000);
		Driver.findElement(By.xpath("//button[@class='btn btn-primary btn btn-primary']")).click();
		Thread.sleep(14000);
		
		
	}
	
	@AfterMethod
	public void tearDown() {
		Driver.quit();
	}
	
	
	
	

}

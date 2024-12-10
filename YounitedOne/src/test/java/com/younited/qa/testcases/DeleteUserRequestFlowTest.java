package com.younited.qa.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.younited.qa.base.TestBase;
import com.younited.qa.pages.DeleteUserRequestFlow;
import com.younited.qa.pages.LoginPage;
import com.younited.qa.util.TestUtil;

public class DeleteUserRequestFlowTest extends TestBase{
	
	LoginPage loginPage;
	DeleteUserRequestFlow deleteUserRequestFlow;
	TestUtil testUtil;
	
	public DeleteUserRequestFlowTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp()throws Exception {
		initialization();
		loginPage=new LoginPage();
		deleteUserRequestFlow=new DeleteUserRequestFlow();
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
		Thread.sleep(8000);
		Driver.findElement(By.id("username")).sendKeys("tarun.butani+bt@nowonlinetech.com");
		Thread.sleep(4000);
		Driver.findElement(By.id("password")).sendKeys("Tester01!");
		Thread.sleep(8000);
		Driver.findElement(By.xpath("//button[@name='action']")).click();
		Thread.sleep(14000);
		try {
			Driver.findElement(By.xpath("//li[@id='splide01-slide01']//strong[contains(text(),'Doorgaan')]")).click();
			
		}catch(NoSuchElementException e) {
			e.printStackTrace();
		}
		testUtil.testWaitFourteen();
		testUtil.switchToWindow01();
		testUtil.testWaitFourteen();
		//Userlogo
		Driver.findElement(By.xpath("//img[@class='profile-img']")).click();
		Thread.sleep(14000);
		//Profile tab
		Driver.findElement(By.xpath("//a[@class='manage-profile-button flex-grow-1']")).click();
		Thread.sleep(14000);
		//Edit profile
		Driver.findElement(By.xpath("//button[@class='btn btn-gold ml-4']")).click();
		Thread.sleep(14000);
		//Institutions
		Driver.findElement(By.xpath("//a[7]")).click();
		Thread.sleep(14000);
		//Scroll down
		JavascriptExecutor jsx=(JavascriptExecutor)Driver;
		jsx.executeScript("window.scrollBy(0,450)");
		Thread.sleep(4000);
		JavascriptExecutor jsx02=(JavascriptExecutor)Driver;
		jsx02.executeScript("window.scrollBy(0,450)");
		Thread.sleep(4000);
		//Click Terminate
		Driver.findElement(By.xpath("//button[@class='btn btn-danger-outline']")).click();
		Thread.sleep(8000);
		//Terminate membership popup
		Driver.findElement(By.xpath("//button[@class='btn btn-primary btn btn-danger flex-fill']")).click();
		Thread.sleep(8000);
		//Signout
		Driver.findElement(By.xpath("//a[@class='user-infoNav-item-link logout']//span[@class='material-icons'][normalize-space()='logout']")).click();
		Thread.sleep(8000);
		Driver.findElement(By.xpath("//button[@class='btn btn-primary btn btn-primary']")).click();
		Thread.sleep(14000);
		
		//Login to Admin
		Driver.findElement(By.id("username")).clear();
		Thread.sleep(2000);
		Driver.findElement(By.id("username")).sendKeys("lb+acc-admin@nowonline.nl");
		Thread.sleep(2000);
		Driver.findElement(By.id("password")).sendKeys("Tester01!");
		Thread.sleep(4000);
		Driver.findElement(By.xpath("//button[@name='action']")).click();
		Thread.sleep(14000);
		//Removel request
		Driver.findElement(By.xpath("//p[normalize-space()='Verwijderverzoeken']")).click();
		Thread.sleep(14000);
		//Enter name search
		Driver.findElement(By.xpath("//input[@id='filter-input']")).click();
		Thread.sleep(2000);
		Driver.findElement(By.xpath("//input[@id='filter-input']")).sendKeys("Ajay");
		Thread.sleep(8000);
		//Click Delete symbol
		Driver.findElement(By.xpath("//span[normalize-space()='delete']")).click();
		Thread.sleep(8000);
		//Delete user
		Driver.findElement(By.xpath("//button[@class='btn btn-primary btn btn-danger flex-fill']")).click();
		Thread.sleep(11000);
		
		//Redirect to All company Page
		/*Driver.navigate().to("https://acc-nox-freelancemarktplaats-mobility.azurewebsites.net/alle-bedrijven");
		Thread.sleep(14000);
		Driver.findElement(By.xpath("//input[@id='filter-input']")).click();
		Thread.sleep(4000);
		Driver.findElement(By.xpath("//input[@id='filter-input']")).sendKeys("B.T HOOF");
		Thread.sleep(11000);
		//Click Delete symbol
		Driver.findElement(By.xpath("//tbody/tr[1]/td[8]/div[1]/a[4]/span[1]")).click();
		Thread.sleep(11000);
		Driver.findElement(By.xpath("//input[@id='deleteText']")).sendKeys("DELETE");
		Thread.sleep(8000);
		Driver.findElement(By.xpath("//button[@class='btn btn-danger d-block flex-fill']")).click();
		Thread.sleep(8000);*/
		//Signout
		Driver.findElement(By.xpath("//a[@class='user-infoNav-item-link logout']//span[@class='material-icons'][normalize-space()='logout']")).click();
		Thread.sleep(8000);
		Driver.findElement(By.xpath("//button[@class='btn btn-primary btn btn-primary']")).click();
		Thread.sleep(14000);
	}
	
	@AfterMethod
	public void tearDown() {
		Driver.quit();
	}

}

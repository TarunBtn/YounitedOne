package com.younited.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.younited.qa.util.TestUtil;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	
	public static WebDriver Driver;
	public static Properties prop;
	
	public TestBase() {
		try {
			prop=new Properties();
			FileInputStream ip=new FileInputStream("C:\\Users\\tbutani\\git\\YounitedOne\\YounitedOne\\src\\"
					+ "main\\java\\com\\younited\\qa\\config\\config.properties");
			prop.load(ip);
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public void initialization()throws Exception {
		String browserName=prop.getProperty("browser");
		if(browserName.equals("chrome")) {
			//WebDriverManager.chromedriver().setup();
			/*ChromeOptions options = new ChromeOptions();
			options.addArguments("--headless");
			options.addArguments("--no-sandbox");
			options.addArguments("--disable-dev-shm-usage");
			options.addArguments("--disable-gpu");
			options.addArguments("--window-size=1920,1080");
			System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
			Driver=new ChromeDriver(options);*/
			System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
			Driver=new ChromeDriver();
			
		}else if(browserName.equals("FF")) {
			System.setProperty("webdriver.gecko.driver", "C:\\geckodriver\\geckodriver.exe");
			Driver=new FirefoxDriver();
			
		}
		
		//Driver=new ChromeDriver(options);
		Driver.manage().window().maximize();
		Driver.manage().deleteAllCookies();
		Driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		Driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		//Thread.sleep(2000);
		Driver.get(prop.getProperty("url"));
		//Thread.sleep(2000);	
				
	}

}

package com.younited.qa.util;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;

import com.younited.qa.base.TestBase;

public class TestUtil extends TestBase{
	
	public static long PAGE_LOAD_TIMEOUT = 20;
	public static long IMPLICIT_WAIT = 20;
	
	public void switchToFrameOne() {
		Driver.switchTo().frame("mainpanel");
	}
	
	public void switchToFrameTwo() {
		Driver.switchTo().frame("");
	}
	
	public void testWaitTwo()throws Exception {
		Thread.sleep(2000);
	}
	
	public void testWaitFour()throws Exception {
		Thread.sleep(4000);
	}
	
	public void testWaitEight()throws Exception {
		Thread.sleep(8000);
	}
	
	public void testWaitEleven()throws Exception {
		Thread.sleep(11000);
	}
	
	public void testWaitFourteen()throws Exception {
		Thread.sleep(14000);
	}
	
	public void scrollDown() {
		JavascriptExecutor jsxone=(JavascriptExecutor)Driver;
		jsxone.executeScript("window.scrollBy(0,450)");
	}
	
	public void scrollUp() {
		JavascriptExecutor jsxtwo=(JavascriptExecutor)Driver;
		jsxtwo.executeScript("window.scrollBy(0,-450)");
	}
	
	public void scrollRight() {
		JavascriptExecutor jsxfour=(JavascriptExecutor)Driver;
		jsxfour.executeScript("window.scrollBy(450,0)");
	}
	
	public void scrollLeft() {
		JavascriptExecutor jsxfive=(JavascriptExecutor)Driver;
		jsxfive.executeScript("window.scrollBy(-450,0)");
	}
	
	public void switchToWindow01() {
		Set<String> AllWindowHandles=Driver.getWindowHandles();
		String window01=(String)AllWindowHandles.toArray()[0];
		String window02=(String)AllWindowHandles.toArray()[1];
		
		Driver.switchTo().window(window01);
		
	}
	
	public void switchToWindow02() {
		Set<String> AllWindowHandles=Driver.getWindowHandles();
		String window01=(String)AllWindowHandles.toArray()[0];
		String window02=(String)AllWindowHandles.toArray()[1];
		
		Driver.switchTo().window(window02);
		
	}
	
	public void switchToWindow03() {
		Set<String> AllWindowHandles=Driver.getWindowHandles();
		String window01=(String)AllWindowHandles.toArray()[0];
		String window02=(String)AllWindowHandles.toArray()[1];
		String window03=(String)AllWindowHandles.toArray()[2];
		
		Driver.switchTo().window(window03);
		
	}
	
	public void switchToAlert() {
		Alert alert=Driver.switchTo().alert();
		
	}
	
	//Upload file
	public static void setClipboardData(String string) {
		//StringSelection is a class that can be used for copy and paste operations.
		   StringSelection stringSelection = new StringSelection(string);
		   Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
	}	
	public static void uploadFile(String fileLocation) {
        try {
        	//Setting clipboard with file location
            setClipboardData(fileLocation);
            //native key strokes for CTRL, V and ENTER keys
            Robot robot = new Robot();
	
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
        } catch (Exception exp) {
        	exp.printStackTrace();
        }
	
        
	}
	
	

}

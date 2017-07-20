package com.shopbox.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Aim43 {
	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.gecko.driver","F:/ff/geckodriver.exe");
		
		WebDriver driver= new FirefoxDriver();
	
		
//		driver.get("file:///F:/new/2pagesub.html");
	driver.get("https://accounts.google.com/SignUp?hl=en-GB");
	RemoteWebDriver r=(RemoteWebDriver)driver;
	
//	String s="(document.getElementById('t3').value='hhhh')";
//	
//	r.executeScript(s);
//	
//	String ss="(document.getElementById('t3').value='')";
//	r.executeScript(ss);
	
	String dd="(document.getElementById('submitbutton').click())";
	 r.executeScript(dd);
	
			
	
	
	
	
	}
}

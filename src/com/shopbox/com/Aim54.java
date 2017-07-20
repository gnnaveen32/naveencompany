package com.shopbox.com;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Aim54 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","F:/ff/geckodriver.exe");
		
	
	WebDriver driver=new FirefoxDriver();
	
	driver.get("https://www.naukri.com/");
	
	Set <String> j=driver.getWindowHandles();
	
	for (String string : j) {
		
	driver.switchTo().window(string);
	driver.getTitle();
	
	}
	
	driver.close();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}

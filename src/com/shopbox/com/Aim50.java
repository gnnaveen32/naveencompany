package com.shopbox.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class Aim50 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","F:/ff/geckodriver.exe");
		
	
		FirefoxProfile profile =new FirefoxProfile();
		
		String o="browser-helperapps-neverask-savetodisk";
		String v="application/zip";
		
		profile.setPreference(o, v);
		
		WebDriver driver=new FirefoxDriver(profile);
		
		driver.get("http://www.seleniumhq.org/download/");
		
		driver.findElement(By.id("close")).click();
		
		driver.findElement(By.xpath("//td[text()='Java']/..//a[text()='Download']")).click();
	
		  
	
	
	
	
	
	
	
	
	
	
	
	
	}
}

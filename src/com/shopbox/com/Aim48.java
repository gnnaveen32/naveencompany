package com.shopbox.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Aim48 {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.gecko.driver","F:/ff/geckodriver.exe");
		
		FirefoxDriver driver=new FirefoxDriver();
	
			driver.get("https://uploadfiles.io/");
		Thread.sleep(2000);
			
	driver.findElement(By.id("upload-window")).sendKeys("F:\\new\1.html");
		
		
		
		
		
	}
}

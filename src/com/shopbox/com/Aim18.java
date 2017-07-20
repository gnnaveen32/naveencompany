package com.shopbox.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Aim18 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","F:/ff/geckodriver.exe");
		
		FirefoxDriver driver= new FirefoxDriver();
	
			driver.get("https://www.google.co.in/?gws_rd=ssl");
			
	WebElement   o=driver.findElement(By.id("gb_70"));
		String v=o.getText();	
	
	System.out.println(v);
	
	System.out.println(v.length());
	
	}
}

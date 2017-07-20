package com.shopbox.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Loginpa {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","F:/ff/geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		
	driver.get("ecommerce");
	
	driver.findElement(By.linkText("login")).click();
	driver.findElement(By.id("edit5[-name")).sendKeys("admin");
	driver.findElement(By.id("edit5[-pass")).sendKeys("admin");
	driver.findElement(By.linkText("log[-out")).click();
	Thread.sleep(5550);
	
	driver.close();
	
	
	
	
	
	
	
	
	
	
	}
}

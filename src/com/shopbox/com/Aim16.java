package com.shopbox.com;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Aim16 {
		public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","F:/ff/geckodriver.exe");
			
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://accounts.google.com/SignUp?hl=en");
		driver.findElement(By.id("FirstName")).sendKeys("NAVEEN");
		
		driver.findElement(By.id("FirstName")).sendKeys(Keys.CONTROL+"a c");
		driver.findElement(By.id("LastName")).sendKeys(Keys.CONTROL+"V");
		
		
		
		driver.findElement(By.id("FirstName")).clear();
		driver.findElement(By.id("submitbutton")).sendKeys(Keys.ENTER);

		
		
		
		}
}

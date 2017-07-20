package com.shopbox.com;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.InvalidElementStateException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Aim42 {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","F:/ff/geckodriver.exe");

		FirefoxDriver driver= new FirefoxDriver();
	
		driver.get("file:///F:/new/2pagesub.html");
		
		WebElement ele=driver.findElement(By.id("t3"));
	
//		if(ele.isEnabled())
//		{
//			System.out.println("pass");
//			ele.sendKeys("ffff");
//		}
//		else
//		{
//			System.out.println("pass");
//				
//		}
//	
//	try {
////	
//		ele.sendKeys("ffff");
//		System.out.println("pass");
//	} catch (NoSuchElementException e) {
//		
//			System.out.println("fail");
//	}
//	InvalidElementStateException
		
	
boolean d=ele.isEnabled();
System.out.println(d);
	
	
	
	
	
	
	
	
	
	}
}

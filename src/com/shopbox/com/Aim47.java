package com.shopbox.com;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Aim47 {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","F:/ff/geckodriver.exe");
	
		FirefoxDriver driver=new FirefoxDriver();
	
		driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
		driver.findElement(By.id("loginbutton")).click();
		
//		Alert a=driver.switchTo().alert();
//		String h=a.getText();
//		System.out.println(h);
//		a.accept();
//		
		
		
		try {
			Alert d=driver.switchTo().alert();
			String h=d.getText();
			d.accept();
			System.out.println(h);
		} catch (NoAlertPresentException e) {
			
			System.out.println("DD");
		}
		
		
		
		
		
		
		
	}
}

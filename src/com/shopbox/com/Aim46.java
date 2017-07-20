package com.shopbox.com;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Aim46 {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","F:/ff/geckodriver.exe");

		FirefoxDriver driver= new FirefoxDriver();
		driver.get("https://www.makemytrip.com/flights");
		
		driver.findElement(By.id("hp-widget__depart")).click();
		
		
	driver.findElement(By.xpath("//span[text()='June']/../../..//a[text()='16']")).click();

		
		
		
	}
}
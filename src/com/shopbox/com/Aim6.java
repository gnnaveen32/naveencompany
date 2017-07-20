package com.shopbox.com;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Aim6 {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","F:/ff/geckodriver.exe");
		FirefoxDriver driver= new FirefoxDriver();
		
		driver.get("file://F:/new/2.html");
		
		driver.findElement(By.xpath("//a[@class='c1']")).click();
	}
}

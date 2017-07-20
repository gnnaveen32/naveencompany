package com.shopbox.com;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Aim8 {
	public static void Firefox()
	{
		String key="webdriver.gecko.driver";
		String value="F:/ff/geckodriver.exe";
		System.setProperty(key, value);
	}

	
	public static void main(String[] args) {
		
		Firefox();
		FirefoxDriver driver= new FirefoxDriver();
		driver.get("http://naveenkrishna:83/login.do");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input [@name='pwd']")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		
	}
}

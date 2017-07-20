package com.shopbox.com;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Aim14 {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","F:/ff/geckodriver.exe");
		
		FirefoxDriver driver= new FirefoxDriver();
		
		driver.get("http://naveenkrishna:83/login.do");
	driver.findElement(By.xpath("//input [@name='username']")).sendKeys("admin");
	driver.findElement(By.xpath("//input [@name='pwd']")).sendKeys("manager");
	driver.findElement(By.id("loginButton")).click();
	
	WebDriverWait wait=new WebDriverWait(driver,10);
	wait.until(ExpectedConditions.titleContains("naveenkrishna"));
	
	String title=driver.getTitle();
	System.out.println(title);
	
	
	
	}
}

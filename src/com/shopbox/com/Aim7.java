package com.shopbox.com;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Aim7 {
	
	public static void Firefox()
	{
		String key ="webdriver.gecko.driver";
		String value="F:/ff/geckodriver.exe";
		System.setProperty(key, value);
	}	
	public static void main(String[] args) throws InterruptedException {
		
	Firefox();
	FirefoxDriver driver= new FirefoxDriver();
	
	driver.get("file://F:/new/1.html");
	
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//input[@ type='text']")).sendKeys("naveen");
	
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//input [@type='password']")).sendKeys("vannn");
	
	driver.findElement(By.xpath("//input[@ type='text']")).clear();
	
	driver.findElement(By.xpath("//input [@type='password']")).clear();

	driver.findElement(By.xpath("//input [@value='login']")).click();
	
	}

}

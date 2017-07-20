package com.shopbox.com;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Aim4
{
public static void main(String[] args) {
	
	System.setProperty("webdriver.gecko.driver", "F:/ff/geckodriver.exe");

	FirefoxDriver driver= new FirefoxDriver();
	
	
	driver.get("file://F:/new/2.html");
	driver.findElement(By.tagName("a")).click();
	
	driver.navigate().back();
	driver.findElement(By.name("n1")).click();
	

	driver.navigate().back();
	driver.findElement(By.className("c1")).click();
	

	driver.navigate().back();
	driver.findElement(By.linkText("qspider")).click();
	driver.navigate().back();
	driver.findElement(By.partialLinkText("qsp")).click();
	
driver.quit();



}
}

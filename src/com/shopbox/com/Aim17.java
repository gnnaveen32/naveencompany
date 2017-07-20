package com.shopbox.com;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Aim17 {
public static void main(String[] args) {
	
	System.setProperty("webdriver.gecko.driver","F:/ff/geckodriver.exe");
	FirefoxDriver driver=new FirefoxDriver();
	driver.get("https://www.google.co.in/?gws_rd=ssl");
	driver.findElement(By.id("lst-ib")).sendKeys("food");
	//driver.findElement(By.id("gs_htif0")).sendKeys(Keys.CONTROL+"a"+Keys.DELETE);
	
	//driver.findElement(By.id("gs_htif0")).sendKeys(Keys.CONTROL+"a");
	
	//driver.findElement(By.id("gs_htif0")).sendKeys(Keys.BACK_SPACE);
	
	driver.findElement(By.id("lst-ib")).sendKeys(Keys.HOME+" "+Keys.DELETE);
	
	
	
}
}



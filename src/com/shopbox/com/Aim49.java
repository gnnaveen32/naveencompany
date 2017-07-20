package com.shopbox.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Aim49 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","F:/ff/geckodriver.exe");
		
		FirefoxDriver driver= new FirefoxDriver();
	
	
	driver.get("http://mrdoob.com/projects/chromeexperiments/google-sphere/");
WebElement y=		driver.findElement(By.xpath("//a[.='Video']"));
		y.click();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}

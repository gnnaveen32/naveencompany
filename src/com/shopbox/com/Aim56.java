package com.shopbox.com;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Aim56 {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.gecko.driver","F:/ff/geckodriver.exe");
		
		FirefoxDriver driver=new FirefoxDriver();
	
	driver.get("http://www.seleniumhq.org/download/");
	
	driver.findElement(By.partialLinkText("3.4.0")).click();
	Runtime.getRuntime().exec("file://F:/au.exe");
	
	
	
	
	
	
	}
}

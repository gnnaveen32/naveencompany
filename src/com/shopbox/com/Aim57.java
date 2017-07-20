package com.shopbox.com;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Aim57 {



	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.gecko.driver","F:/ff/geckodriver.exe");
		
		FirefoxDriver driver=new FirefoxDriver();
	
	driver.get("https://www.google.co.in/?gws_rd=ssl");
 driver.findElement(By.id("gs_htif0")).sendKeys(Keys.CONTROL+"P");
//	driver.getKeyboard().sendKeys(Keys.CONTROL+"P");
	Runtime.getRuntime().exec("F:\\PRINT.exe");
	
	
	
	
	
	
	
	
	
	
	}}

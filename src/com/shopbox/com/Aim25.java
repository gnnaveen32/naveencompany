package com.shopbox.com;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Aim25 {
	public static void main(String[] args) {
			System.setProperty("webdriver.gecko.driver","F:/ff/geckodriver.exe");
			
			FirefoxDriver driver= new FirefoxDriver();
			driver.get("https://www.google.co.in/?gws_rd=ssl");
			
			driver.findElement(By.id("gb_70")).submit();
			
			
	}

}

package com.shopbox.com;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Aim1 {
	
	public static void main(String[] args) {
		String key="webdriver.gecko.driver";
		String value="F:/ff/geckodriver.exe";
		System.setProperty(key, value);
		
		FirefoxDriver driver= new FirefoxDriver();
		driver.quit();
}
}
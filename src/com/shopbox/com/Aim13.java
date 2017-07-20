package com.shopbox.com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Aim13 {
			public static void main(String[] args) {
				System.setProperty("webdriver.gecko.driver","F:/ff/geckodriver.exe");
			
				FirefoxDriver driver=new FirefoxDriver();
				
				driver.manage().timeouts().implicitlyWait(11, TimeUnit.MINUTES);
				
				driver.get("http://naveenkrishna:83/login.do");
				driver.quit();
				
			}
}

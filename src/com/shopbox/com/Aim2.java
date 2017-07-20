package com.shopbox.com;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Aim2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","F:/ff/geckodriver.exe");
		
		FirefoxDriver driver= new FirefoxDriver();
		
		driver.get("https://www.google.co.in");
		
		Thread.sleep(2000);
		
		driver.navigate().to("https://www.gmail.com");
		
		driver.navigate().back();
		
		Thread.sleep(2000);
	
		driver.navigate().forward();
		
		Thread.sleep(2000);
		
		driver.navigate().refresh();
		Thread.sleep(5000);
		
		String title=driver.getTitle();
		System.out.println(title);
		String url=driver.getCurrentUrl();
		System.out.println(url);
		driver.quit();
	
	
	
	}

}

package com.shopbox.com;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Aim51 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","F:/ff/geckodriver.exe");
	
		WebDriver driver=new FirefoxDriver();
		
		String a=driver.getWindowHandle();
		
		System.out.println(a);
		driver.get("https://www.naukri.com/");
		
		
		Set<String> b=driver.getWindowHandles();
		
		for (String string : b) {
			System.out.println(string);
		}
	}
}

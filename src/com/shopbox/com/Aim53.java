package com.shopbox.com;

import java.util.Set;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Aim53 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","F:/ff/geckodriver.exe");
		
	
	WebDriver driver=new FirefoxDriver();
	
	driver.get("https://www.naukri.com/");
	
	Set <String>s= driver.getWindowHandles();
	
	for (String string : s) {
		
		driver.switchTo().window(string);		
		
		String sh=driver.getTitle();
		System.out.println(sh);
		driver.close();
		
	}
	
	}

}

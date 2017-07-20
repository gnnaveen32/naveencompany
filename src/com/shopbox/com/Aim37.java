package com.shopbox.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Aim37 {
	
		public static void testbrowser(WebDriver driver)
		{
			
		driver.get("https://www.google.co.in/?gws_rd=ssl");
		
		String t=driver.getTitle();
		System.out.println(t);
		
		String y=	driver.getCurrentUrl();
		System.out.println(y);

		driver.close();
		}

		public static void main(String[] args) {
			
			System.setProperty("webdriver.gecko.driver","F:/ff/geckodriver.exe");
			
		WebDriver driver=new FirefoxDriver();
		testbrowser(driver);
		
//		testbrowser(new ChromeDriver());
		
		
		}	
}

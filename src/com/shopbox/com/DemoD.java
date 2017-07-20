package com.shopbox.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class DemoD {

		public WebDriver driver;
		@Parameters({"browser"})
		@BeforeMethod
		public void precondition(String browser)
		{
			if(browser.equals("firefox"))
			{
	System.setProperty("webdriver.gecko.driver","F:/ff/geckodriver.exe");
			
				 driver=new FirefoxDriver();
			
			}
		}
}

package com.shopbox.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Script_2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","F:/ff/geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		
		driver.get("ecommerece");
		
		Loginpage_POM y=new Loginpage_POM (driver);
		
		y.clicklogin();
		y.SetUserName("admin");
		y.setpassword("admin");
		y.clicklogin();
		y.clicklogout();
		
	}
	
}

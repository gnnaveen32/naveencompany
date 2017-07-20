package com.shopbox.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

public class Loginpage4_1 {
	public static void main(String[] args) {
		WebDriver driver =new FirefoxDriver();
		
		driver.get("google.com");
		
		Loginpage4_1 i=new Loginpage4_1();
		
		PageFactory.initElements(driver, i);
//		i.clicklink();
	}
}

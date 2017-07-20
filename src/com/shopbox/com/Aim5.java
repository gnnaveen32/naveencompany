package com.shopbox.com;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Aim5 {
public static void main(String[] args) {
		
  System.setProperty("webdriver.gecko.driver", "F:/ff/geckodriver.exe");
	
  FirefoxDriver driver= new FirefoxDriver();
  
  driver.get("https://accounts.google.com/SignUp");
  
  driver.findElement(By.cssSelector("div[title='Gender']")).click();
  
}
}

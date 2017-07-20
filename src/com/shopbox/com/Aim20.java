package com.shopbox.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Aim20 {
			public static void main(String[] args) {
				
				System.setProperty("webdriver.gecko.driver","F:/ff/geckodriver.exe");
				
				FirefoxDriver driver= new FirefoxDriver();
			
			driver.get("http://naveenkrishna:83/login.do");
			
			String xp="//nobr[contains(text(),'v. 3.1')]";
			
			WebElement e=driver.findElement(By.xpath(xp));
			String text=e.getText();
			System.out.println(text);
				
				
			}
			
			}
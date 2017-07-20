package com.shopbox.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Aim28 {
			public static void main(String[] args) {
				
				System.setProperty("webdriver.gecko.driver","F:/ff/geckodriver.exe");
				
				FirefoxDriver driver= new FirefoxDriver();
				
				driver.get("file://F:/new/12.html");
				
				List<WebElement> links=driver.findElements(By.xpath("//input[@type='checkbox']"));
				
//				-
				
				for (WebElement chbox : links) {
					chbox.click();
				}
				
				for (int i =links.size()-1 ; i < links.size(); i--) {
									WebElement chbox=links.get(i);
				chbox.click();
				}
				
				
				for (int i = 0; i < links.size(); i++) {
					
					if(i==0 || i==links.size()-1)
					{
						WebElement chbox=links.get(i);
						chbox.click();
					}
					
					
					
				}
				
				
			}
}

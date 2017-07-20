package com.shopbox.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Aim32 {
		public static void main(String[] args) {
			System.setProperty("webdriver.gecko.driver","F:/ff/geckodriver.exe");
			
			FirefoxDriver driver= new FirefoxDriver();
			
			driver.get("file://F:/new/14.html");
			
					List<WebElement> a=driver.findElements(By.tagName("td"));
					
				for (int i = 0; i < a.size(); i++) {
					WebElement tr=a.get(i);
				          String rt=tr.getText();

				System.out.println(rt);
				}
				
				
				
		}
}

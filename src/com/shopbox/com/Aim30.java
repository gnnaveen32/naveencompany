package com.shopbox.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Aim30 {
			public static void main(String[] args) {
				System.setProperty("webdriver.gecko.driver","F:/ff/geckodriver.exe");
				
				FirefoxDriver driver= new FirefoxDriver();
			
				
				driver.get("file://F:/new/13.html");
				List<WebElement> link=driver.findElements(By.xpath("//table[@id='t1']//td[2]"));
				
				
				
				for (int i = 0; i < link.size(); i++) {
					String h=link.get(i).getText();
					
					System.out.println(h);
				}
				
				
				
				
				
				
				
				
			}
}

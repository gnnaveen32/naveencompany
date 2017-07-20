package com.shopbox.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Aim31 {
			public static void main(String[] args) {
				
				System.setProperty("webdriver.gecko.driver","F:/ff/geckodriver.exe");
				
				FirefoxDriver driver= new FirefoxDriver();
				
				driver.get("file://F:/new/14.html");
//				
//				WebElement td1=driver.findElement(By.tagName("td"));
//				
//				String  t1=td1.getText();
//				
//				System.out.println(t1);
			
			
			
			
			 WebElement element =driver.findElement(By.xpath("//tr[2]"));
			
			String d=element.getText();
			System.out.println(d);
			
			
			
			
			
			
			
			
			
			}
}

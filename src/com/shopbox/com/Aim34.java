package com.shopbox.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Aim34 {
		public static void main(String[] args) {
			
			
			System.setProperty("webdriver.gecko.driver","F:/ff/geckodriver.exe");
			
			FirefoxDriver driver= new FirefoxDriver();
			
			
			driver.get("file://F:/new/15.html");
				
						WebElement select=driver.findElement(By.id("month"));
		
						Select s =new Select(select);
						
						
						        List<WebElement> all=s.getOptions();   
						        int count=all.size();
						System.out.println(count);
						

						
						ArrayList<String> alltext=new ArrayList<String>();
						
						for (int i = 0; i < all.size(); i++) {
							String text=s.getOptions().get(i).getText();
							alltext.add(text);
						}
						
						Collections.sort(alltext);
						for (String v: alltext) {
							System.out.println(v);
						}
						
		
		}
}

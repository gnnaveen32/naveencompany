package com.shopbox.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Aim27 {
		public static void main(String[] args) {
			
			System.setProperty("webdriver.gecko.driver","F:/ff/geckodriver.exe");
			 
			FirefoxDriver driver= new FirefoxDriver();
			
			driver.get("File://F:/new/11.html");
			
			 List<WebElement> alllinks =driver.findElements(By.xpath("//a"));
			
							int size=alllinks.size();
							
							
				WebElement link=alllinks.get(0);
				
			
				for(int i=0;i<=size;i++)
				{
					WebElement  link1=alllinks.get(i);
					String text=link1.getText();
					System.out.println(text);
					
				}
				link.click();
				link.getText();
			driver.quit();
			
				
		}
}

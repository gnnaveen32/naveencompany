package com.shopbox.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Aim33 {
			public static void main(String[] args) {
				
				System.setProperty("webdriver.gecko.driver","F:/ff/geckodriver.exe");
				
				FirefoxDriver driver= new FirefoxDriver();
				
				driver.get("file://F:/new/15.html");
				
				WebElement listbox=driver.findElement(By.id("month"));
				
				Select select=new Select(listbox);
				
				select.selectByIndex(1);
				select.selectByValue("m");
				select.selectByVisibleText("jan");
				
				
				
				if(select.isMultiple()){
					select.deselectByIndex(1);
					select.deselectByValue("m");
					select .deselectByVisibleText("jan");
					
					select.deselectAll();
				}
				else
				{
					System.out.println("sorry not possible");
				}
				
				
				List<WebElement> alloptions=select.getOptions();
									int count=alloptions.size();
				
									System.out.println(count);
									
									
					
									for (int i = 0; i < count; i++) {
										String text=alloptions.get(i).getText();
										System.out.println(text);
										select.selectByIndex(i);
										
									}
									
									
									
									
									
			}
}

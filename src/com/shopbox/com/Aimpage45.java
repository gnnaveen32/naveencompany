package com.shopbox.com;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Aimpage45 {
		public static void main(String[] args) throws InterruptedException  {
			System.setProperty("webdriver.gecko.driver","F:/ff/geckodriver.exe");
			
			WebDriver driver= new FirefoxDriver();
		
			driver.get("https://news.google.com/");
			JavascriptExecutor j=(JavascriptExecutor)driver;
			
			//1)to scroll down
//		for (int i = 0; i <10; i++) {
//			j.executeScript("window.scrollBy(0,100)");
//			Thread.sleep(5000);
//		}

			
			
//			2)to scroll down to end
//			j.executeScript("window.scrollBy(0,document.body.scrollHeight)");
			
//			3)
//			j.executeScript("window.scrollBy(1,150)");
			
			WebElement t=driver.findElement(By.xpath("//span[contains(text(),'Entertainment')]"));
			int y=t.getLocation().getY();
			
			j.executeScript("window.scrollBy(0,"+y+")");
		}
		}

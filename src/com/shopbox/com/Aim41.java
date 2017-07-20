package com.shopbox.com;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Aim41 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","F:/ff/geckodriver.exe");
		
		FirefoxDriver driver= new FirefoxDriver();
	
		driver.get("file://F:/new/1page.html");
		
//		WebElement u=driver.findElement(By.id("f1"));
		
		driver.switchTo().frame(0);
//		driver.switchTo().frame(u);
//		driver.switchTo().frame("n1");
		driver.findElement(By.id("t2")).sendKeys("gggg");
			driver.switchTo().frame(0);
			driver.findElement(By.id("t3")).sendKeys("gggg");
			driver.switchTo().parentFrame();
				driver.switchTo().frame(1);
				driver.findElement(By.id("t4")).sendKeys("gggg");
		
		
//			driver.switchTo().defaultContent();
		
//		Thread.sleep(5000);
			driver.navigate().refresh();
//
			Thread.sleep(5000);
//				
			driver.findElement(By.id("t1")).sendKeys("gggg");
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}

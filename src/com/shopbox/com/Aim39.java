package com.shopbox.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Aim39 {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","F:/ff/geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
	
		driver.get("http://www.actimind.com/");
		WebElement menu=driver.findElement(By.xpath("//span[contains(text(),'Products & Services')]"));
		
					Actions actions=new Actions(driver);
					actions.moveToElement(menu).perform();
					Thread.sleep(5000);
					
					actions.click();
					
	
	
	
	
	
	
	
	
	
	
	
	}
}


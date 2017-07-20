package com.shopbox.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Aim40 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver","F:/ff/geckodriver.exe");
	
	FirefoxDriver driver= new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		WebElement link=driver.findElement(By.partialLinkText("Forgotten account?"));
		Actions action=new Actions(driver);
		Thread.sleep(5000);
		action.contextClick(link).sendKeys(link, "T").build().perform();
		





}
	
	
	
}

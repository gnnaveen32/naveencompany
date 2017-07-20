package com.shopbox.com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Aim24 {
			public static void main(String[] args) {
				
				System.setProperty("webdriver.gecko.driver","F:/ff/geckodriver.exe");
		
		FirefoxDriver driver= new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.google.co.in/?gws_rd=ssl");
		
		WebElement e=driver.findElement(By.id("gb_70"));
		
		String fontsize=e.getCssValue("font-size");
		System.out.println(fontsize);
		
		String fontcolour=e.getCssValue("color");
		System.out.println(fontcolour);
		
		
		
		String fonttype=e.getCssValue("font-family");
		System.out.println(fonttype);
			}
}

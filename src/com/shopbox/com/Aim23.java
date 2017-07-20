package com.shopbox.com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Aim23 {
			public static void main(String[] args) {
				
				System.setProperty("webdriver.gecko.driver","F:/ff/geckodriver.exe");
				
				FirefoxDriver driver= new FirefoxDriver();
				
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
				driver.get("https://www.google.co.in/?gws_rd=ssl");
				
				WebElement r=driver.findElement(By.id("gb_70"));
		boolean b=r.isEnabled();
			System.out.println(b);
			}
}

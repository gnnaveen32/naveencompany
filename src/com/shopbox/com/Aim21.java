package com.shopbox.com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Aim21 {
			public static void main(String[] args) {
				
				System.setProperty("webdriver.gecko.driver","F:/ff/geckodriver.exe");
				
				FirefoxDriver driver= new FirefoxDriver();
				
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				
				driver.get("http://naveenkrishna:83/login.do");
				
				driver.findElement(By.xpath("(//input [@class='textField'])[1]")).sendKeys("admin");
				driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
				WebElement w=driver.findElement(By.id("keepLoggedInCheckBox"));
				w.click();
				
				
				boolean a =w.isSelected();
				System.out.println(a);
				
//				if(w.isSelected())
//				{
//					System.out.println("yes");
//				}
//				else
//				{
//					System.out.println("no");
//				}
				
				
			}
}

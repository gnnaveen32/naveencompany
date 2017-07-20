package com.shopbox.com;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Aim19 {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","F:/ff/geckodriver.exe");

		FirefoxDriver driver= new FirefoxDriver();
		driver.get("https://accounts.google.com/SignUp");
		int x1=driver.findElement(By.id("FirstName")).getLocation().getX();
	int x2=driver.findElement(By.id("LastName")).getLocation().getX();
	System.out.println(x1);
	System.out.println(x2);
	if(x1==x2)
	{
		System.out.println("pass");
		
	}
	else
		
	{
		System.out.println("fail");
	}
	int x3=driver.findElement(By.id("FirstName")).getSize().getWidth();
	int x4=driver.findElement(By.id("LastName")).getSize().getWidth();
	System.out.println(x3);
	System.out.println(x4);
	
	if(x3==x4)
	{
		System.out.println("pass");
	}
	else
	{
		System.out.println("fail");
	}
	
	}

}

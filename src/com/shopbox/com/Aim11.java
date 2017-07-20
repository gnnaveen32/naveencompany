package com.shopbox.com;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Aim11 {
	public static void firefox()
	{
		String key="webdriver.gecko.driver";
		String value="F:/ff/geckodriver.exe";
	System.setProperty(key, value);	
	}
		
public static void main(String[] args) throws InterruptedException {
	firefox();
	FirefoxDriver driver= new FirefoxDriver();
	
	driver.get("http://naveenkrishna:83/login.do");
	String etitle="actTime_login";
	String atitle=driver.getTitle();
	
	if(atitle.equals(etitle))
	{
		System.out.println(true);
	}
	else
	{
		System.out.println(false);
	}
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
	driver.findElement(By.xpath("//input [@name='pwd']")).sendKeys("manager");
	driver.findElement(By.id("loginButton")).click();
	Thread.sleep(2200);
	
	
	
}









}

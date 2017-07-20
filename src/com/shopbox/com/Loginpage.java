package com.shopbox.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Loginpage {
		
	private WebElement e;
	
	public Loginpage(WebDriver driver)
	{
		e=driver.findElement(By.id("gb_70"));
		
	}
	
	public void clickLogin()
	{
	e.click();	
	}}
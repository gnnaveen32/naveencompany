package com.shopbox.com;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Aim45 {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","F:/ff/geckodriver.exe");
		
		WebDriver driver= new FirefoxDriver();
	
		driver.get("https://news.google.com/");
		JavascriptExecutor j=(JavascriptExecutor)driver;

		driver.get("http://opensource.demo.orangehrmlive.com/");
		driver.findElement(By.id("txtUsername")).sendKeys("admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin");
		driver.findElement(By.id("btnLogin")).click();
		
		WebElement welcome=driver.findElement(By.id("welcome"));
		j.executeScript("arg[0].click()",welcome);

			WebElement logout=driver.findElement(By.id("logout"));
			j.executeScript("arg[0].click()",logout);
	
	}
	
	
}
// j.executescript("document.getElementById('t1').vlaue='abc'");

//j.executescript("e.document.getElementById('t1');e.value='abc'");

//webelement e=driver.findElement(By.id("t1"));
//j.executescript("e=arguments[0];e.value='abc',e);

//webelement e=driver.findelement(by.id("t1"));
//j.executesript("arguments[0].value='abc'",e);

//String v="abc";
//webelement e=driver.findelement(by.xpath("//input[@id='t1']"));
//j.executescript("arguments[0].value=arguments[1]",e,v);
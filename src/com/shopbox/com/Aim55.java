package com.shopbox.com;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Aim55 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","F:/ff/geckodriver.exe");
		
	
	WebDriver driver=new FirefoxDriver();
	driver.get("https://accounts.google.com/signin/v2/sl/pwd?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
	
	driver.findElement(By.partialLinkText("Help")).click();
	
	Set <String> n=driver.getWindowHandles();
	for (String string : n) {
		
		driver.switchTo().window(string);
		
		System.out.println(n);
		
	}
	
	
	
	}
}

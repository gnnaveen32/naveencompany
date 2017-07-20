package com.shopbox.com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Frame {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver","F:/ff/geckodriver.exe");
	
	WebDriver driver= new FirefoxDriver();

	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.google.co.in/?gws_rd=ssl");
	
	Loginpage h=new Loginpage(driver);
	
	
	h.clickLogin();
	Thread.sleep(1000);
	driver.navigate().refresh();
	Thread.sleep(1000);
h.clickLogin();	
	
}
}

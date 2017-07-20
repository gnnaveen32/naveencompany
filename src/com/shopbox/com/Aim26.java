package com.shopbox.com;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Aim26 {
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.gecko.driver","F:/ff/geckodriver.exe");
		
		FirefoxDriver driver= new FirefoxDriver();
		
	driver.get("file://F:/new/11.html");
	
	       List<WebElement> alllinks= driver.findElementsByTagName("a");
	       
	      int linkcount= alllinks.size();
	      
	      System.out.println(linkcount);
	      
	      
	      WebElement link=alllinks.get(0);
	      
	      link.click();
	   	
	
	}

}

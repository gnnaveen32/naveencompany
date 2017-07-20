package com.shopbox.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Aim29 {
public static void main(String[] args) {
	
	System.setProperty("webdriver.gecko.driver","F:/ff/geckodriver.exe");
	
	FirefoxDriver driver= new FirefoxDriver();
	
	
	driver.get("https://www.google.co.in/search?q=google&oq=google&aqs=chrome..69i57j0l3j69i60l2.9366j0j8&sourceid=chrome&ie=UTF-8");
	
	
	driver.findElement(By.id("lst-ib")).sendKeys("india");

         List<WebElement> link= driver.findElements(By.xpath("//div[@class='sbqs_c']"));
         	
         int	j=link.size();
System.out.println(j);
				
						for (int i = 0; i < link.size(); i++) {
						
							WebElement  o=link.get(i);
									String p=o.getText();
							System.out.println(o);
							link.get(j-1).click();
							
						}
					



}
}

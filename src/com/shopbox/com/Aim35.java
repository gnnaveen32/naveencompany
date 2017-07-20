package com.shopbox.com;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Aim35 {
	public static void main(String[] args) {
		
		System.out.println("value to sreach");
		
		Scanner sc=new Scanner(System.in);
		
		String value=sc.next();
		
		System.out.println("searching ...");
		
		System.setProperty("webdriver.gecko.driver","F:/ff/geckodriver.exe");
		
		FirefoxDriver driver= new FirefoxDriver();
		
		driver.get("file://F:/new/15.html");
		
		WebElement listbox=driver.findElement(By.id("month"));
		
		Select ff=new Select(listbox);
		
			int	 found=0;
						List<WebElement> all=ff.getOptions();
						
			for(int i=0;i<ff.getOptions().size();i++)
			{
				
				String hh=ff.getOptions().get(i).getText();
			
				if(hh.equals(value))
						found++;
				}
			
			if(found==0)
			{
				System.out.println("option is not present");
			}
			else if(found==1)
			{
				System.out.println("option is present");
			}
			else
			{
				System.out.println("option is duplicate;countis ;s");
			}
	}

}

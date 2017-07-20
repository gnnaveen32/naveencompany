package com.shopbox.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
//public class Aim38
//{public static void main(String[] args) {
//	
//	System.setProperty("webdriver.gecko.driver","F:/ff/geckodriver.exe");
//	FirefoxDriver driver=new FirefoxDriver();
//					driver.get("file://F:/new/14.html");
//	List	<WebElement> o=driver.findElements(By.xpath(".//tr"));
//						for(int i=0;i<o.size();i++)
//				{
//					WebElement r=o.get(i);
//						List<WebElement> cell=r.findElements(By.xpath(".//td"));
//						for(int j=0;j<cell.size();j++)
//						{
//							String text=cell.get(j).getText();
//							System.out.println(text);}
//					System.out.println();
//				}}			}
//	
//				
				
				
				
//				
//
//public class Aim38
//{	public static void main(String[] args) {
//	System.setProperty("webdriver.gecko.driver","F:/ff/geckodriver.exe");
//	FirefoxDriver driver=new FirefoxDriver();
//	driver.get("file://F:/new/14.html");
//	List	<WebElement> o=driver.findElements(By.xpath(".//tr"));
//	for (WebElement webElement : o) {
//		
//		List<WebElement>allcell=webElement.findElements(By.xpath(".//td"));
//		
//		for (WebElement webElement2 : allcell) {
//			String text=webElement2.getText();
//			System.out.println(text);
//		}System.out.println();
//	}}}


public class Aim38
{	public static void main(String[] args) {
System.setProperty("webdriver.gecko.driver","F:/ff/geckodriver.exe");
	FirefoxDriver driver=new FirefoxDriver();
							driver.get("file://F:/new/14.html");
					int sum=0;
						List<WebElement> m=driver.findElements(By.xpath(".//td"));
				for (WebElement webElement : m) {
						String s=webElement.getText();
					try
					{
						int v=Integer.parseInt(s);
					System.out.println(v);
					sum=sum+v;
					}
					catch(NumberFormatException e){}
					System.out.println("sum is"+sum);}}}
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				

				
				
				
				













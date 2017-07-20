package com.shopbox.com;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Aim36 {
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.gecko.driver","F:/ff/geckodriver.exe");
			
			WebDriver driver;
			
			Action mouseov,mouseon,sendkeys,keysdown,doubleclk,contextclk,rels,keyup;
			Actions baction;
			
			
			driver=new FirefoxDriver();
			driver.get("https://www.google.co.in/search?q=java&oq=java&aqs=chrome..69i57j0l5.1485j0j7&sourceid=chrome&ie=UTF-8");
			baction=new Actions(driver);
			mouseov=baction.moveToElement(driver.findElement(By.id("lst-ib"))).build();
			
//			Thread.sleep(10000);
//			mouseon=baction.clickAndHold(driver.findElement(By.id("lst-ib"))).build();
//
//			Thread.sleep(10000);
//
//	Thread.sleep(10000);
//	rels=baction.release(driver.findElement(By.id("lst-ib"))).build();
//
//	Thread.sleep(10000);
//contextclk=baction.contextClick(driver.findElement(By.id("lst-ib"))).build();
//
//Thread.sleep(10000);
//	keyup=baction.keyDown("abar_button_opt",ENTER);

		//		keysdown=baction.keyDown(Keys.F5).build();
		
		
//		keysdown.perform();
//		keyup.perform();
//		rels.perform();
//		contextclk.perform();
//		mouseon.perform();
		mouseov.perform();
			
		}
}

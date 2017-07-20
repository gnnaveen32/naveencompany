package com.shopbox.com;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Aim12 {
	public static void firefox()
	{
		String key="webdriver.gecko.driver";
		String value="F:/ff/geckodriver.exe";
		System.setProperty(key, value);
	}
	
	public static void verifytitle(FirefoxDriver driver,String etitle)
	{

		String atitle=driver.getTitle();
		System.out.println("expected:"+etitle);
		System.out.println("actual:"+atitle);
		if(atitle.equals(etitle))
		{
			System.out.println(true);
		}
		else
		{	System.out.println(false);
		}}

		public static void main(String[] args) {
			firefox();
			FirefoxDriver driver= new FirefoxDriver();
			driver.get("http://naveenkrishna:83/login.do");
			verifytitle(driver,"actiTime_login");
		}









}
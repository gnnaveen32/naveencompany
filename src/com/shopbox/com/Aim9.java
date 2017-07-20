package com.shopbox.com;


import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Aim9 {

		public static void firefox()
		{
			String key="webdriver.gecko.driver";
			String value="F:/ff/geckodriver.exe";
			System.setProperty(key, value);
			
		}
		public static void main(String[] args) throws IOException {
			firefox();
			
			FirefoxDriver driver= new FirefoxDriver();
			
			driver.get("https://www.google.co.in");
			
             File n=driver.getScreenshotAs(OutputType.FILE);
		
		driver.quit();
		
		File m=new File("f:/bb.png");
		
		
		FileUtils.copyFile(n, m);
		
		
			
		}


}

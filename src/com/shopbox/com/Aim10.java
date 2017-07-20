package com.shopbox.com;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Aim10 {
	public static void Firefox()
	{
		String key="webdriver.gecko.driver";
		String value="F:/ff/geckodriver.exe";
		
		System.setProperty(key, value);
	}

	
		public static void main(String[] args) throws AWTException, IOException {
			Robot r= new Robot();
			
			Rectangle ret= new Rectangle(0,0,1100,800);
			BufferedImage img=r.createScreenCapture(ret);
			
	 FileOutputStream f=new FileOutputStream("f:/bb.png");
	 ImageIO.write(img, "png", f);
			
		}
}

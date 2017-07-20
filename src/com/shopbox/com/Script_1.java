package com.shopbox.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Script_1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","F:/ff/geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		
		driver.get("https://accounts.google.com/ServiceLogin/identifier?hl=en&passive=true&continue=https%3A%2F%2Fwww.google.co.in%2Fsearch%3Fq%3Dgmail%26ie%3Dutf-8%26oe%3Dutf-8%26client%3Dfirefox-b-ab%26gfe_rd%3Dcr%26ei%3D3khiWbeMOdilvwSVk4-4Dw&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		
		Loginpag o= new Loginpag(driver);
		
		o.setusername("gnnaveen32@gmail.com");
		o.click();
	}

}

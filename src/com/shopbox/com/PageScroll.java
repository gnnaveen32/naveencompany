package com.shopbox.com;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class PageScroll {
	
	
	WebDriver driver;
	String URL = "https://www.linkedin.com/";
	
	
	public void setUp() {
		driver = new FirefoxDriver();
		driver.get(URL);
		driver.manage().window().maximize();
		
		
	}

	public void scrollingToBottomofAPage() {
		driver.navigate().to(URL);
		 ((JavascriptExecutor) driver)
         .executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}

	public void scrollingToElementofAPage() {
		driver.navigate().to(URL+"directory/companies?trk=hb_ft_companies_dir");
		WebElement element = driver.findElement(By.linkText("Import/Export"));
		((JavascriptExecutor) driver).executeScript(
                "arguments[0].scrollIntoView();", element);
	}
	
	public void scrollingByCoordinatesofAPage() {
		driver.navigate().to(URL+"job/?trk=hb_ft_jobs");
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,500)");
	}
	public void tearDown() {
		driver.quit();
	}
	 public static void scrollTo(WebDriver driver, WebElement element) {
	        ((JavascriptExecutor) driver).executeScript(
	                "arguments[0].scrollIntoView();", element);
	 }
}

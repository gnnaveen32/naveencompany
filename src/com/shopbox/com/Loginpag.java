package com.shopbox.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpag {
	
	
	@FindBy(id="identifierId")
	private WebElement un;
	
	@FindBy(partialLinkText="Next")
	private WebElement pwd;
	
	public Loginpag(WebDriver driver)
	{
	PageFactory.initElements(driver, this);	
	
	}
	
	public void setusername(String un1 )
	{
		un.sendKeys(un1);
	}
	
	public void click()
	{
	pwd.click();	
	}
	
	
	

}

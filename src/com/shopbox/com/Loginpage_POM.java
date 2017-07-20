package com.shopbox.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage_POM {
	
	@FindBy(linkText="Login")
	private WebElement login;

	@FindBy(id="editname")
	private WebElement untb; 
	
	@FindBy(id="edit[-pass")
	private WebElement pwd;
	
	
	@FindBy(id="edit5[-submit")
	private WebElement loginbtn;
	
	@FindBy(partialLinkText="logout")
	private WebElement logout;

	public  Loginpage_POM(WebDriver driver)
	{
	PageFactory.initElements(driver,this);	
	}
	
	public void clickLogin()
	{
	login.click();	
	}
	
	
	public void SetUserName(String un)
	{
	untb.sendKeys(un);	
	}
	
	
	public void setpassword(String pw)
	{
		pwd.sendKeys(pw);
		
	}
	
	public void clicklogin()
	{
	loginbtn.click();	
	}
	
	public void clicklogout()
	{
	logout.click();	
	}
	
	
	
	

}

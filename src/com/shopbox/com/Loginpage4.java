package com.shopbox.com;

import java.util.List;

import org.openqa.selenium.support.FindBy;

public class Loginpage4<webelement>
{ 
	
	@FindBy(xpath="//a")
	private List<webelement> alllinks;
	
	
	public void clicklink()
	{
		int count=alllinks.size();
		System.out.println(count);
	}
	
}
    





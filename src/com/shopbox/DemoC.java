package com.shopbox;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DemoC {
	@DataProvider
	
	public String [][] getData()
	{
		String [][] a=new String[2][2];
		
		a[0][0]="user";
		a[0][1]="a123";
		a[1][0]="userb";
		a[1][1]="b123";
		return a;
		
		
	}

	@Test(dataProvider="getData")
	
	public void register(String un,String pw)
	{
		Reporter.log("create"+un+" "+pw,true);
	}


}

package com.shopbox.com;

import org.junit.Assert;
import org.testng.ITest;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners
public class Demo1 {
//	@Override
//	public void onTestFailure (ITestResult result)
	{
		System.out.println("dsada");
	}
	@Test
	public void testB()
	{
		Reporter.log("test B",true);
		
		Assert.fail();
	}

}

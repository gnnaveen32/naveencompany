package com.shopbox;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoB {
@Test(priority=2)
public void high()
{
	Reporter.log("hi",true);
}

@Test(priority=1)
public void high1()
{
	Reporter.log("bye",true);
}
}

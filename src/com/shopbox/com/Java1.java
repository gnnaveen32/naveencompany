package com.shopbox.com;

public class Java1 {
	
	
	private int i;
	
	Java1(int j)
	{
		i=j;
	}
	public void getvalue()
	{
	System.out.println(i);	
	}
	public static void main(String[] args) {
		Java1 o=new Java1(2);
		o.getvalue();
	}
}

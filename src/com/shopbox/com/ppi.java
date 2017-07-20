package com.shopbox.com;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ppi {
 public static void main(String[] args) throws IOException, IOException   {
	Properties p=new Properties();
	p.load(new FileInputStream("./config/config.properties"));

 String v=p.getProperty("url");
 System.out.println(v);
 }
}

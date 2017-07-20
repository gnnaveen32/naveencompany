package com.shopbox.com;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class exe1 {
	public static void main(String[] args) throws IOException {
		
		FileInputStream fi=new FileInputStream("./data/book.xlsx");
	
//	workbook wb=workbookfactory.create(fi);
	//cell c=wb.getsheet("sheet1").getrow(0).getcell(0);
	
	//c.setcellvalue("manager");
	FileOutputStream f=new FileOutputStream("./data/book.xlsx");
	
	//f.write(f);
	
	
	}
}
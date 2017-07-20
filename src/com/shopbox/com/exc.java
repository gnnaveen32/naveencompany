package com.shopbox.com;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class exc {
public static void main(String[] args) throws IOException {
	
	FileInputStream fis=new FileInputStream("./data/book1.xlsx");
	
//	workbook wb=workbookFactory.create(fis);
	//cell c=wb.getsheet("sheet").getrow(0).getcell(0);
	//System.out.println(c);
}

}

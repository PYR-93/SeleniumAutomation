package com.ReadExcel;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		XSSFWorkbook WB1 = new XSSFWorkbook("C:\\Users\\pyred\\eclipse-workspace\\ReadWriteExcel\\src\\com\\Data\\Test.xls");
		
		XSSFSheet SH1= WB1.getSheet("Yogi");
		
		XSSFRow R1 = SH1.getRow(0);
		XSSFCell C1=R1.getCell(0);
		WB1.close();
		System.out.println(C1);
		
		
		
		
		
	}

}

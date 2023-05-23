package com.WriteExcel;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Write {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		XSSFWorkbook WB = new XSSFWorkbook();
		
		XSSFSheet SH = WB.createSheet("Yogi");
		
		XSSFRow R = SH.createRow(0);
		
		XSSFCell C = R.createCell(0);
		C.setCellValue("Good");
		
		XSSFCell C1 = R.createCell(1);
		C1.setCellValue("Human");
		
		for (int i =0;i<=10;i++) {
			
			XSSFRow R1 = SH.createRow(i);
			for (int j=0;j<=10;j++) {
			XSSFCell C11 = R1.createCell(j);
			C11.setCellValue("Good"+i+j);}
		
		}
		
		File F = new File("C:\\Users\\pyred\\eclipse-workspace\\ReadWriteExcel\\src\\com\\Data\\Test.xls");
		
		FileOutputStream FO = new FileOutputStream(F);
		WB.write(FO);
		
		WB.close();
		FO.close();
		
		
		System.out.println("File write succesful");
 		
 		
		
	}

}

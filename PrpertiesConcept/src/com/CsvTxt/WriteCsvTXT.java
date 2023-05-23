package com.CsvTxt;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class WriteCsvTXT {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
File F =new File("C:\\Users\\pyred\\eclipse-workspace\\PrpertiesConcept\\src\\com\\Properties\\Test1.txt");
		FileWriter FW = new FileWriter(F,true);
		
		BufferedWriter BW = new BufferedWriter(FW);
		for (int i =0;i<10;i++) {
		BW.write("Test"+",");}
		BW.close();
		
		
		
		
		
	}
 
}

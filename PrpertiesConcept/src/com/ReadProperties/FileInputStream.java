package com.ReadProperties;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class FileInputStream {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		java.io.FileInputStream FI = new java.io.FileInputStream(System.getProperty("user.dir")+"\\src\\com\\Properties\\Test.properties");
		
		Properties PR1=new Properties();
		
		PR1.load(FI);
		
		System.out.println(PR1.getProperty("Name"));
		System.out.println(PR1.getProperty("Website"));
		
		
		
	}

}

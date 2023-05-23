package com.FileWriter;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PropWriter {

	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub

		//Step 1 Create an object of File Writer
		FileWriter F1 = new FileWriter(System.getProperty("user.dir")+("\\src\\com\\Properties\\Test1.properties"),true);
		//Step 2 Create an object of Properties class
		Properties P1 = new Properties();
		//P1.load(null); We dont use Load method because we are not reading the file
		
		//Step 3 - Use SetProperty method to set the property
		
		P1.setProperty("URL", "Roboshop.internal.com");
		
		P1.store(F1, "Storing the URL");
		
		
		
	}

}

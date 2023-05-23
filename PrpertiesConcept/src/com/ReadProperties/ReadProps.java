package com.ReadProperties;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadProps {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		// Step 1 File reader or File input stream

		FileReader FR = new FileReader(
				"C:\\Users\\pyred\\eclipse-workspace\\PrpertiesConcept\\src\\com\\Properties\\Test.properties");

		Properties P = new Properties();

		P.load(FR);

		System.out.println(P.getProperty("Name"));

		System.out.println(P.getProperty("URL"));

		System.out.println(System.getProperty("user.dir"));

	}

}

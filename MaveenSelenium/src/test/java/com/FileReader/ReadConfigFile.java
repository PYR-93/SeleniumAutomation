package com.FileReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadConfigFile {

	public static String[] getDriverInfo() throws IOException {

		FileReader fr = new FileReader(System.getProperty("user.dir") + "\\src\\test\\Configurations.txt");
		Properties P = new Properties();
		P.load(fr);
		System.out.println(P.getProperty("Driver"));
		// System.out.println(P.getProperty("Driver"));
		/* System.out.println(System.getProperty("user.dir")); */
		
		
		String[] Details = {(String)P.getProperty("url") ,(String)(P.getProperty("Driver"))};
		
		return Details;
	}
	

}

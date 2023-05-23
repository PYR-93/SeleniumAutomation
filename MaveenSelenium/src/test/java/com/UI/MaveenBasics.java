package com.UI;

import org.openqa.selenium.chrome.ChromeDriver;

public class MaveenBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ChromeDriver D= new ChromeDriver();
		D.get("http://www.google.com");
		D.close();
		

	}

}

package com.Locators;
import com.FileReader.ReadConfigFile;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Loc {

	public static WebDriver driver;

	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
	
		if (xs[1].equals(xs)) {
			WebDriverManager.chromedriver().setup(); 
			ChromeDriver driver = new ChromeDriver();
		}
		
		driver.get(xs[0]);
		
		driver.findElement(By.id("Name")).sendKeys("Hii");
		
		/*
		 * System.out.println(x[0]); System.out.println(x[1]);
		 */
		
		/*
		 * 
		 */
		
		
		

	}

}

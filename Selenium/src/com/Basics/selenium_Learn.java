package com.Basics;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class selenium_Learn {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pyred\\eclipse-workspace\\Selenium\\BrowserDri\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://www.google.com");
		driver.wait();
	
		driver.quit();
		

	}

}

package com.DataProviderReadFromExtFile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import com.DataProviderLear.*;
import io.github.bonigarcia.wdm.WebDriverManager;


public class ImportSDataProvFromOtherFile {
@Test(dataProvider="dprovider",dataProviderClass = DPro.class)
	public void fireBrowser(String User, String Pass) {
		WebDriverManager.chromedriver().setup();
		WebDriver Driver = new ChromeDriver();
		Driver.get("https://www.saucedemo.com/");
		Driver.findElement(By.id("user-name")).sendKeys(User);
		Driver.findElement(By.id("password")).sendKeys(Pass);
		Driver.findElement(By.id("login-button")).click();
		Driver.close();

	}
	
	
}

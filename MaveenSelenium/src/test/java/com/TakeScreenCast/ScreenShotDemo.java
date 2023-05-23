
package com.TakeScreenCast;

	import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.commons.math3.geometry.spherical.twod.Edge;
	import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.edge.EdgeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.safari.SafariDriver;
	import org.testng.annotations.Parameters;
	import org.testng.annotations.Test;
	import org.openqa.selenium.TakesScreenshot;



	import io.github.bonigarcia.wdm.WebDriverManager;

	public class ScreenShotDemo {

		
		public static WebDriver Driver;
		@Parameters({"browser","url"})
		@Test
		public void launchBrowser(String browser, String url) throws IOException {
			
			if(browser.equals("chrome")) {
				WebDriverManager.chromedriver().setup();
				 Driver = new ChromeDriver();
			}
			
			if(browser.equals("edge")) {
				WebDriverManager.edgedriver().setup();
				 Driver = new EdgeDriver();
			}
			
			if(browser.equals("firefox")) {
				WebDriverManager.firefoxdriver().setup();
				 Driver = new FirefoxDriver();
			}
			
			if(browser.equals("safari")) {
				WebDriverManager.safaridriver().setup();
				 Driver = new SafariDriver();
			}
			Date D = new Date();
			System.out.println(D);
			String ScreenShotNaming = D.toString().replace(" ", "-").replace(":", "-");
			Driver.get(url);
			Driver.findElement(By.id("user-name")).sendKeys("standard_user");
			Driver.findElement(By.id("password")).sendKeys("secret_sauce");
			Driver.findElement(By.id("login-button")).click();
			
			
			File screenshotFile = ((TakesScreenshot) Driver).getScreenshotAs(OutputType.FILE);
			
			FileUtils.copyFile(screenshotFile, new File(".//Screenshot//"+ScreenShotNaming+".png"));
			
			
			Driver.close();
			
		}
		
		
		
		
	
	
	
}

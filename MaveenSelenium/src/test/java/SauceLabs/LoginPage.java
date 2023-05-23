package SauceLabs;

import org.apache.commons.math3.geometry.spherical.twod.Edge;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage {

	
	public static WebDriver Driver;
	@Parameters({"browser","url"})
	@Test
	public void launchBrowser(String browser, String url) {
		
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
		
		Driver.get(url);
		Driver.findElement(By.id("user-name")).sendKeys("standard_user");
		Driver.findElement(By.id("password")).sendKeys("secret_sauce");
		Driver.findElement(By.id("login-button")).click();
		Driver.close();
		
		
		
	}
	
	
	
	
}

package ImpMics;

import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import ExternalTasks.CaptureScreenSimpleCast;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverInit {

	public static WebDriver driver;

	@Parameters({ "url" })
	@Test(priority = 1, description = "Test")
	public  void launchBrowser(String url) throws IOException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(url);
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		CaptureScreenSimpleCast.getScreenCast();

	}

	public static String nameMySnap() {

		Date D = new Date();
		System.out.println(D);
		String ScreenShotNaming = D.toString().replace(" ", "-").replace(":", "-");
		return ScreenShotNaming;

	}

}

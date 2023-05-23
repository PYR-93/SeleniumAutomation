package com.DataProviderLear;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DPro {

	@DataProvider
	public String[][] dprovider() {
		String[][] S = { { "standard_user", "secret_sauce" }, { "locked_out_user", "secret_sauce" },
				{ "problem_user", "secret_sauce" }, { "performance_glitch_user", "secret_sauce" } };

		return S;
	}

	@Test(enabled=false)
	public void invokeBrowser(String User, String Pass) {
		WebDriverManager.chromedriver().setup();
		WebDriver Driver = new ChromeDriver();
		Driver.get("https://www.saucedemo.com/");
		Driver.findElement(By.id("user-name")).sendKeys(User);
		Driver.findElement(By.id("password")).sendKeys(Pass);
		Driver.findElement(By.id("login-button")).click();
		Driver.close();

	}

}

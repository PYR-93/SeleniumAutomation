package com.TestNG_EbayAssert;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class EbayTitleTest {
	@Test(description="Test the Tittle")
	public void tittleVerification() {
		String expectedtittle = "Electronics, Cars, 99Fashion, Collectibles & More | eBay";
		WebDriverManager.chromedriver().setup();
		ChromeDriver D = new ChromeDriver();
		D.get("https://www.ebay.com/");
		String actualtittle=D.getTitle();
		/*
		 * try { Assert.assertEquals(actualtittle, expectedtittle); D.close(); } catch
		 * (Error e) { System.out.println(e.getMessage()); // TODO: handle exception }
		 */
		AssertJUnit.assertEquals(actualtittle, expectedtittle);
		D.close();

	}

}

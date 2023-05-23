package com.TestNG_EbayAssert;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SoftAssertTest {

	@Test
	public void softAssertCase() {
		SoftAssert softAssert1 = new SoftAssert();
		String expectedTitle = "Electronics, Cars,333mm Fashion, Collectibles & More | eBay";
		WebDriverManager.chromedriver().setup();
		ChromeDriver D = new ChromeDriver();

		D.get("https://www.ebay.com/");
		String actualTitle = D.getTitle();

		AssertJUnit.assertEquals(actualTitle, expectedTitle, "Assertion title buss");
		softAssert1.assertAll();//This will capture assert failures
		D.close();

	}

}

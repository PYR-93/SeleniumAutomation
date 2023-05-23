package com.ListnersDemo;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListeners implements ITestListener{

	public void onTestStart(ITestResult result) {
		System.out.println("Starting the case");
	}

	public void onTestSuccess(ITestResult result) {
		
	}

	public void onTestFailure(ITestResult result) {
		File screenshotFile = ((TakesScreenshot) Driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(screenshotFile, new File(".//Screenshot//"+ScreenShotNaming+".png"));
		
	}

	public void onTestSkipped(ITestResult result) {
	
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	public void onStart(ITestContext context) {
		
	}

	public void onFinish(ITestContext context) {
	
	}

	
	
	
}

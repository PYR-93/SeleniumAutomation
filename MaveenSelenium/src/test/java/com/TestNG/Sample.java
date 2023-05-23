package com.TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Sample {
//  if no priority is et then it will execute based on alphabetical order
	@Test
	public void testCase2() {

		System.out.println("Executing case2");
	}

	@Test
	public void testCase1() {

		System.out.println("Executing case 1");
	}

	@Test(priority = 1, description = "Performing action on ui") //
	// if priority is set then based on priority it will execute
	public void testCase3() {

		System.out.println("Executing case3");
	}

	@BeforeTest
	public void LoginToApplication() {

		System.out.println("Login to Application");

	}

	@AfterTest
	public void LogoutFromApplication() {

		System.out.println("Logout from Application");
	}
	
	@BeforeMethod
	public void connectToDB() {
		System.out.println("Connected to DB");
	}
	@AfterMethod
	public static void disconnectFromDB() {
		System.out.println("Disconnect from DB");
	}

}

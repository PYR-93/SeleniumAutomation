package com.Annotationss;

import org.testng.annotations.Test;

@Test(groups="User-Vration")
public class TestGroups {

	@Test(groups = "BVT")
	public void testCase1() {

		System.out.println("testCase1");
	}

	@Test(groups = "BVT")
	public void testCase2() {

		System.out.println("testCase2");
	}

	@Test(groups = "Regression")
	public void testCase3() {

		System.out.println("testCase3");
	}

	@Test(groups = { "Regression", "BVT" })
	public void testCase4() {

		System.out.println("testCase4");
	}

	@Test(groups = "Regression")
	public void testCase5() {

		System.out.println("testCase5");
	}

}

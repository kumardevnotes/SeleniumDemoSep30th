package com.app.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AppTests {

	@BeforeMethod
	public void setup() {
		System.out.println("Browser is opened and app is launched");
	}

	@Test
	public void verifyHomePage() {
		System.out.println("verifyHomePage passed");
	}

	@Test
	public void verifySignup() {
		System.out.println("verifySignup passed");
	}

	@Test
	public void verifyLogin() {
		System.out.println("verifyLogin passed");
	}

	@AfterMethod
	public void tearDown() {
		System.out.println("Browser is closed");
	}
}

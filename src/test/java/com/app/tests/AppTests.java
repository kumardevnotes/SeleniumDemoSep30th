package com.app.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.app.pages.HomePage;
import com.app.pages.LoginPage;
import com.app.pages.SignupPage;
import com.automation.base.TestBase;

public class AppTests {
	
	TestBase testBase = null;
	HomePage homePage = null;
	LoginPage loginPage = null;
	SignupPage signupPage = null;

	@BeforeMethod
	public void setup() {
		testBase  =  new TestBase();
		homePage =  new HomePage(testBase.getDriver());
		loginPage =  new LoginPage(testBase.getDriver());
		signupPage =  new SignupPage(testBase.getDriver());
		testBase.getDriver().get("https://www.speaklanguages.com");
		System.out.println("Browser is opened and app is launched");
	}

	@Test
	public void verifyHomePage() {
		boolean isHomePageLoaded  = homePage.isHomePageLoaded();
		Assert.assertTrue(isHomePageLoaded, "HomePage verification failed");
		System.out.println("verifyHomePage passed");
	}

	@Test
	public void verifySignup() throws Exception {
		homePage.launchSignupPage();
		String successMessage  = signupPage.signUpWithApp();
		System.out.println("verifySignup passed with " + successMessage);
	}

	@Test
	public void verifyLogin() throws Exception {
		homePage.launchLoginPage();
		String loggedInUserName  = loginPage.loginIntoApp("johnnitesh2@gmail.com", "Testing@123");
		System.out.println("verifyLogin passed: " + loggedInUserName);
	}

	@AfterMethod
	public void tearDown() {
		testBase.getDriver().quit();
		System.out.println("Browser is closed");
	}
}

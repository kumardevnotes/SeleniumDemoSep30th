package com.app.tests;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
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
		testBase = new TestBase();
		homePage = new HomePage(testBase.getDriver());
		loginPage = new LoginPage(testBase.getDriver());
		signupPage = new SignupPage(testBase.getDriver());
		testBase.getDriver().get("https://www.speaklanguages.com");
		System.out.println("Browser is opened and app is launched");
	}

	@Test
	public void verifyHomePage() {
		boolean isHomePageLoaded = homePage.isHomePageLoaded();
		Assert.assertTrue(isHomePageLoaded, "HomePage verification failed");
		System.out.println("verifyHomePage passed");
	}

	@Test
	public void verifySignup() throws Exception {
		homePage.launchSignupPage();
	
		String successMessageActual = signupPage.signUpWithApp();
		
		String successMsgExpected  = "Thank you";
		
		System.out.println("verifySignup passed with " + successMessageActual);
		if (successMessageActual.contains(successMsgExpected)) {
			System.out.println("signup is succesful");
		} else {
			String errorMessage = "Something went wrong. signup failed.Please check";
			captureScreenshot(testBase.getDriver(), "signup_failed");
			Assert.fail(errorMessage);
		}
	}

	@Test
	public void verifyLogin() throws Exception {
		homePage.launchLoginPage();
		String rootPath = System.getProperty("user.dir");

		FileInputStream fileReaderObj = new FileInputStream(rootPath + "//src/test/resources/appData.properties");
		Properties propsObj = new Properties();
		propsObj.load(fileReaderObj);
		String emailAddress = propsObj.getProperty("appUserEmailID");
		String password = propsObj.getProperty("apppassword");
		String userNameExpected = propsObj.getProperty("appUserName");

		String userNameActual = loginPage.loginIntoApp(emailAddress, password);

		if (userNameActual.equals(userNameExpected)) {
			System.out.println("login is succesful");
		} else {
			String errorMessage = "Something went wrong. Login failed.Please check";
			captureScreenshot(testBase.getDriver(), "login_failed");
			Assert.fail(errorMessage);
		}
	}
	
	private void captureScreenshot(WebDriver driver, String screenshotName) throws Exception {
				String rootPath = System.getProperty("user.dir");
				File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				File dest = new File(rootPath + "//Screenshots/" + screenshotName + ".png");
				FileHandler.copy(src, dest);
	}

	@AfterMethod
	public void tearDown() {
		testBase.getDriver().quit();
		System.out.println("Browser is closed");
	}
}

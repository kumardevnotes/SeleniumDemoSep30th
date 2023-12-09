package com.testng.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNgDemo4 {
	@Test(groups = { "SmokeTest" })
	public void launchSpeakLanguages() throws Exception {
		WebDriver driver = null;
		driver = new ChromeDriver();
		driver.get("https://en.wikipedia.org/wiki/Main_Page");
		Thread.sleep(1000);
		String pageTitle = driver.getTitle();
		Assert.assertTrue(pageTitle.contains("Wikipedia"), "Wikipedia page is not loaded properly");
		driver.quit();
	}
	
	@Test(groups = { "RegressionTest" })
	public void launchFacebook() throws Exception {
		WebDriver driver = null;
		driver = new EdgeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		Thread.sleep(1000);
		driver.quit();
	}
}

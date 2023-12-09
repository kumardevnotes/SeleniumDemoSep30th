package com.testng.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class TestNgDemo3 {
	
	@Test(invocationCount = 1, groups = { "SmokeTest" })
	public void launchSpeakLanguages() throws Exception {
		WebDriver driver = null;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://speaklanguages.com");
		Thread.sleep(1000);
		driver.quit();
	}

	@Test (groups = { "RegressionTest" })
	public void launchFacebook() throws Exception {
		WebDriver driver = null;
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://facebook.com");
		Thread.sleep(1000);
		driver.quit();
	}
}

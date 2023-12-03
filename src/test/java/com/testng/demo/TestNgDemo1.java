package com.testng.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNgDemo1 {

	@Test (priority = 2)
	public void verifyAppLaunchInChrome1() throws Exception {
		launchApp("Chrome");
	}
	
	@Test (priority = 1)
	public void verifyAppLaunchInEdge1() throws Exception {
		launchApp("Edge");
//		Assert.fail("Error message which tells the failure details");
	}
	
	public void launchApp(String browser) throws Exception {
		System.out.println("Selenium script started");
		WebDriver driver = null;
		
		switch(browser) {
		case "Chrome":
			driver = new ChromeDriver();
			break;
		case "Edge":
			driver = new EdgeDriver();
			break;		
		}
		driver.manage().window().maximize();
		driver.get("https://speaklanguages.com");
		driver.quit();
		
		System.out.println("Selenium script ended");
	}

}

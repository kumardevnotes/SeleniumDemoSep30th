package com.testng.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNgDemo5 {
	
	@Parameters({ "browser" })
	@Test
	public void launchSpeakLanguages(String browser) throws Exception {

		WebDriver driver = null;
		switch (browser) {
		case "Chrome":
			driver = new ChromeDriver();
			break;
		case "Edge":
			driver = new EdgeDriver();
			break;
		}
		driver.manage().window().maximize();
		driver.get("https://speaklanguages.com");
		Thread.sleep(1000);
		driver.quit();
	}
}

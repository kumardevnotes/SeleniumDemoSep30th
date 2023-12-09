package com.testng.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNgDemo6 {
	
	@DataProvider(name = "loginCredentials")
	public Object[][] createData1() {
	 return new Object[][] {
	   { "johnlegend1122@gmail.com", "Pwd#1122" },
	   { "johnlegend3344@gmail.com", "Pwd#3344" },
	   { "johnlegend5566@gmail.com", "Pwd#7156" },
	   { "johnlegend7788@gmail.com", "Pwd#567" },
	 };
	}
	
	@Test(dataProvider = "loginCredentials")
	public void launchSpeakLanguages(String emailAddress, String password) throws Exception {
		WebDriver driver = null;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://speaklanguages.com");
		
		driver.findElement(By.linkText("Log in")).click();
		
		driver.findElement(By.id("email_input")).sendKeys(emailAddress);
		driver.findElement(By.id("password_input")).sendKeys(password);
		
		driver.findElement(By.id("login_button")).click();
		
		Thread.sleep(5000);
		driver.quit();
	}
}

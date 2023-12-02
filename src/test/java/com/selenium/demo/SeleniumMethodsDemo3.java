package com.selenium.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumMethodsDemo3 {
	
	/*
	 * TC - Verify application login
	 * 
	 * 1. Launch chrome and maximize it
	 * 2. Launch application https://speaklanguages.com
	 * 3. Click on login link on the top
	 * 4. Enter fake email address and password and then click on login button
	 * 5. Verify user gets login error
	 * */

	public static void main(String[] args) throws Exception {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://speaklanguages.com");
		
		WebElement loginElement  = driver.findElement(By.linkText("Log in"));
		loginElement.click();
		
		
		WebElement emailAddressElement  = driver.findElement(By.id("email_input"));
		emailAddressElement.sendKeys("johnlegend@gmail.com");
	
		emailAddressElement.clear();
		
		emailAddressElement.sendKeys("johnMiller@yahoo.com");
		
		WebElement passwordElement  = driver.findElement(By.id("password_input"));
		passwordElement.sendKeys("pwd1122");
		
		passwordElement.clear();
		
		passwordElement.sendKeys("ytyththtyty");
		
		WebElement keepMeLoggedInElement  = driver.findElement(By.id("keep_logged_in_input"));
		keepMeLoggedInElement.click();
		
		
		WebElement loginBtnElement  = driver.findElement(By.id("login_button"));
		loginBtnElement.click();
	
		Thread.sleep(4000);
		
		WebElement errorElement  = driver.findElement(By.xpath("(//li[@class='error_message'])[1]"));
		System.out.println(errorElement.getText());
		
		driver.quit();

	}

}

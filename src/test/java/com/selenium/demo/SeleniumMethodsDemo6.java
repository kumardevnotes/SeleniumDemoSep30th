package com.selenium.demo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumMethodsDemo6 {

	public static void main(String[] args) throws Exception {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

		driver.findElement(By.name("proceed")).click();

		Thread.sleep(4000);

		Alert alertWindow = driver.switchTo().alert();

		// How to capture text on Alert window ?

		String textOnAlertWindow = alertWindow.getText();
		System.out.println(textOnAlertWindow);

		alertWindow.accept(); // clicks on OK button

       // alertWindow.dismiss(); // clicks on Cancel button

		Thread.sleep(4000);
		driver.quit();

	} 

}

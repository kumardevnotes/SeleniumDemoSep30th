package com.selenium.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumMethodsDemo5 {

	public static void main(String[] args) throws Exception {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://speaklanguages.com");
		
		Thread.sleep(6000);
		
		//Create an object reference for  JavascriptExecutor
		JavascriptExecutor jsObj = (JavascriptExecutor) driver;

		WebElement privacyPolicyElemenet = driver.findElement(By.linkText("Privacy policy"));
		
		// How to scroll to view an element on the screen ?
		jsObj.executeScript("arguments[0].scrollIntoView();", privacyPolicyElemenet);
		
		// How can I hover or move my mouse to a particular element on the screen ?
		Actions actionObj = new Actions(driver);
		WebElement languageDDElement = driver.findElement(By.id("language_menu"));
		actionObj.moveToElement(languageDDElement).build().perform();
		
		// How to drag and drop using selenium ? First create Actions object as shown in line 29. The call below code
//		WebElement srcElement = driver.findElement(By.id("language_menu"));
//		WebElement targetElement = driver.findElement(By.id("language_menu"));
//		actionObj.dragAndDrop(srcElement, targetElement).build().perform();
	
		Thread.sleep(4000);
		driver.quit();

	}

}

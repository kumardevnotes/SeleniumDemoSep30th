package com.selenium.demo;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumMethodsDemo8 {

	public static void main(String[] args) throws Exception {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.speaklanguages.com");
		
		driver.findElement(By.linkText("Sign up")).click();
		
		WebElement firstNameFieldElement  = driver.findElement(By.id("first_name"));
		firstNameFieldElement.sendKeys("John");
		
		WebElement lastNameFieldElement  =driver.findElement(By.name("last_name"));
		lastNameFieldElement.sendKeys("Legend");
		
		Thread.sleep(2000);
		
		WebElement emailFieldElement  =driver.findElement(By.name("email"));
		emailFieldElement.sendKeys("Johlegend@gmail.com");
		
		WebElement pwdFieldElement  =driver.findElement(By.name("password"));
		pwdFieldElement.sendKeys("pwd2424242");
		
		//How to select values from dropdown using Select class in Selenium4?
		
		WebElement sexDDElement  = driver.findElement(By.name("sex"));
		
		Select sexDD =  new Select(sexDDElement);
//		sexDD.selectByIndex(1);
//		sexDD.selectByValue("Male");
		sexDD.selectByVisibleText("Female");
		Thread.sleep(2000);
		
		WebElement dayDdElement  = driver.findElement(By.name("dob_day"));
		Select dayDD =  new Select(dayDdElement);
//		dayDD.selectByIndex(5);
//		dayDD.selectByValue("6");
		dayDD.selectByVisibleText("7");
		Thread.sleep(2000);
		
		WebElement monthDdElement  = driver.findElement(By.name("dob_month"));
		Select monthDD =  new Select(monthDdElement);
//		monthDD.selectByIndex(5);
//		monthDD.selectByValue("6");
		monthDD.selectByVisibleText("July");
		Thread.sleep(2000);
		
		WebElement yearDdElement  = driver.findElement(By.name("dob_year"));
		Select yearDD =  new Select(yearDdElement);
//		yearDD.selectByIndex(5);
//		yearDD.selectByValue("1926");
		yearDD.selectByVisibleText("1927");
		
		//If you want to deselect all the options which are already selected, call below ()
//		yearDD.deselectAll();
		
		Thread.sleep(6000);
		
		driver.findElement(By.xpath("//input[@value='Sign up']")).click();
		
		Thread.sleep(5000);
		driver.quit();

	} 

}

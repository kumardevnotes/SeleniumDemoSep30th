package com.selenium.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumMethodsDemo4 {

	public static void main(String[] args) throws Exception {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://speaklanguages.com");

		WebElement birdImageElement = driver.findElement(By.xpath("(//img[@alt='Speak Languages'])[2]"));
		String imageUrl = birdImageElement.getAttribute("src");
//		driver.get(imageUrl);
//
//		System.out.println(driver.getTitle());
//		System.out.println(driver.getCurrentUrl());
//		String pageSource = driver.getPageSource();

		driver.get("https://speaklanguages.com");

		WebElement loginElement = driver.findElement(By.linkText("Log in"));
		loginElement.click();
		
		boolean displayedOrNot  = driver.findElement(By.xpath("//h1[.='Log in to Speak Languages']")).isDisplayed();
		boolean enabledOrNot  = driver.findElement(By.id("login_button")).isEnabled();
		boolean selectedOrNot  = driver.findElement(By.id("keep_logged_in_input")).isSelected();
		
		System.out.println(displayedOrNot); //true or false
		System.out.println(enabledOrNot);  //true or false
		System.out.println(selectedOrNot); //true or false

		Thread.sleep(4000);
		driver.quit();

	}

}

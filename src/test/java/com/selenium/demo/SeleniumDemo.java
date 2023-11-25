package com.selenium.demo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemo {

	public static void main(String[] args) throws Exception {
		
		System.out.println("Selenium scrip starts here..");
		
		// Launch the chrome browser
		WebDriver driver = new ChromeDriver(); // ChromeDriver implements WebDriver
		
		// Maximize the browser that is opened above
		driver.manage().window().maximize();
		
		// get() is used to launch a web app in the browser
		driver.get("https://speaklanguages.com");
		
		Thread.sleep(2000);
		
//		driver.get("https://facebook.com");
		
		// Java call -- waits for 4 seconds 4seconds == 4000 milli seconds
		Thread.sleep(4000);
		
		//To close the browser that is opened
		driver.quit();
		
		System.out.println("Selenium script ended");

	}

}

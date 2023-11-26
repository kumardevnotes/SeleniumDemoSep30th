package com.selenium.demo;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumMethodsDemo2 {

	public static void main(String[] args) throws Exception {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://speaklanguages.com");
		String window1 = driver.getWindowHandle();

		Thread.sleep(2000);

		// How to launch a fresh tab using selenium4
		//driver.switchTo().newWindow(WindowType.TAB);
		
		driver.switchTo().newWindow(WindowType.TAB);
		
		driver.get("https://facebook.com");
		String window2 = driver.getWindowHandle();

		
		Thread.sleep(4000);
		
		driver.switchTo().window(window1);
		
		Thread.sleep(2000);
		
		driver.switchTo().window(window2);
		
		Set<String> allActiveWindowIds = driver.getWindowHandles();
		
		//Loop through all activewindows using switchTo()
		for(String activeWindow : allActiveWindowIds) {
			driver.switchTo().window(activeWindow);
			System.out.println(driver.getTitle());
		}
		
		//current window or tab is closed
		driver.close();
		Thread.sleep(4000);
		
		//closes all opened windows
		driver.quit();

	}

}

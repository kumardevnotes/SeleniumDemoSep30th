package com.selenium.demo;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class SeleniumMethodsDemo9 {

	public static void main(String[] args) throws Exception {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.speaklanguages.com");
		
		//Fullpage screenshot
		String rootPath = System.getProperty("user.dir");
		// Call getScreenshotAs method to create image file
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		// create a destination path
		File dest = new File(rootPath + "//Screenshots/fullPageScreenshot" + ".png");
		// Copying from source to destination path
		FileHandler.copy(src, dest);
		
		//Element level screenshot
		WebElement logoElement = driver.findElement(By.xpath("//div[@id='homepage_header']//img"));
		File src2 = logoElement.getScreenshotAs(OutputType.FILE);
		File dest2 = new File(rootPath + "//Screenshots/elementLevelScreenshot" + ".png");

		FileHandler.copy(src2, dest2);
		
		Thread.sleep(5000);
		driver.quit();

	} 

}

package com.selenium.demo;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumMethodsDemo7 {

	public static void main(String[] args) throws Exception {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.speaklanguages.com");
		
		//findElements() returns list of all matching elements i.e, more than one element
		List<WebElement> langElements  = driver.findElements(By.xpath("//p[@class='site_link']//a"));
		
		//forloop is used to loop through each element and getText() out of the element
		for(WebElement langElement  : langElements) {
			String langName  = langElement.getText();
			System.out.println(langName);
		}

		Thread.sleep(4000);
		driver.quit();

	} 

}

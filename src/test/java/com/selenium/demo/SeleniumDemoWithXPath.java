package com.selenium.demo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemoWithXPath {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://speaklanguages.com");
		
		WebElement logInElement = driver.findElement(By.xpath("//a[text()='Log in']")); //a[contains(text(),'Sign up')]
		logInElement.click();
		
		WebElement emailFieldElement = driver.findElement(By.name("email"));
		emailFieldElement.sendKeys("johnnitesh2@gmail.com");
		
		WebElement passwordFieldElement = driver.findElement(By.id("password_input"));
		passwordFieldElement.sendKeys("Testing@123");
		
		WebElement loginBtnElement = driver.findElement(By.id("login_button"));
		loginBtnElement.click();
		Thread.sleep(4000);
		WebElement loggedInUserName = driver.findElement(By.xpath("//li[@id='nav_user']//a"));
		String userName = loggedInUserName.getText();
		System.out.println(userName);
		Thread.sleep(2000);
		driver.quit();
	}

}

package com.selenium.demo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemo2 {

	public static void main(String[] args) throws Exception {
		
		for (int i = 1; i <= 5; i++) {
			printLoggedInUserName(i);
		}

	}

	private static void printLoggedInUserName(int i) throws Exception {
		System.out.println("Running the script for the iteration"+i);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://speaklanguages.com");
		WebElement logInElement = driver.findElement(By.linkText("Log in"));
		logInElement.click();
		WebElement emailFieldElement = driver.findElement(By.id("email_input"));
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

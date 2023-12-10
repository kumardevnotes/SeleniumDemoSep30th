package com.app.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver driver = null;

	By email_Field = By.id("email_input");
	By password_Field = By.id("password_input");
	By login_Btn = By.id("login_button");
	By logged_In_UserName = By.xpath("//li[@id='nav_user']//a");
	
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	public String getLoginPageTitle() {
		return driver.getTitle();
	}

	public String loginIntoApp(String emailAddress, String password) throws Exception {
		driver.findElement(email_Field).sendKeys(emailAddress);
		driver.findElement(password_Field).sendKeys(password);
		driver.findElement(login_Btn).click();
		Thread.sleep(8000);
		return driver.findElement(logged_In_UserName).getText();
	}

}

package com.app.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

	WebDriver driver = null;

	By app_Logo = By.id("logo");
	By search_Field = By.id("search_form");
	By search_Button = By.id("search_submit");
	By login_Link = By.linkText("Log in");
	By signUp_Link = By.linkText("Sign up");
	By footer_Section = By.id("footer");

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	public boolean isHomePageLoaded() {
		
		boolean isHomePageLoaded = driver.findElement(app_Logo).isDisplayed()
				&& driver.findElement(search_Field).isDisplayed()
				&& driver.findElement(search_Button).isDisplayed()
				&& driver.findElement(login_Link).isDisplayed()
				&& driver.findElement(signUp_Link).isDisplayed()
				&& driver.findElement(footer_Section).isDisplayed();
		return isHomePageLoaded;
	}

	public String getHomePageTitle() {
		return driver.getTitle();
	}

	public void launchLoginPage() {
		driver.findElement(By.linkText("Log in")).click();
	}

	public void launchSignupPage() {
		driver.findElement(By.linkText("Sign up")).click();
	}

}

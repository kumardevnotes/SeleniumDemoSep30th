package com.app.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.github.javafaker.Faker;

public class SignupPage {
	
	WebDriver driver = null;
	
	By firstName_Field = By.id("first_name");
	By lastName_Field = By.name("last_name");
	By emailAddress_Field = By.name("email");
	By password_Field = By.name("password");
	By gender_DD_Locator = By.name("sex");
	By day_DD_Locator = By.name("dob_day");
	By month_DD_Locator = By.name("dob_month");
	By year_DD_Locator = By.name("dob_year");
	By signUp_Btn = By.xpath("//input[@value='Sign up']");
	By signUp_Success_Label = By.xpath("//h1[contains(text(),'Thank you')]");
	
	

	public SignupPage(WebDriver driver) {
		this.driver = driver;
	}

	public String getSignupPageTitle() {
		return driver.getTitle();
	}
	
	public String signUpWithApp() throws Exception {
		
		Faker fakerObj =  new Faker();
		
		WebElement firstNameFieldElement  = driver.findElement(firstName_Field);
		firstNameFieldElement.sendKeys(fakerObj.name().firstName());
		
		WebElement lastNameFieldElement  =driver.findElement(lastName_Field);
		lastNameFieldElement.sendKeys(fakerObj.name().lastName());
		
		WebElement emailFieldElement  =driver.findElement(emailAddress_Field);
		emailFieldElement.sendKeys(fakerObj.internet().emailAddress());
		
		WebElement pwdFieldElement  =driver.findElement(password_Field);
		pwdFieldElement.sendKeys(fakerObj.internet().password());
		
		WebElement sexDDElement  = driver.findElement(gender_DD_Locator);
		Select sexDD =  new Select(sexDDElement);
		sexDD.selectByIndex(1);
		
		WebElement dayDdElement  = driver.findElement(day_DD_Locator);
		Select dayDD =  new Select(dayDdElement);
		dayDD.selectByIndex(5);
		
		WebElement monthDdElement  = driver.findElement(month_DD_Locator);
		Select monthDD =  new Select(monthDdElement);
		monthDD.selectByIndex(5);
		
		WebElement yearDdElement  = driver.findElement(year_DD_Locator);
		Select yearDD =  new Select(yearDdElement);
		yearDD.selectByIndex(5);
		
		driver.findElement(signUp_Btn).click();
		
		Thread.sleep(6000);
		return driver.findElement(signUp_Success_Label).getText();
	}
	
	
}

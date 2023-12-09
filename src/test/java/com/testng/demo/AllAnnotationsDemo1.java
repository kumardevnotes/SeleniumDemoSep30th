package com.testng.demo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class AllAnnotationsDemo1 {
	
  @Test
  public void testCase1() {
	  System.out.println("testCase1 passed");
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("beforeMethod completed");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("afterMethod completed");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("beforeClass completed");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("afterClass completed");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("beforeTest completed");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("afterTest completed");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("beforeSuite completed ");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("afterSuite completed");
  }

}

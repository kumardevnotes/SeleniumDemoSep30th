package com.exceptions.demo;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ExceptionDemo2 {

	//checked exception or static or compile time exception
	public static void main(String[] args) throws IOException {
		
		
		// Example for Java File IO
		 // Try to read a properties file using java IO package methods
		
		//To get the root folder path in local
		String rootPath = System.getProperty("user.dir");
		
		//to load the properties document into java program
		FileInputStream fileReaderObj  =  new FileInputStream(rootPath + "//src/test/resources/appData.properties");
		
		//To load content of the file into properties object
		Properties propsObj = new Properties();
		propsObj.load(fileReaderObj);
		
		System.out.println(propsObj.getProperty("appBrowser"));
		System.out.println(propsObj.getProperty("appURL"));
		System.out.println(propsObj.getProperty("appUserName"));
		System.out.println(propsObj.getProperty("appPassword"));

	}

}

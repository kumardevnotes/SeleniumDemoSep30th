package com.java.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadTextDocDemo {

	public static void main(String[] args) throws IOException {

		//Write a java program to read text document and print on the console
		// To get the root folder path in local
		String rootPath = System.getProperty("user.dir");
		
		//To read the document into FileReader obj
		FileReader frObj = new FileReader(rootPath + "//src/test//resources//Topics.txt");

		//Read char by char 
		BufferedReader brObj = new BufferedReader(frObj);
		
		String str = "";
		while ((str = brObj.readLine()) != null) { // null != null -- > 2 != 2 --> false
			System.out.println(str);
		}

	}

}

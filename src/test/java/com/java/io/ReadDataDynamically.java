package com.java.io;

import java.util.Scanner;

public class ReadDataDynamically {

	public static void main(String[] args) {
		
		//Assignment is to read boolean/float/double data from keyboard and print it on the console
		
		Scanner scanObj = new Scanner(System.in);
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Please enter your age!");
			
			int age = scanObj.nextInt();
		
			if (age >= 18) { // 15 >= 18
				System.out.println("You are eligible to vote!");
			} else {
				System.out.println("You are not eligible to vote!");
			} 
		}
	}

}

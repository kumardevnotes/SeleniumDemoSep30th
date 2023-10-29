package com.java.oops;

import com.java.methods.SchoolClass123;

public class StdClass3 extends SchoolClass123{
	
	final int stdPostalCode = 50012;

	public static void main(String[] args) {
		StdClass3 obj = new StdClass3();
		obj.displayMarks();
		
		
		obj.displayMarks(100);
		
		obj.displayStdPostalCode();
	}
	
	//Overriding the displayMarks() in childclass - Dynamic Polymorphism
	//Overriding happens in btw 2 diff classes
	public void displayMarks() {
		System.out.println("Std got marks: " + 75);
	}
	
	//Overloading methods in java - static polymorphism - Declaring method with same name but with diff method signature
	//Overloading happens in same class
	public void displayMarks(int stdMarks) {
		System.out.println("My student got marks: " + stdMarks);
	}
	
	public void displayStdPostalCode() {
		//stdPostalCode =  522334;
		System.out.println(stdPostalCode);
	}
	

}

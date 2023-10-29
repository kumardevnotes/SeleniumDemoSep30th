package com.java.oops;

public class SchoolClass {
	
	public void displaySchoolName() {
		System.out.println("Thomos High School");
	}
	
	public void displaySchoolId() {
		System.out.println("High112233");
	}
	
	public void displaySchoolAddress() {
		System.out.println("Kings Lane, 1001, UK");
	}
	
	//If a method is private, it can not be called outside this class
	private void displaySchoolIncome() {
		System.out.println("10000$ per year");
	}
	
}

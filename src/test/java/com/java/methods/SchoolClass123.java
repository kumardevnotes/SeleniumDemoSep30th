package com.java.methods;

public class SchoolClass123 {
	
	public static void main(String[] args) {
		SchoolClass123 obj = new SchoolClass123();
		obj.displaySchoolRank();
		}
	
	//protected methods can only be accessed using child class object 
	protected void displaySchoolRank() {
		System.out.println("Rank 8");
	}
	
	public void displaySchoolBranch() {
		System.out.println("London");
	}
	
	
}

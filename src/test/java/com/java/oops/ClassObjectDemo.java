package com.java.oops;

public class ClassObjectDemo {
	
	//Instance Variables (We don't use static keyword while creating these variables)
	
	String empName  = "John Doe";
	int empId  =  334455;

	public static void main(String[] args) {
		//trying to call a non-static method
		
		ClassObjectDemo classObj = new ClassObjectDemo();
		classObj.displayName();
		classObj.displayFullName("John", "Legend");
		
		System.out.println(classObj.empName);
		System.out.println(classObj.empId);
	}

	// Declaring non-static methods
	public void displayName() {
//		System.out.println("Tom Cruise");
//		System.out.println(empName);
//		System.out.println(empId);
//		
		empName = "Kumar Th";
		empId  =  667788;
	}

	// Declaring a non-static method with 2 params
	public void displayFullName(String fName, String lName) {
		//System.out.println(String.format("Employee fullname is %s %s", fName, lName));
		System.out.println(String.format("Employee fullname is %s %s", empName, empId));
	}

}

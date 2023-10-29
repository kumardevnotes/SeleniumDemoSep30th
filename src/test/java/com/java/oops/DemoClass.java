package com.java.oops;

public class DemoClass {

	//static variables at class level. Scope is class level
	static String empName  =  "JohLegend";
	static int empId = 1122;
	
	public static void main(String[] args) {
		//classic way of printing strings (not recommended)
		//System.out.println(empName + "  " + empId);
		
		//String interpolation or formatting in java (recommended)
		System.out.println(String.format("empName is %s and empID is %s", empName, empId));
		
		//calling a method
		displayEmpDetails();
		
		displayEmpDetails2();
	}
	
	//method declaration
	public static void displayEmpDetails() {
		empName = "Joh Doe";
		empId = 3344;
		
		//method level scope of variable 
		int empPostalCode =  50012;
		System.out.println(String.format("empName is %s and empID is %s and empPostalCode is %s", empName, empId, empPostalCode));
	}
	
	public static void displayEmpDetails2() {
		System.out.println(String.format("empName is %s and empID is %s", empName, empId));
	}

}

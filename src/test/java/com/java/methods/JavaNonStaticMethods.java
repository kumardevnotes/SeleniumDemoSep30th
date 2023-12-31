package com.java.methods;

public class JavaNonStaticMethods {

	public static void main(String[] args) {
		System.out.println("Demo on java methods");
		
		//Standard expression to create a class object
		JavaNonStaticMethods object = new JavaNonStaticMethods();
		
		//Calling non-static method using class object
		object.displayEmpName();
		object.displayEmpName();
		
		//Calling non-static methods using class object
		object.displayEmpName("John Doe");
		System.out.println(object.getEmpSal());
		System.out.println(object.getEmpSal(800));
		System.out.println(object.getFullEmplyeeName("Th", "Kumar"));
	}

	// Declaring a java non-static method without params
	public void displayEmpName() {
		System.out.println("John Legend");
	}

	// Declaring a java non-static method with one param
	public void displayEmpName(String fullName) {
		System.out.println("fullName of the employee: " + fullName);
	}

	// Declaring a non-static method with 2 string params
	public String getFullEmplyeeName(String firstName, String lastName) {
		return firstName + lastName;
	}

	// Declaring a non-static method with return type int and with no params
	public int getEmpSal() {
		int empFixedSal = 2000;
		int empIncentive = 270;
		int finalSal = empFixedSal + empIncentive;
		return finalSal;
	}

	// Declaring a non-static method with return type int and with one param
	public int getEmpSal(int empIncentive) { // 310
		int empFixedSal = 2000;
		int finalSal = empFixedSal + empIncentive;
		return finalSal;
	}

}

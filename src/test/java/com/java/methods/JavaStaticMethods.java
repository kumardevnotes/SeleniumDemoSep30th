package com.java.methods;

public class JavaStaticMethods {

	public static void main(String[] args) {
		System.out.println("Demo on java methods");
		// Calling a method
		displayEmpName();

		// calling method with param
		displayEmpName("Mike Tyson");

		// calling method getEmpSal() without params
		int empSal = getEmpSal();
		System.out.println(empSal);

		// calling method getEmpSal() with param
		empSal = getEmpSal(330);
		System.out.println(empSal);

		// calling method getFullEmplyeeName() with params
		String empFullName = getFullEmplyeeName("John", "Miller");
		System.out.println(empFullName);

		empSal = getEmpSal(110);
		System.out.println(empSal);
		
		empSal = getEmpSal(210);
		System.out.println(empSal);
		
		empSal = getEmpSal(310);
		System.out.println(empSal);
		
		
		 empSal = getEmpSal();
		System.out.println(empSal);
		
		 empSal = getEmpSal();
		System.out.println(empSal);
		
		 empSal = getEmpSal();
		System.out.println(empSal);
	}

	// Declaring a java static method without params
	public static void displayEmpName() {
		System.out.println("John Legend");
	}

	// Declaring a java static method with one param
	public static void displayEmpName(String fullName) {
		System.out.println("fullName of the employee: " + fullName);
	}

	// Declaring a static method with 2 string params
	public static String getFullEmplyeeName(String firstName, String lastName) {
		return firstName + lastName;
	}

	// Declaring a static method with return type int and with no params
	public static int getEmpSal() {
		int empFixedSal = 2000;
		int empIncentive = 270;
		int finalSal = empFixedSal + empIncentive;
		return finalSal;
	}

	// Declaring a static method with return type int and with one param
	public static int getEmpSal(int empIncentive) { // 310
		int empFixedSal = 2000;
		int finalSal = empFixedSal + empIncentive;
		return finalSal;
	}

}

package com.oops.interfaces;

public class EmployeeClass2 implements EmployerInterface {

	public static void main(String[] args) {
		
		EmployeeClass2 employeeObj = new EmployeeClass2();
		employeeObj.displayEmployeeName();
		
		//Trying to call the methods which are overriden by Class
		employeeObj.displayEmployerName();
		employeeObj.displayEmployerFullName("John", "Miller");
		employeeObj.displayEmployerAddress("Kings lane, 100, London");
		System.out.println(employeeObj.displayEmployerID());
		
	}

	public void displayEmployeeName() {
		System.out.println("Employee Name is: Kumar Trainer");
	}

	@Override
	public void displayEmployerName() {
		System.out.println("Bill Gates");
	}

	@Override
	public void displayEmployerFullName(String firstName, String lastName) {
		System.out.println("The fullName of the employee is "+firstName + " " + lastName);
	}

	@Override
	public void displayEmployerAddress(String address) {
		System.out.println("The employee address " + address);
	}

	@Override
	public int displayEmployerID() {
		return 4556566;
	}
}

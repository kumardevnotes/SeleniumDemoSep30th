package com.oops.interfaces;

public class EmployeeClass implements EmployerInterface {

	public static void main(String[] args) {
		
		EmployeeClass employeeObj = new EmployeeClass();
		employeeObj.displayEmployeeName();
		
		//Trying to call the methods which are overriden by Class
		employeeObj.displayEmployerName();
		employeeObj.displayEmployerFullName("John", "Miller");
		employeeObj.displayEmployerAddress("Kings lane, 100, London");
		System.out.println(employeeObj.displayEmployerID());
		
		//We can not create object of the interface
		//EmployerInterface obj = new EmployerInterface();
		
	}

	public void displayEmployeeName() {
		System.out.println("Tom Cruise");
	}

	@Override
	public void displayEmployerName() {
		System.out.println("Elon Musk");
	}

	@Override
	public void displayEmployerFullName(String firstName, String lastName) {
		System.out.println(firstName + " " + lastName);
	}

	@Override
	public void displayEmployerAddress(String address) {
		System.out.println(address);
	}

	@Override
	public int displayEmployerID() {
		return 11232;
	}
}

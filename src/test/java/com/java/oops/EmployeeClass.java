package com.java.oops;

//Encapsulation using private variables and getters/setters methods
           //ChildClass    extends ParentClass
public class EmployeeClass extends EmployerClass {

	public static void main(String[] args) {
		EmployeeClass employeeObj = new EmployeeClass();
	
		System.out.println(employeeObj.getCompanyName());
		System.out.println(employeeObj.getCompanyId());
		
		employeeObj.setCompanyName("Apple");
		employeeObj.setCompanyId(3344);
		
		System.out.println(employeeObj.getCompanyName());
		System.out.println(employeeObj.getCompanyId());
	}
	
	
}

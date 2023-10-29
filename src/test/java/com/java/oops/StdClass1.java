package com.java.oops;

//Inheritance demo in Java
           //ChildClass extends ParentClass
           //SubClass extends SuperClass
public class StdClass1 extends SchoolClass { // 2 + 3  --> 5 methods

	public static void main(String[] args) {
		StdClass1 obj1 = new StdClass1(); //5MB
		obj1.displayStdName("john Miller");
		obj1.displayStdId();
		
		//Calling SchoolClass methods using StdClass1 object
		obj1.displaySchoolName();
		obj1.displaySchoolId();
		obj1.displaySchoolAddress();
		//Below code will give an error becoz the method is private in Parent class
		//obj1.displaySchoolIncome();
	
	}
	
	public void displayStdName(String stdName) {
		System.out.println(stdName);
	}
	
	public void displayStdId() {
		System.out.println(1122);
	}

}

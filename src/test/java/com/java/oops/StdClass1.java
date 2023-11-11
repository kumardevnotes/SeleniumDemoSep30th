package com.java.oops;

//Inheritance demo in Java
           //ChildClass extends ParentClass
           //SubClass extends SuperClass
public class StdClass1 extends SchoolClass { // 2 + 3  --> 5 methods

	public static void main(String[] args) {
		StdClass1 obj1 = new StdClass1(); //5MB
//		obj1.displayStdName("john Miller");
//		obj1.displayStdId();
//		
//		//Calling SchoolClass methods using StdClass1 object
//		obj1.displaySchoolName();
//		obj1.displaySchoolId();
//		obj1.displaySchoolAddress();
		//Below code will give an error becoz the method is private in Parent class
		//obj1.displaySchoolIncome();
		
		obj1.displayCityName();
		obj1.displayCityName();
		obj1.displayCityName();
		
		obj1.displayCityName("NewYork");
		obj1.displayCityName("Berlin");
		obj1.displayCityName("London");
		
		obj1.displaySchoolName();
		
	}
	
	public void displayStdName(String stdName) {
		System.out.println(stdName);
	}
	
	public void displayStdId() {
		System.out.println(1122);
	}
	
	//Static Polymorphism or Method overloading in a java Class. Giving same name  to the methods in a class but with different params list and logic
	
	public void displayCityName() {
		System.out.println("NewJersy");
	}
	
	public void displayCityName(String cityName) {
		System.out.println("The city name is: "+ cityName);
	}
	
	public void displayCityName(String Country, String City) {
		System.out.println(Country + City);
	}
	
	//Dynamic Polymorphism or Method overriding in Java. When child class overides the method which is coming from Parent class
	public void displaySchoolName() {
		System.out.println("The school Name is : English Grammar School");
	}

}

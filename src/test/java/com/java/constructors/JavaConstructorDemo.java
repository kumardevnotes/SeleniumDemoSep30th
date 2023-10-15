package com.java.constructors;

public class JavaConstructorDemo {

	
	//The Constructors with same then it is called constructor overloading - yes
	
	// Declaring a default constructor whose name is same as the className
	JavaConstructorDemo() {
		System.out.println("I am a default constructor1");
	}
	
	// Declaring a parameterized constructor whose name is same as the className
	JavaConstructorDemo(String message) { //Hello All
		System.out.println("I am a param constructor with message: " + message);
	}


	public static void main(String[] args) {
		// create class object as shown below using className
		JavaConstructorDemo obj = new JavaConstructorDemo();

		// calling displayAddress() using above class object
		obj.displayAddress();

		// create one more class object as shown below using className
		JavaConstructorDemo obj2 = new JavaConstructorDemo("Hello All");

		// calling displayAddress() using above class object
		obj2.displayAddress();
	
	}

	// non-static method declaration
	public void displayAddress() {
		System.out.println("Mr John Smith. 132, My Street, Kingston, New York 12401");
	}

}

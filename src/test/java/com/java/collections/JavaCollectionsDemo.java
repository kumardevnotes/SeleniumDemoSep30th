package com.java.collections;

import java.util.ArrayList; //ArrayList is one inbuilt class coming from java.util package
import java.util.List; // List is one inbuilt Interface coming from java.util package

public class JavaCollectionsDemo {

	public static void main(String[] args) {
		
		// Create a single collection object to store employee details such as empName, empId, empGender, empMarStatus, empSal, empCity
		
		//Creating a List collection object to store different types of data
		// List collection is dynamic. No need to declare the size. if you keep on adding/deleting the data, it will manage the memory allocation automatically
		// List converts any value into Object. So it does not care if you pass String/int/float/boolean/char/double
		
		List employeeDetails =  new ArrayList(); // ArrayList implements List internally
		
		employeeDetails.add("John Legend"); // 0
		employeeDetails.add(1122); // 1
		employeeDetails.add('M'); //2
		employeeDetails.add(201); // 3
		employeeDetails.add(true); // 4 
		employeeDetails.add(4000.5); //5
		employeeDetails.add("NewYork"); //
		
		//System.out.println(employeeDetails);
		
		//Usig advanced for loop you can access values in collection object
		for(Object object : employeeDetails ) { //6
			//System.out.println(object);
		}
		
		System.out.println(employeeDetails);
		System.out.println(employeeDetails.get(3)); //201
		System.out.println(employeeDetails.get(0)); // John Legend
		System.out.println(employeeDetails.get(2)); // M

	}

}

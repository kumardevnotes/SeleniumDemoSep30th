package com.java.collections;


import java.util.HashSet;
import java.util.Set;

public class JavaSetDemo {

	public static void main(String[] args) {
		
		// Create a single collection object to store employee details such as empName, empId, empGender, empMarStatus, empSal, empCity
		
		//Creating a set collection object to store different types of data
		// Set collection is dynamic. No need to declare the size. if you keep on adding/deleting the data, it will manage the memory allocation automatically
		// Set converts any value into Object. So it does not care if you pass String/int/float/boolean/char/double
		// Set is not index based
		//Set does not store duplicate elements
		
		Set employeeDetails =  new HashSet(); // HashSet implements Set internally
		
		employeeDetails.add("John Legend");
		employeeDetails.add(1122);
		employeeDetails.add('M');
		employeeDetails.add(201);
		employeeDetails.add(true); 
		employeeDetails.add(4000.5); 
		employeeDetails.add("NewYork"); 
		employeeDetails.add(1122); 
		
		System.out.println(employeeDetails);
		
		//Below code will give undefined method get() error
		//System.out.println(employeeDetails.get(3));
		
		
		employeeDetails.remove(201);
		
		System.out.println(employeeDetails);
		// addAll(), isEmpty(), size(), contains()... Assignment for tomorrow
	

	}

}

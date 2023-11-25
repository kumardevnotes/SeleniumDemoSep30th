package com.java.collections;

public class JavaArraysDemo {

	public static void main(String[] args) {
		
		//Declaring array with size 4. That means array 'empIds' stores only 4 elements
		//Array are fixed in size. you can not add values beyond its size. It is a limitation in array
		// If you can not utilize the full capacity of the array, then its a memory consumption without any use.
		// Arrays store homogeneous data only. That means same type of data
		// Arrays are not dynamic. Adding or deleting values by managing the capacity is not possible in Arrays
		
		int[] empIds = new int[10];
		
		int[] bankCustomerAccNumbers = new int[10000]; //5000
		
		empIds[0] = 1001;
		empIds[1] = 1002;
		empIds[2] = 1003;
		empIds[3] = 1004; //length-1 =  4- 1 = 3
		
		empIds[4] = 1005;
		
		System.out.println(empIds[0]);
		System.out.println(empIds[1]);
		System.out.println(empIds[2]);
		System.out.println(empIds[3]);
		
		//empIds[0] = "John Miller";
		
	}

}

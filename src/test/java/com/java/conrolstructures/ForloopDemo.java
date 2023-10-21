package com.java.conrolstructures;

public class ForloopDemo {

	public static void main(String[] args) {
		
		//declaration; condition; increment or decrement
		for (int i = 0; i < 10; i++) { // i = 10; 10 < 10 --> false
			System.out.println("Hello All " + i); // Hello All 9
		}
		
		System.out.println("******************");
		
		for (int i = 10; i >= 0; i--) { // i = -1; -1 >= 0
			System.out.println("Hello All " + i); // Hello All 
		}
		
   System.out.println("__________________");
		
		for (int i = 0; i < 10; i++) { 
			if( i == 2) { // 2 == 2 --> true
				break; // break will terminate the forloop upon the if condition becomes true
			}
			System.out.println("Hello All " + i); 
		}
		
		  System.out.println("*******************");

		for (int i = 0; i < 5; i++) { 
			if( i == 2) { // 4 == 2 --> true
				continue; // continue will skip the current iteration or loop upon the if condition becomes true
			}
			System.out.println("Hello All " + i); 
		}
	
		
	}

}

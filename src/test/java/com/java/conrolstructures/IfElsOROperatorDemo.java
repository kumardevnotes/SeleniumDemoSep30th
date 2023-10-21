package com.java.conrolstructures;

public class IfElsOROperatorDemo {

	public static void main(String[] args) {

		// If..else is a control structure in Java
		// || - OR operator in java
		
		/*
		 * OR Operator
		 * 
		 * true || true --> true
		 * true || false --> true
		 * false || true --> true
		 * false || false --> false
		 * 
		 * */
		
		
		/*
		 * HR --> 1122
		 * Revenue --> 3344
		 * IT --> 5566
		 * Engineering ----> 7788
		 * */
		
		int deprtID =  1001;
		
		if(deprtID == 1122 || deprtID == 3344) { // true || false --> false
			System.out.println("Both HR and Revenue departments come under same umbrella");
		} else if(deprtID == 5566 || deprtID == 7788) {
			System.out.println("Both IT and Engineering departments come under same umbrella");
		} 
		else {
			System.out.println("You have entered invalid deprtId. Please check");
		}
		
	}

}

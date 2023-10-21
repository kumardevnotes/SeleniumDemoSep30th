package com.java.conrolstructures;

public class IfElseANDOperatorDemo {

	public static void main(String[] args) {

		int personAge = 18;

		// If..else is a control structure in Java
		// && -- AND operator in java
		
		/*
		 * AND Operator
		 * 
		 * true && true --> true
		 * true && false --> false
		 * false && true --> false
		 * false && false --> false
		 * 
		 * */
		
		if (personAge >= 18 && personAge <= 60) { // 77 >= 18 && 77 <= 60 --> true && false --> false
			System.out.println("you can go to voting station and vote");
		} else if (personAge > 60) { //77 > 60 --> true
			System.out.println("You can vote online from your Home");
		}
		else {
			System.out.println("You can not vote");
		}
	}

}

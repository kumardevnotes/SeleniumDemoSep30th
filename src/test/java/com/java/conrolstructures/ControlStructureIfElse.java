package com.java.conrolstructures;

public class ControlStructureIfElse {

	public static void main(String[] args) {

		int personAge = 17;

		// If..else is a control structure in Java
		if (personAge >= 18 && personAge <= 60) { // 17 >= 18 && 17 <= 60 --> false && true --> false
			System.out.println("you can go to voting station and vote");
		} else if (personAge > 60) { // 17 > 63 --> false
			System.out.println("You can vote online from your Home");
		}
		else {
			System.out.println("You can not vote");
		}
	}

}

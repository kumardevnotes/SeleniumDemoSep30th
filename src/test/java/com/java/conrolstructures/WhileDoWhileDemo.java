package com.java.conrolstructures;

public class WhileDoWhileDemo {

	public static void main(String[] args) {
		
		int num = 5;
		
		//In while block, condition is checked first and upon it is true, then the code in while block is executed
		while(num > 0) { // 0 > 0 --> false
			System.out.println(num);
			num--; //4-1 = 3
		}
		
		//In do..while block, the code in do block is executed first and then the condition is checked
		
		int num1 = 5;
		do {
			System.out.println(num1);
			num1--; // num1 == 0
		}while (num1 > 0); // 0 > 0 --> false
	}

}

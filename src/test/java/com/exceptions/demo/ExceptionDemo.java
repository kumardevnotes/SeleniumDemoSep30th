package com.exceptions.demo;

public class ExceptionDemo {

	// dynamic or unchecked exception
	public static void main(String[] args) {

		//Exception Handling example in Java
		
		try {
			String empName = "John Doe";
			System.out.println(empName.toUpperCase());

			int a = 100, b = 0;
			System.out.println(a / b);
		}
		
		catch (NullPointerException e) {
			System.out.println("Caught an exception: " + e);
		}

		catch (ArithmeticException e) {
			System.out.println("Caught an exception: " + e);
		}

		//optional block in exception Handling mechanism. It always runs whther you get exception or not in tey block
		
		finally {
			System.out.println("finally block is always executed");
		}
		
		System.out.println("main() execution is complete");

	}

}

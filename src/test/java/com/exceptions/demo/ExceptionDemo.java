package com.exceptions.demo;

public class ExceptionDemo {

	public static void main(String[] args) {

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

		//optional block in exception Handling mechanism
		
		finally {
			System.out.println("finally block is always executed");
		}
		
		System.out.println("main() execution is complete");

	}

}

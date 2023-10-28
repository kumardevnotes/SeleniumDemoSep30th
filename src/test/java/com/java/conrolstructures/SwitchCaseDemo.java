package com.java.conrolstructures;

public class SwitchCaseDemo {

	public static void main(String[] args) {

		String weekDay = "Sundayy";
		int empId = 1122;

		switch (weekDay) {
		case "Monday":
			System.out.println("It is Monday and Its weekdayA");
			System.out.println("It is Monday and Its weekdayB");
			System.out.println("It is Monday and Its weekdayC");
			//
			//
			//
			break;
		case "Tuesday":
			System.out.println("It is Tuesday and Its weekday");
			break;
		case "Wednesday":
			System.out.println("It is Wednesday and Its weekday");
			break;
		case "Thursday":
			System.out.println("It is Thursday and Its weekday");
			break;
		case "Friday":
			System.out.println("It is Friday and Its also a weekday");
			break;
		case "Saturday":
			System.out.println("It is Saturday and Its Weekend");
			break;
		case "Sunday":
			System.out.println("It is Sunday and Its weekend");
			break;
		default:
			System.out.println("Please check the day that you passed...");
		}
		
		System.out.println("I am outside switchcase");

	}

}

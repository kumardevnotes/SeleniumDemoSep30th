package com.java.collections;

import java.util.HashMap;
import java.util.Map;

public class JavaMapDemo {

	public static void main(String[] args) {
		/*
		 * Store Employee Data as shown below
		 * 
		 * empName ---> John empId --> 1122 empMarStaus --> True empCity --> Newyork
		 * empSal --> 5000.50 empDepartmentID ---> 1122
		 */

		// Map stores data in the form of Key and Value pair where Keys should be unique but not the values
		// Map is dynamic. No need to give any size before sotring values into Map collection object

		Map<String, String> myemplyeeData = new HashMap<String, String>(); // HashMap implements Map interface
		myemplyeeData.put("empName", "John");
		myemplyeeData.put("empId", "1122");
		myemplyeeData.put("empMarStaus", "true");
		myemplyeeData.put("empCity", "Newyork");
		myemplyeeData.put("empSal", "5500");
		myemplyeeData.put("empDepartmentID", "1122");

//		System.out.println(myemplyeeData);
		myemplyeeData.put("empCity", "NewJersy");

//		System.out.println(myemplyeeData.get("empId"));
//		System.out.println(myemplyeeData.get("empCity"));

//		System.out.println(myemplyeeData);

//		System.out.println(myemplyeeData.keySet());
//		System.out.println(myemplyeeData.values());
//		

		System.out.println(myemplyeeData);

		System.out.println(myemplyeeData.remove("empDepartmentID"));

		System.out.println(myemplyeeData);

		for (Map.Entry<String, String> keyValueSet : myemplyeeData.entrySet()) {
			System.out.println("Key = " + keyValueSet.getKey() + ", Value = " + keyValueSet.getValue());
		}

	}

}

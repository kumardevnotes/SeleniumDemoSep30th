package com.oops.interfaces;

//Abstract class starts with abstract keyword and it contains methods with body and methods without body (abstract method)
public abstract class JavaClassDemo {
	
	//Concrete method means method with full body or logic
	public void displayMessage() {
		System.out.println("Hell All! Good Morning :)");
	}
	
	//Abstract method. It starts with abstract keyword and no body/logic
	public abstract void displayWarning();
}

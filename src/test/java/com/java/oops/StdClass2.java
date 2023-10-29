package com.java.oops;

import com.java.methods.SchoolClass123;

public class StdClass2 extends SchoolClass123 {

	int stdId = 112233;

	public static void main(String[] args) {
		StdClass2 obj = new StdClass2();
		// obj.displaySchoolRank();
		// obj.displaySchoolBranch();

		obj.displayStdId();

//		SchoolClass123 obj2 =  new SchoolClass123();
//		obj2.displaySchoolBranch();
	}

	public void displayStdId() {
		System.out.println(stdId);
		System.out.println(this.stdId);
		System.out.println(super.stdId);
		this.displayMarks();
		super.displayMarks();
	}

	
	public void displayMarks() {
		System.out.println(60);
	}
}

package com.java.oops;

import com.java.methods.SchoolClass123;

public class StdClass2 extends SchoolClass123{

	public static void main(String[] args) {
		StdClass2 obj = new StdClass2();
		obj.displaySchoolRank();
		obj.displaySchoolBranch();
		
		SchoolClass123 obj2 =  new SchoolClass123();
		obj2.displaySchoolBranch();
	}

}

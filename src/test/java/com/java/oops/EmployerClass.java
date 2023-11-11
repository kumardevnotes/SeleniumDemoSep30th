package com.java.oops;

public class EmployerClass {
	
	private String companyName = "Microsoft Systems" ;
	
	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	private int companyId = 1122 ;
	
	public int getCompanyId() {
		return companyId;
	}
	
	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}

	
	
	public static void main(String args[]) {
		EmployerClass employerObj = new EmployerClass();
		System.out.println(employerObj.companyName);
		System.out.println(employerObj.companyId);
	}
	
}

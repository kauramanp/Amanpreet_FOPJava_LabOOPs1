package com.amanpreet.oops1;

public class Employee {
	
	private String firstName;
	private String lastName;
	private String companyName;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public Employee(String firstName, String lastName, String companyName) {
		super();
		this.companyName = companyName;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	

}

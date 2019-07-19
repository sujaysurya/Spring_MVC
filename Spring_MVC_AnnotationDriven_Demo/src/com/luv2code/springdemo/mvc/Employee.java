package com.luv2code.springdemo.mvc;

public class Employee {
	private String firstName;
	private String lastName;
	private long socialSecurity;
	private long telephoneNumber;
	private long employeeID;

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

	public long getSocialSecurity() {
		return socialSecurity;
	}

	public void setSocialSecurity(long socialSecurity) {
		this.socialSecurity = socialSecurity;
	}

	public long getTelephoneNumber() {
		return telephoneNumber;
	}

	public void setTelephoneNumber(long telephoneNumber) {
		this.telephoneNumber = telephoneNumber;
	}

	public long getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(long employeeID) {
		this.employeeID = employeeID;
	}

}

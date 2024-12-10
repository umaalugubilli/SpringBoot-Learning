package com.mahesh.rest.webservices.rest_full_webservices.versioning;

public class PersonName {
	
	private String firstName;
	private String secondName;
	
	public PersonName(String firstName, String secondName) {
		super();
		this.firstName = firstName;
		this.secondName = secondName;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getSecondName() {
		return secondName;
	}

	@Override
	public String toString() {
		return "PersonName [firstName=" + firstName + ", secondName=" + secondName + "]";
	}
	
	
	
	

}

package com.mahesh.rest.webservices.rest_full_webservices.versioning;

public class PersonV2 {
	
	private PersonName personName;

	public PersonV2(PersonName personName) {
		super();
		this.personName = personName;
	}

	public PersonName getPersonName() {
		return personName;
	}

	@Override
	public String toString() {
		return "PersonV2 [personName=" + personName + "]";
	}
	
	
	
	
	
}

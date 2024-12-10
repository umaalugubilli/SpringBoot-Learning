package com.mahesh.rest.webservices.rest_full_webservices.versioning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersioningPersonController {
	
	@GetMapping("/v1/person")
	public PersonV1 getFirstVersionOfPerson() {
		return new PersonV1("Bob Junior");
	}
	
	@GetMapping("/v2/person")
	public PersonV2 getSeconfVersionOfPerson() {
		return new PersonV2(new PersonName("Bob", "Junior"));
	}
	
	@GetMapping(path ="/person", params = "version=1")
	public PersonV1 getFirstVersionOfPersonRequestParameter() {
		return new PersonV1("Bob Junior");
	}
	
	@GetMapping(path="/person", params = "version=2")
	public PersonV2 getSeconfVersionOfPersonRequestParameter() {
		return new PersonV2(new PersonName("Bob", "Junior"));
	}
	
	@GetMapping(path = "/person/header", headers = "X-API-VERSION=1")
	public PersonV1 getFirstVersionOfPersonRequestHeader() {
		return new PersonV1("Bob Junior");
	}
	
	@GetMapping(path="/person/header", headers = "X-API-VERSION=2")
	public PersonV2 getSeconfVersionOfPersonRequestHeader() {
		return new PersonV2(new PersonName("Bob", "Junior"));
	}
	
	@GetMapping(path = "/person/accept", produces = "application/vnd.company.app-v1+json")
	public PersonV1 getFirstVersionOfPersonAcceptHeader() {
		return new PersonV1("Bob Junior");
	}
	
	@GetMapping(path="/person/accept", produces = "application/vnd.company.app-v2+json")
	public PersonV2 getSeconfVersionOfPersonAcceptHeader() {
		return new PersonV2(new PersonName("Bob", "Junior"));
	}


}

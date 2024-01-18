package odev3.entitites.concretes;

import odev3.entitites.abstracts.Entity;

public class User implements Entity {

	private int id;
	private String firstName;
	private String lastName;
	private String nationalIdentity;
	private String dateOfBirth;
	
	public User() {
		
	}
	
	public User(int id, String firstName, String lastName, String nationalIdentity, String dateOfBirth) {
		this.id=id;
		this.firstName=firstName;
		this.lastName=lastName;
		this.nationalIdentity=nationalIdentity;
		this.dateOfBirth=dateOfBirth;
		
	}
	
	public int getId() {
		return this.id;
	}
	
	public void setId(int id) {
		this.id=id;
	}

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

	public String getNationalIdentity() {
		return nationalIdentity;
	}

	public void setNationalIdentity(String nationalIdentity) {
		this.nationalIdentity = nationalIdentity;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	
	
	
	
}

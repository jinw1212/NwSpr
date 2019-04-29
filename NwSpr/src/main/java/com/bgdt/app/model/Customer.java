package com.bgdt.app.model;

public class Customer {
	private String name;
	private String gender;
	private String email;
	private int birthyear;
	
	public Customer(String name, String gender, String email, int birthyear) {
		super();
		this.name = name;
		this.gender = gender;
		this.email = email;
		this.birthyear = birthyear;
	}

	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getBirthyear() {
		return birthyear;
	}

	public void setBirthyear(int birthyear) {
		this.birthyear = birthyear;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", gender=" + gender + ", email=" + email + ", birthyear=" + birthyear + "]";
	}		
	
}

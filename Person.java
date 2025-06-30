package com.app.dkte;

public class Person {
	String name;
	MyDate dateOfBirth;
	
	public Person() {
		
	}

	public Person(String name, MyDate dateOfBirth) {
		super();
		this.name = name;
		this.dateOfBirth = dateOfBirth;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public MyDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(MyDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", dateOfBirth=" + dateOfBirth + "]";
	}
	
	
	
	

}

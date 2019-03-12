package com.Person;

public class Person 
{
	private String firstName;
	private String lastName;
	private String nameString;
	private char gender;
	private long phoneNumber;
	
	public Person (String firstName, String lastName, char gender, long phoneNumber)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.phoneNumber = phoneNumber;
		nameString = firstName + " " + lastName;
		
	}
	
	public void displayPDs() 
	{
		System.out.println(nameString);
		System.out.println(gender);
		System.out.println(phoneNumber);
	}
	
	public void calculateAge() 
	{
		
	}
	
	public String getFullName(String firstName, String lastName)
	{
		nameString = firstName + " " + lastName;
		return nameString;
		
	}
}

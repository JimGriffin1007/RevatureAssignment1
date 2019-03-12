package com.Person;

public class Main 
{
	public static void main(String[] args) 
	{
		Person person1 = new Person("Jim", "Griffin", 'M', 3215781007l);
		person1.displayPDs();
		System.out.println(person1.getFullName("James", "Griffin"));
	}
}

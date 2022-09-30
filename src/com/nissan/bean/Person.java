package com.nissan.bean;

public class Person {
	//instance variable
	String name;
	int age;
	double salary;
	
	//Parameterized constructor
	public Person(String name, int age, double salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
		
		System.out.println("Name is " + name);
		System.out.println("age is " + age);
		System.out.println("salary is " + salary);
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}
	
}

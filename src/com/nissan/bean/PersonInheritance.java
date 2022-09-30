package com.nissan.bean;

import java.util.Scanner;

public class PersonInheritance {
	private String name;
	private int age;

	// Default constructor
	public PersonInheritance() {
		super();
	}

	// Parameterized constructor
	public PersonInheritance(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	// Getter and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	// Custom methods
	public void readData() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter name : ");
		this.name = input.nextLine();

		System.out.println("Enter age : ");
		this.age = Integer.parseInt(input.nextLine());
	}

	public void display() {
		System.out.println("Name is " + this.name);
		System.out.println("Age is " + this.age);
	}

	@Override
	public String toString() {
		return "PersonInheritance [name=" + name + ", age=" + age + "]";
	}

}

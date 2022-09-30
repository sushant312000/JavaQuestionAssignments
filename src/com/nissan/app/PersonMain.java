package com.nissan.app;

import java.util.Scanner;

import com.nissan.bean.Person;

public class PersonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter name : ");
		String name = input.nextLine();
		
		System.out.println("Enter age : ");
		int age = input.nextInt();
		
		System.out.println("Enter salary : ");
		double salary = input.nextDouble();
		
		Person person1 = new Person(name, age, salary);
		System.out.println(person1.toString());
	}

}

package com.nissan.bean;

import java.util.Random;
import java.util.Scanner;

public class EmployeeInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the name :");
		String name = input.nextLine();
		
		System.out.print("Enter Gender :");
		String gender = input.next();
		
		System.out.print("Marital Status :");
		String isMaried = input.next();
		
		System.out.print("Enter birth year :");
		int birthYear = input.nextInt();
		
		System.out.print("Enter Weight :");
		float weight = input.nextFloat();
		
		System.out.print("Enter GPA :");
		float gpa = input.nextFloat();
		
		//Close the scanner 
		input.close();
		
		displayInfo(name, gender, isMaried, birthYear, weight, gpa);
//		System.out.println(name + "\n" + gender + "\n" + isMaried + "\n" + weight + "\n" + gpa + "\n"  + id + "\n");
		

	}

	private static void displayInfo(String name, String gender,String marriage_status,int birthYear,float weight,float gpa) {
		// TODO Auto-generated method stub
		System.out.println("Name 			-> " + name);
		System.out.println("Gender  		-> " + gender);
		System.out.println("Marital Status  -> " + marriage_status);
		System.out.println("Birth year 		-> " + birthYear);
		System.out.println("Weight 			-> " + weight);		
		System.out.println("GPA 			-> " + gpa);
		System.out.println("Emp Id 			-> " + empId());
	}
	
	private static long empId() {
		Random rand = new Random();
		int empId = 100000 + rand.nextInt(900000);
		return empId;
	}
}

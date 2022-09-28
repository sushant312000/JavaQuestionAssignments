package com.nissan.bean;

import java.util.Scanner;

public class AverageOfMarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		//Asking user to enter number of student
		System.out.println("Enter number of students");
		
		//Entering number of student
		int numberOfStudents = input.nextInt();
		
		//made a student array to store the marks
		int[] students = new int[numberOfStudents];
		
		//Initialize the average variable
		int average = 0;
		
		//Asking user to enter marks of the array
		System.out.println("Enter the marks of students");
		
		//storing and adding the marks in average variable
		for(int i=0; i<numberOfStudents; i++) {
			students[i] = input.nextInt();
			average += students[i];
		}
		
		//Showing the average
		System.out.println("Average is: " + average/numberOfStudents);
	}

}

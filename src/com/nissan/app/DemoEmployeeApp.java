package com.nissan.app;

import java.util.Scanner;

import com.nissan.bean.Employee;

public class DemoEmployeeApp {

	public static void main(String[] args) {
		//Declare variables
		Scanner input = new Scanner(System.in);
		Employee[] employees = new Employee[5];
		
		//menu driven
		char choice = 'n';
		int i=0;
		
		do {
			//get values from user
			System.out.println("Enter employee id : ");
			int empCode = Integer.parseInt(input.nextLine());
			
			System.out.println("Enter the employee name : ");
			String empName = input.nextLine();
			
			System.out.println("Enter employee Designation : ");
			String designation = input.nextLine();
			
			System.out.println("Enter employee salary : ");
			String salary = input.nextLine();
			
			if(salary.equals("")) {
				employees[i] = new Employee(empCode, empName, designation);
			}
			
			else {
				employees[i] = new Employee(empCode, empName, designation, Double.parseDouble(salary));
			}
			
			i++;
			System.out.println("Do you Want to continue (y/n)");
			
			choice = input.nextLine().charAt(0);
			
		}while(choice=='y' || choice=='Y');
		
		for(int j=0; j<i; j++) {
			employees[j].displayDetails();
			System.out.println();
		}
		
		input.close();
	}

}

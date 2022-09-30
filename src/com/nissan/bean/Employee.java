package com.nissan.bean;

public class Employee {
	//instance variables
	private int empCode;
	private String empName;
	private String designation;
	private double salary;
	
	//default constructor
	public Employee() {
		
	}
	
	//parameterized constructor 1
	public Employee(int eCode, String eName, String designation, double salary) {
		this.empCode = eCode;
		this.empName = eName;
		this.designation = designation;
		this.salary = salary;
	}

	//parameterized constructor 2
	public Employee(int empCode, String empName, String designation) {
		super();
		this.empCode = empCode;
		this.empName = empName;
		this.designation = designation;
		
		//check condition 
		if(designation.equalsIgnoreCase("clerk")) {
			this.salary = 5000;
		}
		else if(designation.equalsIgnoreCase("peon")) {
			this.salary = 2000;
		}
		else if(designation.equalsIgnoreCase("Manager")) {
			this.salary = 10000;
		}
		else {
			this.salary = 1000;
		}
	}
		
	//methods
	public void displayDetails() {
		System.out.println("Employee ID is " + this.empCode);
		System.out.println("Employee name " + this.empName);
		System.out.println("Employee designation " + this.designation);
		System.out.println("Employee Salary " + this.salary);
	}

	@Override
	public String toString() {
		return "Employee [empCode=" + empCode + ", empName=" + empName + ", designation=" + designation + ", salary="
				+ salary + "]";
	}
	
	
}

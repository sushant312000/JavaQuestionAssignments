package oop;

public class Employee {
	//member variables
	private int empId;
	private String empName;
	
	//static variables
	static String officeName;
	
	//default constructor --no arguments
	public Employee() {
		
	}
	
	//parameterized constructor --argument
	public Employee(int empId, String empName) {
		this.empId = empId;
		this.empName = empName;
	}
	
	public Employee(String name) {
		this.empName = name;
	}
	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + "]";
	}

	public void displayReport() {
		System.out.println("ID is " + empId);
		System.out.println("Employee name is " + empName);
//		System.out.println("Office name is  " + officeName);
	}
	//member (or) method function 
}

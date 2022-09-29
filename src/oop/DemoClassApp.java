package oop;

public class DemoClassApp {
	public static void main (String[] args) {
		// TODO Auto-generated method stub
		Employee firstEmp = new Employee(1000, "sushant");		//Instantiation
		firstEmp.displayReport();								//calling data method
		
		Employee secondEmp = new Employee(1002, "Akash");
		secondEmp.displayReport();
		
		
		System.out.println(firstEmp.toString());
		
	}
}

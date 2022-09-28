package com.nissan.bean;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DemoException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		try {
//			Scanner input = new Scanner(System.in);
//			
//			int firstNum, secondNum, result;
//			
//			System.out.println("Enter first number :");
//			firstNum = input.nextInt();
//			
//			System.out.println("Enter second number :");
//			secondNum = input.nextInt();
//			
//			result = firstNum/secondNum;
//			
//			System.out.println("The result is " + result);
//		}
//		catch(ArithmeticException ex){
//			System.out.println("Sorry, Invalid Entry");
//		}
		try {
			Scanner input = new Scanner(System.in);
			
			System.out.println("Enter Employee ID");
			int empId = input.nextInt();
			
			System.out.println("Employee ID is " + empId);
		}
		
		catch(InputMismatchException ex) {
			System.out.println("Enter valid empId");
		}
	}

}

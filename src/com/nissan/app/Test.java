package com.nissan.app;

import java.util.Scanner;

import com.nissan.bean.UnderGraduate;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Creating input variable
		Scanner input = new Scanner(System.in);
		
		//Creating an object of under graduate class
		UnderGraduate ug = new UnderGraduate();
		
		System.out.println("Enter ");
		
		System.out.println("Enter under graduate marks");
		double grade = Double.parseDouble(input.nextLine());
		
		ug.setStudentGrade(grade);
		
		boolean result = ug.isPassed(ug.getStudentGrade());
		
		if(result) {
			System.out.println(ug.getStudentName() + " is Passed ");
		}
		else {
			System.out.println(ug.getStudentName() + " is Failed ");
		}
	}

}

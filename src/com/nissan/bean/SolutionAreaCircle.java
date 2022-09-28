package com.nissan.bean;

import java.util.Scanner;

//Class
public class SolutionAreaCircle {
	//Entry Point
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter radius:- ");
		double radius = input.nextDouble();
		
		System.out.println(String.format("Area is %.2f", areaCircle(radius)));
		System.out.print("Circumference is " + circumference(radius));
	}
	
	//Calculation Area
	
	private static double areaCircle(double radius) {
		return radius * radius * Math.PI;
	}
	
	//Calculation Circumference
	
	private static double circumference(double radius) {
		return 2 * Math.PI * radius * radius;
	}

}

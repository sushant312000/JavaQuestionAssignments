package com.nissan.bean;

import java.util.Scanner;

public class BodyMassIndex {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter weight in pounds : ");
		double weightInPounds = sc.nextDouble();
		
		System.out.print("Enter the height in inches");
		float heightInInches = sc.nextFloat();
		
		//Weight in kilograms
		double weightInKilo = weightInKilograms(weightInPounds);
		
		//Height in Meters
		double heightInMeters = heightInMeters(heightInInches);
		
		System.out.printf("BMI is : %0.1f",bmi(weightInKilo, heightInMeters));
	}

	//Weight converting method

	private static double weightInKilograms(double weightInPounds) {
		return weightInPounds * 0.45359273;
	}
	
	//Height conversion method
	
	private static double heightInMeters(float heightInInches) {
		return heightInInches * 0.0254;
	}
	
	private static double bmi(double weightInKilo, double heightInMeters) {
		return weightInKilo/(heightInMeters)*(heightInMeters);
	}
	
}

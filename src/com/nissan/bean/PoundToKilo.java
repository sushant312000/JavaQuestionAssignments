package com.nissan.bean;

import java.util.Scanner;

public class PoundToKilo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		double pound = input.nextDouble();
		double kilogram = poundToKilo(pound);
		
//		System.out.println()
	}

//	Conversion method
	private static double poundToKilo(double pound) {
		return pound * 0.456;
	}

}

package com.nissan.bean;

import java.util.Scanner;

public class SumOfDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		//Asking user to input the number as string
		System.out.print("Enter the string : ");
		
		//Entering the input from user
		String firstString = input.nextLine();
		
		//Converting the string value in integer
		Integer valueOfString = Integer.parseInt(firstString);
		
		//Initialize the sum of digit variable
		int sumOfDigit = 0;
		
		//Getting the last number from the digit and add it in the sum of digit variable
		while(valueOfString != 0) {
			
			int lastDigit = valueOfString % 10;
			sumOfDigit += lastDigit;
			valueOfString = valueOfString / 10;
		}
		
		//Outputting the sum of the digit
		System.out.println(sumOfDigit);
	}

}

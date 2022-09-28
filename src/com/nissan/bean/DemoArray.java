package com.nissan.bean;

import java.util.Scanner;

public class DemoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		// Entering the length of array
		System.out.println("Enter length of the array: ");
		
		// Asking the array length in lengthOfArray variable
		int lengthOfArray = input.nextInt();

		//making a array 
		int[] arr = new int[lengthOfArray];

		//entering the elements in array
		System.out.println("Enter the elements in the array");
		for (int i = 0; i < lengthOfArray; i++) {
			arr[i] = input.nextInt();
		}

		//Printing the array 
		for (int j = 0; j < arr.length; j++) {
			System.out.print(arr[j] + " ");
		}
	}

}

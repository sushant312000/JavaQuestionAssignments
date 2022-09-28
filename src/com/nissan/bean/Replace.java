package com.nissan.bean;

import java.util.Scanner;
public class Replace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Making input variable
		Scanner input = new Scanner(System.in);
		
		//Entering input string
		String originalString = input.nextLine();
		
		//Using replace all function to replace every "is" with "is not";
		String replacedString = originalString.replaceAll("is", "is not");

	}

}

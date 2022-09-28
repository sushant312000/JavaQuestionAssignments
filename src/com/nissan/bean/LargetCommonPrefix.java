package com.nissan.bean;

import java.util.Scanner;

public class LargetCommonPrefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String stringOne = input.nextLine();
		String stringTwo = input.nextLine();

		// Find length of smallest string
		int smaller = Math.min(stringOne.length(), stringTwo.length());

		// length of smaller string as max loop iteration

		// character to be checked from first to second

		// String builder is used to append
		StringBuilder commonString = new StringBuilder();
		for (int i = 0; i < smaller; i++) {
			char c = stringOne.charAt(i);

			// Check Condition
			if (c == stringTwo.charAt(i)) {
				commonString.append(c);
			} else {
				break;
			}
		}
		
		if(commonString.length()==0) {
			System.out.println(stringOne + " and " + stringTwo + " have no common prefix");
		}
		
	}

}

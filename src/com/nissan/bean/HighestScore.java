package com.nissan.bean;

import java.util.Scanner;

public class HighestScore {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int num = input.nextInt();
		String[] names = new String[num];
		int[] scores = new int[num];
		
		for(int i=0; i<num; i++) {
			names[num] = input.nextLine();
			scores[num] = input.nextInt();
		}
	}
	
//	private static String maxScore(String[] names, int[] scores) {
//		return ""; 
//	}
}

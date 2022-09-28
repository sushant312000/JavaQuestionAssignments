package com.nissan.bean;

import java.util.Scanner;

/* Development Steps:- 
 * 1. Menu driven -do while (y/n)
 * 2. 
 * 
 */

public class FindDays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declare variables
		Scanner sc = new Scanner(System.in);
		char inputYesOrNo = 'y';
		// 1. Menu driven
		do {
			System.out.println("Enter a month (1 - 12): ");
			int month = sc.nextInt();

			System.out.print("Enter a year: ");
			int year = sc.nextInt();

			int daysInMonth = getDaysInMonth(month, year);

			String monthName = getMonthName(month);
			
			System.out.println("No. of days are : " + daysInMonth);
			System.out.println("Do you Want to continue: (y/n)");
			
			inputYesOrNo = sc.next().charAt(0);
			
		} while (inputYesOrNo == 'y');
	}
	
	//Get month name
	private static String getMonthName(int month) {
		// TODO Auto-generated method stub
		String outPut = "";
		
		if(month < 1 || month > 12) {
			outPut = "Invalid entry, Enter month number";
		}
		
		else {
			switch(month) {
			
			case 1:
				outPut = "January";
				break;
	
			case 2:
				outPut = "February";
				break;

			case 3:
				outPut = "March";
				break;

			case 4:
				outPut = "April";
				break;			
			case 5:
				outPut = "May";
				break;
			case 6:
				outPut = "June";
				break;
			case 7:
				outPut = "July";
				break;
			case 8:
				outPut = "August";
				break;
			case 9:
				outPut = "September";
				break;
			case 10:
				outPut = "October";
				break;
			case 11:
				outPut = "November";
				break;
			case 12:
				outPut = "December";
				break;
			}	
		}
		
		return outPut;
	}
	
	//Get days in a month function
	private static int getDaysInMonth(int month, int year) {
		// TODO Auto-generated method stub
		int days = -1;
		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
			days = 31;
		} else if (month == 4 || month == 6 || month == 9 || month == 11) {
			days = 30;
		} else {
			days = isLeapYear(year) ? 29 : 28;
		}
		return days;
	}
	
	//Checl leap year function
	private static boolean isLeapYear(int year) {
		// TODO Auto-generated method stub
		return (year % 4 == 0 && !(year % 100 == 0)) || year % 400 == 0;
	}

}

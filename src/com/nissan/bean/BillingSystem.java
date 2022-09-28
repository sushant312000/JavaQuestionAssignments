package com.nissan.bean;

import java.util.Random;
import java.util.Scanner;

public class BillingSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		//Initialize the choice variable
		char inputYesOrNo = 'n';

		do {
			
			//Asking user to enter city name
			System.out.println("Enter city name: ");
			
			//Entering city name
			String cityName = input.next();
			
			//Getting language from getLanguage function and storing the value in language variable
			String language = getLanguage(cityName);

			//Getting ID from getId function and storing the value in id variable
			long id = getId();

			//Asking user to enter the date from user
			String date = input.nextLine();

			//Asking user to enter billing amount
			double amount = input.nextDouble();

			//Printing the details
			System.out.println("City Name     		=> " + cityName);
			System.out.println("Language      		=> " + language);
			System.out.println("Customer ID   		=> " + id);
			System.out.println("Billing Date  		=> " + date);
			System.out.println("Amount oustanding   => " + amount);

			//Asking user to to continue;
			System.out.println("Do you Want to continue: (y/n)");

			inputYesOrNo = input.next().charAt(0);
			
		} while (inputYesOrNo == 'y');
	}
	
	//Function to get Id
	private static long getId() {
		// TODO Auto-generated method stub
		Random rand = new Random();
		long custId = 100000 + rand.nextInt(900000);
		return custId;
	}
	
	//Function to get language
	private static String getLanguage(String cityName) {
		// TODO Auto-generated method stub
		String lang = "";
		if (cityName == "US") {
			lang = "English";
		} else if (cityName == "France") {
			lang = "French";
		} else {
			lang = "English";
		}

		return lang;

	}

}

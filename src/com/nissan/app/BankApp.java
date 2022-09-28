package com.nissan.app;

import java.util.Scanner;
import com.nissan.bean.*;

public class BankApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		// Making array of cutomer names
		String[] customerNames = new String[20];

		// Making array of opening balances
		double[] openingBalances = new double[20];

		// Creating object of Customer class from com.nissan.bean package
		Customer checkCustomer = new Customer();

		// Choice
		char choice = 'n';
		String enterCustomerName = "";
		// menu driven
		do {

			//Asking to enter customer name
			System.out.println("Enter customer names: ");
			enterCustomerName = input.nextLine();
			
			//calling the checkCustomerExists function from the object
			if (checkCustomer.checkCustomerExists(enterCustomerName, customerNames)) {
				System.out.println("customer Already exists");
				continue;
			}
		}

		while (choice == 'y' || choice == 'Y');
	}

}

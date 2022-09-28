package com.nissan.bean;

import java.util.Scanner;

public class BankApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Made input object of scanner class
		Scanner input = new Scanner(System.in);

		double totalBalance = 7000;
		double minBalance = 5000;
		double availBalance = totalBalance - minBalance;

		// Initializing the
		char inputYesOrNo = 'y';

		System.out.println("Enter PIN");

		int pin = input.nextInt();

		if (pin == 112233) {

			do {
				// Choices
				System.out.println("Welcome Sushant ... ");

				System.out.println("1. Deposite");
				System.out.println("2. Withdrawl");
				System.out.println("3. Show balanace");
				System.out.println("4. Exit");
				System.out.println("Enter the choice between 1 - 4");

				// Inputing the choice
				int choice = input.nextInt();

				// Menu driven
				switch (choice) {
				case 1:
					System.out.println("Enter the amount to deposite");
					double amount = input.nextDouble();
					deposit(availBalance, amount);
					break;

				case 2:
					System.out.println("Enter the amount to withdraw");
					double withdrawAmount = input.nextDouble();
					withdraw(minBalance, withdrawAmount, availBalance);
					break;

				case 3:
					System.out.println("You Total Balance is : ");
					showBalance(availBalance);
					break;

				case 4:
					System.out.println("Exit");
					break;

				default:
					System.out.println("Enter valid choice between 1 to 4");
					break;
				}

				System.out.println("Do you want to continue (y/n) ");
				inputYesOrNo = input.next().charAt(0);

			} while (inputYesOrNo == 'y' || inputYesOrNo == 'Y');
		}

		else {
			System.out.println("Wrong PIN, Enter again");
		}
	}

	// Show Balance function
	private static void showBalance(double availBalance) {
		System.out.println("your balance is " + availBalance);
	}

	// Withdraw Function
	private static void withdraw(double minBalance, double withdrawAmount, double availBalance) {
		// TODO Auto-generated method stub
		if (withdrawAmount < 0) {
			System.out.println("Enter valid amount");
		} else if (withdrawAmount > minBalance || availBalance == 0) {
			System.out.println("Insufficient funds!!");
		} else {
			availBalance -= withdrawAmount;
			System.out.println("Plz collect your cash");
			System.out.println("You balance now is " + availBalance);
		}
	}

	// Deposit function
	private static void deposit(double availBalance, double depoAmount) {
		availBalance += depoAmount;
		System.out.println("Available balance is " + availBalance);
	}

}

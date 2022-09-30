package com.nissan.app;

import java.util.Scanner;

import com.nissan.bean.Bank;

public class NewBankApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String typeAccount = "";
		
		System.out.println("Enter principle amount");
		int principle = Integer.parseInt(input.nextLine());
		
		System.out.println("Enter time");
		int time = Integer.parseInt(input.nextLine());
		
		System.out.println("Enter types of account");
		int typeInt = Integer.parseInt(input.nextLine());
		
		if(typeInt==1) {
			typeAccount = "Savings";
		}
		else {
			typeAccount = "Fixed";
		}
		
		//Create an object
		Bank bank = new Bank();
		bank.setPrinicple(principle);
		bank.setTime(time);
		bank.setTypeOfAccount(typeAccount);
		System.out.println(bank.toString());
		
	}

}

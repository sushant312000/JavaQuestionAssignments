package com.nissan.app;

import java.util.Scanner;

import com.nissan.bean.CustomerAccount;

public class CustomerAccApp {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		CustomerAccount[] account = new CustomerAccount[5];
		
		//Welcome...
		int i=0;
		
		//Enter details in account array
		while(i<account.length) {
			System.out.println("Enter bank account number");
			int accountNumer = Integer.parseInt(input.nextLine());
			
			System.out.println("Enter your name");
			String customerName = input.nextLine();
			
			System.out.println("Enter your age");
			int age = Integer.parseInt(input.nextLine());
			
			System.out.println("Enter your place");
			String place = input.nextLine();
		}
	}
}

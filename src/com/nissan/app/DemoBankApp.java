package com.nissan.app;

import com.nissan.bean.BankOne;
import com.nissan.bean.BankTwo;

public class DemoBankApp {

	public static void main(String[] args) {
		BankOne bank1 = new BankOne();
		BankTwo bank2 = new BankTwo();
		
		double result1 = bank1.simpleInterest(44000, 4, 10);
		System.out.println("Bank One SIP is " + result1);
		
		double result2 = bank2.simpleInterest(48000, 3, 7);
		System.out.println("Bank Two SIP is " + result2);
	}

}

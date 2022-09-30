package com.nissan.bean;

public class BankTwo extends BankOne {

	public BankTwo() {
		super();

	}

	public BankTwo(double amount, int time, int rate) {
		super(amount, time, rate);

	}
	
	public double simpleInterest(double amount, int time, int rate) {
		double sip = (amount * rate * time)/100;
		return sip;
	}
}

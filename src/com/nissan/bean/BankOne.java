package com.nissan.bean;

public class BankOne extends ParentBank {
	//instance variables
	double amount;
	int time;
	int rate;
	
	//default constructor
	public BankOne() {
		super();

	}

	//parameterized constructor
	public BankOne(double amount, int time, int rate) {
		super();
		this.amount = amount;
		this.time = time;
		this.rate = rate;
	}
	
	//calculating sip 
	public double simpleInterest(double amount, int time, int rate) {
		double sip = (amount * rate * time)/100;
		return sip;
	}
	
	
}

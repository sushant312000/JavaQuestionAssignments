package com.nissan.bean;

public class Bank {
	//Instance variables
	private int prinicple;
	private int time;
	private double rate;
	private String typeOfAccount;
	
	//Default constructor
	public Bank() {
		super();
		
	}

	//parameterized constructor
	public Bank(int prinicple, int time, double rate, String typeOfAccount) {
		super();
		this.prinicple = prinicple;
		this.time = time;
		this.rate = rate;
		this.typeOfAccount = typeOfAccount;
	}

	//getter and setter
	public int getPrinicple() {
		return prinicple;
	}

	public void setPrinicple(int prinicple) {
		this.prinicple = prinicple;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	public String getTypeOfAccount() {
		return typeOfAccount;
	}

	public void setTypeOfAccount(String typeOfAccount) {
		this.typeOfAccount = typeOfAccount;
	}
	
	//method
	public void display() {
		System.out.println(typeOfAccount);
	}

	//override string
	@Override
	public String toString() {
		return "Bank [prinicple=" + prinicple + ", time=" + time + ", rate=" + rate + ", typeOfAccount=" + typeOfAccount
				+ "]";
	}
	
}

package com.nissan.bean;

public class CustomerAccount {
	
	//instance variables
	private long accountNumber;
	private String customerName;
	private int age;
	private String place;
	private String accountType;
	
	//Default constructor
	public CustomerAccount() {
		super();
		
	}

	//Getters and setters
	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	
}

package com.nissan.bean;

public class Customer {
	//Check Customer Exists
	public boolean checkCustomerExists(String customerName, String[] customerNames) {
		for (String customer : customerNames) {
			if(customerName.equals(customer)) {
				return true;
			}
		}
		return false;
	}
}

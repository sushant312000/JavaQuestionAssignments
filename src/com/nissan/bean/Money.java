package com.nissan.bean;

public class Money {
	private double basicFees;
	private double tax;
	
	public Money() {
		super();
		// TODO Auto-generated constructor stubS
	}

	public Money(double basicFees, double tax) {
		super();
		this.basicFees = basicFees;
		this.tax = tax;
	}

	//Getter and setter
	public double getBasicFees() {
		return basicFees;
	}

	public void setBasicFees(double basicFees) {
		this.basicFees = basicFees;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}
	
	
}

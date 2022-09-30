package com.nissan.bean;

public class Rectangle extends Shapes{
	private double length, breadth;

	//default constructor
	public Rectangle() {
		super();
		// TODO Auto-generated constructor stub
	}

	//Parameterized constructor
	public Rectangle(double length, double breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}
	
	public double area() {
		return this.length * this.breadth;
	}
}

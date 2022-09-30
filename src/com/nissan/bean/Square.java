package com.nissan.bean;

public class Square extends Shapes {
	private double side;
	
	public Square() {
		
	}
	
	public Square(double side) {
		super();
		this.side = side;
	}
	
	public double area() {
		return side*side;
	}

	@Override
	public String toString() {
		return "Square [side=" + side + "]" + this.area();
	}
	
	
}

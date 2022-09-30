package com.nissan.bean;

public class Graduate extends StudentInheritance{
	//Custom method
	
	public boolean isPassed(double grade) {
		if(grade > 80.0) return true;
		return false;
	}
}

package com.nissan.bean;

public class UnderGraduate extends StudentInheritance {
	//custom method 
	public boolean isPassed(double grade) {
		if(grade > 70.0) {
			return true;
		}
		else {
			return false;
		}
	}
}

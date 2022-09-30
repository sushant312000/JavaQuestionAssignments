package com.nissan.bean;

//import java.util.Scanner;

public class Conversion {
	
	//Integer to float 
	public void convert(int num1, int num2) {
		float result = num1 * num2;
		System.out.println(result);	
	}
	
	//Float to integer
	public void convert(float num1, float num2) {
		int result = (int) (num1 + num2);
		System.out.println(result);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Creating conversion class object
		Conversion con = new Conversion();
		
		//Calling Converting methods
		con.convert(2, 3);
		con.convert(28.8f, 30.2f);

	}

}

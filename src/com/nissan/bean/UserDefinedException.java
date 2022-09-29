package com.nissan.bean;

public class UserDefinedException {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Evaluation evaluation = new Evaluation(-75, 70);
		
		try {
			evaluation.display();
		}
		
		catch(InValidValueException iv){
			System.out.println("Invalid Entry");
		}
		
		catch(Exception e) {
			System.out.println("Message " + e);
		}
	}
}

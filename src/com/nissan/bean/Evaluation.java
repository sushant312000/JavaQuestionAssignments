package com.nissan.bean;

public class Evaluation {
	
	int evaluationId;
	int marksOne;
	int marksTwo;
	
	public Evaluation() {
		
	}
	
	public Evaluation(int mOne, int mTwo) {
		this.marksOne = mOne;
		this.marksTwo = mTwo;
	}
	
	public void display() throws InValidValueException {
		if(marksOne < 0 || marksTwo<0) {
			throw new InValidValueException();
		}
		else {
			System.out.println("Marks One " + marksOne);
			System.out.println("Marks Two " + marksTwo);
		}
	}

}

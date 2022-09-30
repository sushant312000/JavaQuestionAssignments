package com.nissan.bean;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Patient extends PersonInheritance {
	//instance variables
	private int patientNumber;
	private String hospital;
	private Date yearOfAdmission;
	private double fees;
	
	//default constructor
	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//parameterized constructor
	public Patient(int patientNumber) {
		super();
		this.patientNumber = patientNumber;
	}

	//Getters and setters
	public int getPatientNumber() {
		return patientNumber;
	}

	public void setPatientNumber(int patientNumber) {
		this.patientNumber = patientNumber;
	}

	public String getHospital() {
		return hospital;
	}

	public void setHospital(String hospital) {
		this.hospital = hospital;
	}

	public Date getYearOfAdmission() {
		return yearOfAdmission;
	}

	public void setYearOfAdmission(Date yearOfAdmission) {
		this.yearOfAdmission = yearOfAdmission;
	}

	public double getFees() {
		return fees;
	}

	public void setFees(double fees) {
		this.fees = fees;
	}

	//Override
	@Override
	public String toString() {
		
		//format the date
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		
		return "Patient [patientNumber=" + patientNumber + ", hospital=" + hospital + ", yearOfAdmission="
				+ formatter.format(yearOfAdmission) + ", fees=" + fees + "]" + super.toString();
	}
	
	//custom method
	public void calculateMedicalFee(Money money) {
		this.fees = money.getBasicFees() + money.getTax();
	}

}

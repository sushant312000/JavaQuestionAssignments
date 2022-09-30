package com.nissan.app;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import com.nissan.bean.Money;
import com.nissan.bean.Patient;

public class DemoHospitalApp {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		
		// TODO Auto-generated method stub
		Patient patientOne = new Patient(101);
		
		System.out.println("Enter name : ");
		patientOne.setName("Sushant");
		
		System.out.println("Enter age : ");
		patientOne.setAge(23);
		
		System.out.println("Enter name of hospital : ");
		patientOne.setHospital("TSC");
		
		System.out.println("Enter year of joinig");
		patientOne.setYearOfAdmission(formatter.parse("13/01/2021"));
		
		Money money = new Money(1200, 50);
		patientOne.calculateMedicalFee(money);
	}

}

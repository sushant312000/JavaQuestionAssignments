package com.nissan.bean;

//Super class
public class StudentInheritance {
	
	//instance variables
	private String studentName;
	private int studentId;
	private int studentAge;
	private double studentGrade;
	private String studentAddress;
	
	//default constructor
	public StudentInheritance() {
		super();
		// TODO Auto-generated constructor stub
	}

	//parameterized constructor
	public StudentInheritance(String studentName, int studentId) {
		super();
		this.studentName = studentName;
		this.studentId = studentId;
	}
	
	//Getter and setters
	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public int getStudentAge() {
		return studentAge;
	}

	public void setStudentAge(int studentAge) {
		this.studentAge = studentAge;
	}

	public double getStudentGrade() {
		return studentGrade;
	}

	public void setStudentGrade(double studentGrade) {
		this.studentGrade = studentGrade;
	}

	public String getStudentAddress() {
		return studentAddress;
	}

	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}

	//custom method
//	public boolean isBoolean(double grade) {
//		return if(grade)
//	}

	@Override
	public String toString() {
		return "StudentInheritance [studentName=" + studentName + ", studentId=" + studentId + ", studentAge="
				+ studentAge + ", studentGrade=" + studentGrade + ", studentAddress=" + studentAddress + "]";
	}
		
}

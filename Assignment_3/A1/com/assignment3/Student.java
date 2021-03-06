package com.assignment3;

public class Student {
	private String studentId;
	private String studentName;
	private String studentAddress ;
	
	public Student(){};
	
	public Student(String studentId,String studentName,String studentAddress){
		this.studentId=studentId;
		this.studentName=studentName;
		this.studentAddress=studentAddress;
	}
	
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentAddress() {
		return studentAddress;
	}
	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}
	public String toString() {
		return "\nStudent Id : "+studentId+"\nStudent Name : "+studentName+"\nStudent Address : "+studentAddress;
	}
}

package com.java.A1student;

import java.util.Iterator;
import java.util.List;

public class Student {
	private String studentId;
	private String studentName;
	private List<Test> studentTest;
	public Student() {}
	
	public Student(String studentId,String studentName,List<Test> studentTest) {
		this.studentId=studentId;
		this.studentName=studentName;
		this.studentTest=studentTest;
	}
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public List<Test> getStudentTest() {
		return studentTest;
	}
	public void setStudentTest(List<Test> studentTest) {
		this.studentTest = studentTest;
	}

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public void displayInfo() {
		System.out.println("\nStudentId : "+studentId);
		System.out.println("Student Name : "+studentName);
		Iterator<Test> itr= studentTest.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}

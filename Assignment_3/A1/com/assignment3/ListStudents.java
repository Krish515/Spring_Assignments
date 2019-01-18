package com.assignment3;

import java.util.Iterator;
import java.util.List;



public class ListStudents {
	private List<Student> stList;
	private Student student;
	
	public ListStudents(){};
	
	public ListStudents(List<Student> stList){
		this.stList=stList;
	}
	
	public List<Student> getStList() {
		return stList;
	}

	public void setStList(List<Student> stList) {
		this.stList = stList;
	}

	public String getAllDetails() {
		System.out.println("All students details");
		Iterator<Student> itr= stList.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		return "success";
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public String getDetails(String studentId) {
		Iterator<Student> itr= stList.iterator();
		while(itr.hasNext()) {
			Student s=itr.next();
			if(s.getStudentId().equals(studentId)){
				System.out.println("\nGetting "+studentId+" details");
				System.out.println("Student Name "+s.getStudentName());
				System.out.println("Student Address "+s.getStudentAddress());
			}
		}
		return "success";
	}

	
	
}

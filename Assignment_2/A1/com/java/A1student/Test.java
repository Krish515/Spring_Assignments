package com.java.A1student;

public class Test {
	private String testId;
	private String testTitle;
	private int testMarks;
	public Test() {}
	public Test(String testId,String testTitle,int testMarks) {
		this.testId=testId;
		this.testTitle=testTitle;
		this.testMarks=testMarks;
	}
	public String toString() {
		return "\nTest Id : "+testId+"\nTest Title : "+testTitle+"\nTest Marks : "+testMarks;
	}
}

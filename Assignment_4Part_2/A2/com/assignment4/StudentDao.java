package com.assignment4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

public class StudentDao {
	private HibernateTemplate template;

	public HibernateTemplate getTemplate() {
		return template;
	}

	public void setTemplate(HibernateTemplate template) {
		this.template = template;
	}
	//method to save employee  
	public void saveStudent(Student s){  
	    template.save(s);  
	}  
	//method to update employee  
	public void updateStudent(Student s){  
	    template.update(s);  
	}  
	//method to delete employee  
	public void deleteStudent(Student s){  
	    template.delete(s);  
	}  
	//method to return one employee of given id  
	public Student getDetail(String studentId){  
	    Student s=(Student)template.get(Student.class,studentId); 
	    System.out.println("Getting "+studentId+" details");
	    System.out.println("Student Name :"+s.getStudentName());
	    System.out.println("Student Address :"+s.getStudentAddress());
	    return s;  
	}  
	//method to return all employees  
	public List<Student> getAllDetails(){  
	    List<Student> stList=new ArrayList<Student>();  
	    stList=template.loadAll(Student.class);  
	    System.out.println(Arrays.toString(stList.toArray()));
	    return stList;  
	}  
}

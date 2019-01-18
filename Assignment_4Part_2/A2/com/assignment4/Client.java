package com.assignment4;

import org.springframework.beans.factory.BeanFactory;  
import org.springframework.beans.factory.xml.XmlBeanFactory;  
import org.springframework.core.io.ClassPathResource;  
import org.springframework.core.io.Resource;  
  
public class Client {  
public static void main(String[] args) {  
      
    Resource r=new ClassPathResource("applicationContext.xml");  
    BeanFactory factory=new XmlBeanFactory(r);  
    StudentDao da=(StudentDao)factory.getBean("d");  
      
    Student s1=new Student("S001","Ray","New York");  
    Student s2=new Student("S002","Peter","Chicago");  
    
    da.saveStudent(s1);
    da.saveStudent(s2);
    da.getAllDetails();
    String studentId="S001";
    da.getDetail(studentId);
}  
}  
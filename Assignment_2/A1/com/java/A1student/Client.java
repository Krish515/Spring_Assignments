package com.java.A1student;

import org.springframework.beans.factory.BeanFactory;  
import org.springframework.beans.factory.xml.XmlBeanFactory;  
import org.springframework.core.io.ClassPathResource;  
import org.springframework.core.io.Resource; 

public class Client {
	public static void main(String[] args) {  
	    Resource r=new ClassPathResource("applicationContext.xml");  
	    BeanFactory factory=new XmlBeanFactory(r);  
	      
	    Student s1=(Student)factory.getBean("s1");  
	    s1.displayInfo();
	    Student s2=(Student)factory.getBean("s2");  
	    s2.displayInfo();  
	      
	}  
}

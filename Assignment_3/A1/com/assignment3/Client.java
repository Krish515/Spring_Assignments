package com.assignment3;

import org.springframework.beans.factory.BeanFactory;  
import org.springframework.beans.factory.xml.XmlBeanFactory;  
import org.springframework.core.io.ClassPathResource;  
import org.springframework.core.io.Resource;

public class Client {  
public static void main(String[] args) {  
    Resource r=new ClassPathResource("applicationContext.xml");  
    BeanFactory factory=new XmlBeanFactory(r);  
      
    ListStudents stList=factory.getBean("proxy",ListStudents.class);  
    long start=System.currentTimeMillis();
    stList.getAllDetails();
    long elapsed=System.currentTimeMillis()-start;
    System.out.println("Elapsed time "+elapsed+" milliseconds");
    String studentId = "S007"; 
    start=System.currentTimeMillis();
    stList.getDetails(studentId);  
    elapsed=System.currentTimeMillis()-start;
    System.out.println("Elapsed time "+elapsed+" milliseconds");
}  
}  

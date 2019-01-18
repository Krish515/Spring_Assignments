package com.java.A1xml;

import org.springframework.beans.factory.BeanFactory;  
import org.springframework.beans.factory.xml.XmlBeanFactory;  
import org.springframework.core.io.ClassPathResource;  
import org.springframework.core.io.Resource; 

public class Client {
 public static void main(String[] args) {
	 Resource resource=new ClassPathResource("applicationContext.xml");
	 BeanFactory factory=new XmlBeanFactory(resource);
	 Movie movie=(Movie)factory.getBean("moviebean");
	 System.out.println("Using spring xml configuration");
	 movie.displayInfo();		 
 }
}

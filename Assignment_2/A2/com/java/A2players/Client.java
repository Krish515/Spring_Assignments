package com.java.A2players;

import org.springframework.beans.factory.BeanFactory;  
import org.springframework.beans.factory.xml.XmlBeanFactory;  
import org.springframework.core.io.ClassPathResource;  
import org.springframework.core.io.Resource; 

public class Client {
	public static void main(String[] args) {  
	    Resource r=new ClassPathResource("applicationContext2.xml");  
	    BeanFactory factory=new XmlBeanFactory(r);  
	    Player p1=(Player)factory.getBean("p1");  
	    p1.displayInfo();
	    Player p2=(Player)factory.getBean("p2");  
	    p2.displayInfo(); 
	    Player p3=(Player)factory.getBean("p3");  
	    p3.displayInfo(); 
	    Player p4=(Player)factory.getBean("p4");  
	    p4.displayInfo(); 
	    Player p5=(Player)factory.getBean("p5");  
	    p5.displayInfo();
	    Player p=(Player)factory.getBean("p");  
	    p.displayPlayers("India");
	}  
}

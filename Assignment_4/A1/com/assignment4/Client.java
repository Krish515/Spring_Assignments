package com.assignment4;

import org.springframework.context.ApplicationContext;  
import org.springframework.context.support.ClassPathXmlApplicationContext;  
public class Client {  
  
public static void main(String[] args) {  
    ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");  
    int status=0;
    System.out.println("jDBCtemplate");
    StudentDao dao=(StudentDao)ctx.getBean("sdao");  
    dao.saveStudent(new Student("S001","Ray","New York")); 
    dao.saveStudent(new Student("S002","Peter","Chicago"));
    dao.saveStudent(new Student("S003","Steve","Brooklyn"));
    dao.saveStudent(new Student("S004","Stark","Washington"));
    dao.saveStudent(new Student("S005","Tony","Florida"));
    dao.saveStudent(new Student("S006","Bruce","Texas"));
    status= dao.saveStudent(new Student("S007","Wayne","California"));
    if(status==1)
    System.out.println("Saved successfully");  
    else
    System.out.println("Error saving details");
    
    status=dao.updateStudent(new Student("S001","Ray","Dallas")); 
    if(status==1)
    System.out.println("Updated successfully");  
    else
    System.out.println("Error updating details"); 
     
          
    Student s=new Student(); 
    s.setStudentId("S002");
    status=dao.deleteStudent(s); 
    if(status==1)
    System.out.println("Deleted successfully");  
    else
    System.out.println("Error deleting details"); 
     
    status=dao.readStudent(s); 
    if(status==1)
    System.out.println("Read successfully");  
    else
    System.out.println("Error read details"); 
     
}  
  
}  
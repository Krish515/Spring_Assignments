package com.assignment3;
 
import java.lang.reflect.Method;
import java.util.Date;

import org.springframework.aop.AfterReturningAdvice;  
public class AfterAdvisor implements AfterReturningAdvice{  
    @Override  
    public void afterReturning(Object returnValue, Method method,  
         Object[] args, Object target) throws Throwable {  
    	Date date = new Date();
        System.out.println("\nMethod "+method.getName()+" invocation successfully completed at "+date);
    }  
  
}  

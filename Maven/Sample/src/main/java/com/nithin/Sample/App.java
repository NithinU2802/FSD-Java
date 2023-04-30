package com.nithin.Sample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	// BeanFactory is used for smaller projects
    	// ApplicationContext is used for bigger projects 
    	
    	ApplicationContext context= new ClassPathXmlApplicationContext("spring.xml");
    
    	
//        Vehicle obj=new Bike();
//        obj.drive();
    	Vehicle obj=(Vehicle)context.getBean("vehicle");
        obj.drive();
    }
}

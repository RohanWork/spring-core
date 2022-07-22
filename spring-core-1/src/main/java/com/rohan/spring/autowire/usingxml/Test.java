package com.rohan.spring.autowire.usingxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("com/rohan/spring/autowire/usingxml/configAutoWiring.xml");
		
		//Autowiring using XML config file
		System.out.println("Autowiring using XML config file : \n");
		
		Employee emp1 = (Employee)context.getBean("emp1");
		System.out.println("The emp1 contains : (Autowired using byName=objectName->address)\n"+emp1+"\n");
		
		Employee emp2 = (Employee)context.getBean("emp2");
		System.out.println("The emp2 contains : (Autowired using byType=Class Address)\n"+emp2+"\n");
		
		Employee emp3 = (Employee)context.getBean("emp3");
		System.out.println("The emp3 contains : (Autowired using constructor=Class Employee)\n"+emp3+"\n");
		
	}

}

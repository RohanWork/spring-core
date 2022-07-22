package com.rohan.spring.autowire.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("com/rohan/spring/autowire/annotation/configAutoWiring.xml");
		
		//Autowiring using annotation
		System.out.println("Autowiring using annotation : \n");
		
		Employee emp1 = (Employee)context.getBean("emp1");
		System.out.println("The emp1 contains : (Autowired using annotation -> on Address address)\n"+emp1+"\n");
		
//		Employee emp2 = (Employee)context.getBean("emp2");
//		System.out.println("The emp2 contains : (Autowired using annotation -> on setter method)\n"+emp2+"\n");
//		
//		Employee emp3 = (Employee)context.getBean("emp3");
//		System.out.println("The emp3 contains : (Autowired using annotation -> on constructor=Class Employee)\n"+emp3+"\n");
	
	}

}

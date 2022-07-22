package com.rohan.spring.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("com/rohan/spring/collection/configCollection.xml");
		Employee emp1 = (Employee)context.getBean("emp1");
		
		System.out.println(emp1);
	}

}

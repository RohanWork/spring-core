package com.rohan.spring.consinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("com/rohan/spring/consinjection/configConsInjection.xml");
		
		Person person = (Person)context.getBean("person");
		System.out.println(person+"\n");
		
		Addition addition = (Addition)context.getBean("addition");
		addition.showParameters();
		addition.doSum();
	}
}

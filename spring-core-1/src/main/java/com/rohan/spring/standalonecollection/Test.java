package com.rohan.spring.standalonecollection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("com/rohan/spring/standalonecollection/configAloneCollection.xml");
		
		Person person1 = (Person)context.getBean("person1");
		System.out.println("The person1 contains : \n\n"+person1+"\n");
		System.out.println("The person1 of friends    : "+person1.getFriends().getClass().getName());
		System.out.println("The person1 of feeStruct  : "+person1.getFeeStructure().getClass().getName());
		System.out.println("The person1 of properties : "+person1.getProperties().getClass().getName());
	}
}

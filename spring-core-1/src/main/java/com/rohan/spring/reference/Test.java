/**
 * 
 */
package com.rohan.spring.reference;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("com/rohan/spring/reference/configReference.xml");
		A a = (A)context.getBean("aref");
		System.out.println(a);
		System.out.println(a.getB().getY());
	}

}

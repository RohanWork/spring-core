package com.rohan.spring.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
		System.out.println("Configuring with the XML file\n");
		@SuppressWarnings("resource")
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/rohan/spring/lifecycle/configLifeCycle.xml");
		context.registerShutdownHook();
		
		
		Samosa s1 = (Samosa)context.getBean("s1");
		System.out.println("The s1 contains : "+s1+"\n");
		
		
		System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
		System.out.println("Configuration using the interfaces (implement InitializingBean, DisposableBean)\n");
		Pepsi p1 = (Pepsi) context.getBean("p1");
		System.out.println("The p1 contains : "+p1+"\n");
		
		
		System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
		System.out.println("Configuration using the annotations (@PostConstruct, @PreDestroy))\n");
		Example e1 = (Example)context.getBean("e1");
		System.out.println("The e1 contains : "+e1+"\n");
	}
}

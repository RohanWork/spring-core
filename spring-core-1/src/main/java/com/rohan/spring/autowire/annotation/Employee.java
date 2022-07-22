package com.rohan.spring.autowire.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
	
	@Autowired
	
	// Setting the address2 bean
	@Qualifier("address2")
	
	private Address address;

	public Address getAddress() {
		return address;
	}

	//@Autowired -> Used for setter method injection
	public void setAddress(Address address) {
		this.address = address;
	}

	//@Autowired -> Used for constructor method 
	public Employee(Address address) {
		super();
		this.address = address;
		System.out.println("Inside employee constructor\n");
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}
}

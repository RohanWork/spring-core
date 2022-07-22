package com.rohan.spring.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Pepsi implements InitializingBean, DisposableBean{
	private double price;

	public double getPrice() {
		return price;
	}

	
	public void setPrice(double price) {
		this.price = price;
	}

	
	@Override
	public String toString() {
		return "Pepsi [price=" + price + "]\n";
	}

	
	public Pepsi() {
		super();
	}


	public void afterPropertiesSet() throws Exception {
		
		System.out.println("Inside init    method... : Pepsi Class\n");
	}


	public void destroy() throws Exception {

		System.out.println("Inside destroy method... : Pepsi Class\n");
	}
	
	

}

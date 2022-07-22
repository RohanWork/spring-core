package com.rohan.spring.consinjection;

public class Certi {
	private String name;

	
	// Remove the para-constructor while injecting as <property>.
	public Certi() {
		super();
	}
	
	public Certi(String name) {
		super();
		this.name = name;
	}
	
	

	// Remove the setters and getters while injecting as <constructor-arg>.
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	
	@Override
	public String toString() {
		return "Certi [name=" + this.name + "]";
	}
	
}

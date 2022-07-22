package com.rohan.spring.collection;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee {
	private String name;
	private List<String> address;
	private Set<String> phones;
	private Map<String, String> cources;
	
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the address
	 */
	public List<String> getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(List<String> address) {
		this.address = address;
	}
	/**
	 * @return the phones
	 */
	public Set<String> getPhones() {
		return phones;
	}
	/**
	 * @param phones the phones to set
	 */
	public void setPhones(Set<String> phones) {
		this.phones = phones;
	}
	/**
	 * @return the cources
	 */
	public Map<String, String> getCources() {
		return cources;
	}
	/**
	 * @param cources the cources to set
	 */
	public void setCources(Map<String, String> cources) {
		this.cources = cources;
	}
	
	
	/**
	 * @param name
	 * @param address
	 * @param phones
	 * @param cources
	 */
	public Employee(String name, List<String> address, Set<String> phones, Map<String, String> cources) {
		super();
		this.name = name;
		this.address = address;
		this.phones = phones;
		this.cources = cources;
	}
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", address=" + address + ", phones=" + phones + ", cources=" + cources + "]";
	}	
}

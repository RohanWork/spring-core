package com.rohan.spring.standalonecollection;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Person {
	
	private List<String> friends;
	private Map<String, Integer> feeStructure;
	private Properties properties;

	public Properties getProperties() {
		return properties;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}

	public Map<String, Integer> getFeeStructure() {
		return feeStructure;
	}

	public void setFeeStructure(Map<String, Integer> feeStructure) {
		this.feeStructure = feeStructure;
	}

	public List<String> getFriends() {
		return friends;
	}

	public void setFriends(List<String> friends) {
		this.friends = friends;
	}

	@Override
	public String toString() {
		return "Person "+
			   "[\n\tfriends: \n\t\t" + friends + 
			   ", \n\tfeeStructure: \n\t\t" + feeStructure + 
			   ", \n\tproperties: \n\t\t" + properties + " ]";
	}
	
}

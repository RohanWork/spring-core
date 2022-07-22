package com.rohan.spring.reference;

public class A {
	private int x;
	private B b;
	
	/**
	 * @return the x
	 */
	public int getX() {
		return x;
	}
	
	/**
	 * @param x the x to set
	 */
	public void setX(int x) {
		this.x = x;
	}
	
	/**
	 * @return the b
	 */
	public B getB() {
		return b;
	}
	
	/**
	 * @param b the b to set
	 */
	public void setB(B b) {
		this.b = b;
	}
	
	/**
	 * 
	 */
	public A() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "A [x=" + x + ", b=" + b + "]";
	}
}

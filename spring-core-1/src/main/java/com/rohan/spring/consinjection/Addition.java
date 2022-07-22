package com.rohan.spring.consinjection;

public class Addition {

	private int a;
	private int b;

	public Addition(int a, int b) {
		this.a=a;
		this.b=b;
		System.out.println("Constructor : int, int\n");
	}
	
	public Addition(double a, double b) {
		this.a=(int)a;
		this.b=(int)b;
		System.out.println("Constructor : double, double\n");
	}
	
	public Addition(String a, String b) {
		this.a=Integer.parseInt(a);
		this.b=Integer.parseInt(b);
		System.out.println("Constructor : String, String\n");
	}
	
	
	public void showParameters() {
		System.out.println("Printing the values of a and b : "+this.a+", "+this.b+"\n");
	}
	
	public void doSum() {
		System.out.println("The sum is : "+(this.a+this.b)+"\n");
	}
}

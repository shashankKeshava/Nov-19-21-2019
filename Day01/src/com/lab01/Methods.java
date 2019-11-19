package com.lab01;

public class Methods {

	//Functions use a pass-by-value mechanism
	public static void main(String[] args) {
		
		doSomething();
		
//		int i = increment(10);
//		System.out.println(i);
		
		
		
	}
	
	private static void doSomething() {
		System.out.println("Sleeping peacefully");
		doSomething();
	}
	
	
	private static int increment(int number) {
		return number + 1;
	}
	
	

}

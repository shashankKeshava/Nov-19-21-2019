package com.lab10;

public class Person {
	private static int count;
	
	public Person() {
		System.out.println("***Person created***");
		count++;
	}
	
	public static int getObjectCount() {
		return count;
	}
}

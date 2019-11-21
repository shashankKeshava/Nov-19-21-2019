package com.lab10;

public class Lab10Main {

	public static void main(String[] args) {
		int randomNumber = (int)(Math.random() * 100);
		for (int i = 0; i < randomNumber; i++) {
			Person p1 = new Person();
		}
		
		System.out.println(Person.getObjectCount());
	}

}

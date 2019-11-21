package com.lab10;

import java.util.ArrayList;
import java.util.List;

public class DB {

	private static List<Person> personsList = new ArrayList<>();
	
	public static void add(Person person) {
		personsList.add(person);
	}
	
	public void printPersonsList() {
		for (Person person : personsList) {
			System.out.println(person);
		}
	}
}

package com.intuit.qbooks.staticExamples;

public class PersonInChennai {
	private String name;
	private static City city = new City("Chennai");
	
	
	public static City getCity() {
		//System.out.println(name + " wants to know his/her city");
		return city;
	}
	
	public PersonInChennai(String name) {
		this.name = name;
		//city = new City("Chennai");
	}
	public String getName() {
		return name;
	}
}

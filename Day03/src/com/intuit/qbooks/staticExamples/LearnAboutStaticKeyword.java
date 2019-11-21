package com.intuit.qbooks.staticExamples;

import java.util.List;
import java.nio.*;


public class LearnAboutStaticKeyword {

	public static void main(String[] args) {
		
		VendingMachine.getCoffee();
		
		
		PersonInChennai sam = new PersonInChennai("Sam");
		PersonInChennai ram = new PersonInChennai("Ram");
		
		//sam.getCity();
		City city = PersonInChennai.getCity();
		
		
	}

}

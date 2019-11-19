package com.lab05;

public class Lab05Main {

	public static void main(String[] args) {
		Person sam = new Person();
		sam.name = "Sam";
		sam.age = 34;
		
		Car bmw = new Car();
		bmw.model = "BMW";
		bmw.color = "Black";
		Engine anEngine = new Engine();
		anEngine.power = 2000;
		bmw.engine = anEngine;  
		
		Car santro = new Car();
		santro.model = "Santro";
		santro.color = "Yellow";
		Engine anEngine2 = new Engine();
		anEngine2.power = 1000;
		santro.engine = anEngine2;
		
		Person ram = new Person();
		ram.name = "Ram";
		ram.age = 35;
		ram.friend = sam;
		
		sam.friend = ram;
		Car[] cars = { santro, bmw };
		sam.cars = cars;
		
		System.out.println(ram.friend.cars[0].engine.power);
		
		
		
		
		
		
		
		
	}

}

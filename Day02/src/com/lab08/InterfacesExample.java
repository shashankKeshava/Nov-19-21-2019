package com.lab08;

public class InterfacesExample {

	public static void main(String[] args) {
		Frog desertFrog = new Frog();
		desertFrog.swim();
		desertFrog.walk();
		
		Terrestrial walkingFrog = new Frog();
		walkingFrog.walk();
		
		Aquatic swimmingFrog = new Frog();
		swimmingFrog.swim();
	}
}

//Interfaces are like abstract classes
//Cannot be instantiated
interface Terrestrial {
	default void move() {
		System.out.println("Moving on land");
	}
	abstract void walk();
}

interface Aquatic {
	default void breathe() {
		System.out.println("Breathing under water");
	}
	abstract void swim();
}

class Frog implements Terrestrial, Aquatic {

	public void swim() {
		System.out.println("swimming");
	}

	public void walk() {
		System.out.println("jumping around");
	}
	
}


public class InterfacesExample {

	public static void main(String[] args) {
		//Vehicle vehicle = new Vehicle();
		Scooter activa = new Scooter();
		//activa.applyBrakes();
		
		Vehicle scooty = new Scooter();
		Vehicle indica = new Car();
		drive(scooty);
		drive(indica);
		Person sam = new Person();
		sam.vehicle = new Scooter();
		sam.vehicle = new Car();
	}
	static void drive(Vehicle vehicle) {
		vehicle.start();
		System.out.println("................");
		
		vehicle.stop();
	}
	

}


interface Alarm {
	
}

class Door {
	Alarm alarm;
}

class Person {
	//Scooter scooter;
	//Car car;
	Vehicle vehicle;
}

interface Vehicle {
	void start();
	void stop();
}

class Scooter implements Vehicle {

	public void applyBrakes() {
		System.out.println("Use left hand lever");
	}
	
	public void start() {
		System.out.println("Kick start");
	}

	public void stop() {
		System.out.println("Out of fuel");
	}
	
}

class Car implements Vehicle {

	public void start() {
		System.out.println("Turn on the ignition");
	}

	public void stop() {
		System.out.println("Turn off the ignition");
	}
	
}

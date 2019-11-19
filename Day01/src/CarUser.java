
public class CarUser {

	public static void main(String[] args) {

		useCars();
	}

	static void useCars() {
		Car ambassador = null;

		//Error
		//ambassador.drive(100);

		Car santro = new Car();
		santro.model = "Santro";
		santro.yearOfMake = 2010;
		santro.drive(100);

		Car bmw = new Car();
		bmw.model = "BMW";
		bmw.yearOfMake = 2019;
		bmw.drive(200);
	}

}

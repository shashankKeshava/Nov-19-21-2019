
public class CarUser {

	public static void main(String[] args) {
		Car car = new Car("BMW", 2019);
		System.out.println(car.getModel());
		System.out.println(car.getYear());
		car.setYear(1900);
		
		//car.setModel("Ferrari");
	}

}

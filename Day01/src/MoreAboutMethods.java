
public class MoreAboutMethods {

	public static void main(String[] args) {
		eat();
		eat("Rice");
		
		String[] items = { "Rice", "Roti", "Dessert" };
		eat(items);
	}
	
	//Method Overloading
	static void eat() {
		System.out.println("Eating anything available");
	}
	
	static void eat(String item) {
		System.out.println("Eating " + item);
	}
	
	static void eat(String[] items) {
		System.out.println();
		for (String item : items) {
			System.out.println("Eating " + item);
		}
	}

}

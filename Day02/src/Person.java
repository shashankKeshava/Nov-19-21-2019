public class Person {
	
	//instance variables are initialized to default values
	String name;
	int age;

	public void initialize(String theName, int theAge) {
		name = theName;
		age = theAge;
	}
	//constructor is a special function that's use to initialize variables
	//has the same name as the class
	//called only with the "new" keyword
	//it doesn't return anything
	
	public Person(String theName, int theAge) {
		System.out.println("Constructor called");
		name = theName;
		age = theAge;
	}
	
	public Person() {
		System.out.println("Empty object created");
	}
}

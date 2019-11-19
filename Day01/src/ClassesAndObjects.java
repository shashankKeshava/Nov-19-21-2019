
public class ClassesAndObjects {

	public static void main(String[] args) {
		int i = 10;
		Person p1 = null;
		
		
		//p2 is a variable of type Person
		//p2 is a reference to a Person object
		//p2 is an instance of Person class
		//Person is instantiated and referred to by p2
		//p2 is a variable stored on the stack, 
		//it refers to an object on the heap
		Person p2 = new Person();
		p2.eat("Roti");
		p2.sleep(5);
		
		Person p3 = new Person();
		
		String message1 = eat("Rice");
		String message2 = sleep(12);
		
		System.out.println(message1);
		System.out.println(message2);
	}
	
	static String eat(String item) {
		return "Eating " + item;
	}
	
	static String sleep(int hours) {
		return "Sleeping " + hours + " hours";
	}
	
	

}

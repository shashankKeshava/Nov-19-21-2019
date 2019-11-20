public class PersonUser {

	public static void main(String[] args) {
		Person p0 = new Person();
		p0.initialize("Mary", 23);
		
		Person p1 = new Person("Sam", 34);
		//p1.name = "Ram";
		//p1.age = 34;
		
		System.out.println(p1.name);
		System.out.println(p1.age);
		Person p2 = new Person("Ram", 45);
		Person p3 = new Person("Joe", 56);
	}

}

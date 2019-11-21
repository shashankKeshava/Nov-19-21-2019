
public class Strings {

	public static void main(String[] args) {
		//Immutable objects
		
		String lang = "Java";
		String language = new String("Java");
		
		//== on strings compares the references
		System.out.println(lang == language);
		
		//equals on strings compares the values
		System.out.println(lang.equals(language));
		
		String myCar = "BMW";
		String yourCar = "BMW";
		System.out.println(myCar == yourCar);
		
		myCar = "Santro";
		System.out.println(myCar);
		System.out.println(yourCar);
		
		//String manipulation leads to creation of several objects
		//Try to use Strings as constants
		String message = "Java";
		message += " is ";
		message += "Cool";
		System.out.println(message);
		
		//Use StringBuilder if you have to manipulate strings
		StringBuilder builder = new StringBuilder("Java");
		builder.append(" ");
		builder.append(" is ");
		builder.append(" ");
		builder.append("cool");
		System.out.println(builder.toString());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

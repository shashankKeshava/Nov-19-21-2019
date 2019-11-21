
public class ExceptionHandling {

	public static void main(String[] args) throws Exception {
		
		
		
		int result = -1;
		try {
			//open a db connection
			result = divide();
		} catch (Exception e) {
			//write it to a log file
			//log it to some db
			System.out.println("****Error " + e.getMessage());
		}
		finally {
			System.out.println("Inside finally");
			//close db connection
		}
		System.out.println(result);
		
		doSomethingSilly();
		
//		try {
//			doSomethingSilly();
//		}
//		catch(Exception ex) {
//			
//		}
		
		
		System.out.println("End of main");
	}
	
	private static void doSomethingSilly() throws MyException {
		int[] numbers = { 1, 2, 3 };
		int index = 4;
		if(index > numbers.length - 1) {
			throw new MyException("Wrong array index");
		}
		System.out.println(numbers[index]);
	}
	

	private static int divide() throws Exception {
		int num = 10;
		int den = 0;
		if(den == 0) {
			throw new Exception("Trying to divide by zero");
		}
		int result = -1;
		result = num / den;
		return result;
	}

}

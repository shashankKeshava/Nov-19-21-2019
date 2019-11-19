
public class VarArgs {

	public static void main(String[] args) {
		int[] numbers = { 1, 2, 3, 4, 5 };
		add(numbers);
		
		addAll(1, 2, 3, 4, 5, 6, 8);
	}
	
	//ellipsis operator
	static void addAll(int... numbers) {
		int sum = 0;
		for (int number : numbers) {
			sum += number;
		}
		System.out.println("Sum: " + sum);
	}
	
	static void add(int[] numbers) {
		int sum = 0;
		for (int number : numbers) {
			sum += number;
		}
		System.out.println("Sum: " + sum);
	}

}

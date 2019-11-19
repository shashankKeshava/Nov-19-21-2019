
public class Arrays {

	public static void main(String[] args) {
		//Arrays are fixed size collections
		//stored in contiguous memory locations
		
		int[] numbers1 = { 10, 20, 30 };
		int numbers2[] = { 10, 20, 30 };
		
		//Error
		//System.out.println(numbers1[3]);
		
		//String[] languages = { "Java", "C#", "Python", "Ruby" };
		String[] languages = new String[4];
		for (String lang : languages) {
			System.out.println(lang);
		}
		int[] items = new int[10];
		for (int i : items) {
			System.out.println(i);
		}
		
	}

}

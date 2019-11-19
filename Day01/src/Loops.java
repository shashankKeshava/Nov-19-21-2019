//https://github.com/prabhu-durasoft/Nov-19-21-2019

public class Loops {

	public static void main(String[] args) {
		int[] x = { 10, 200, 200};
		int[] arr = { 1, 2, 3 };
		
		for(int item : arr) {
			System.out.println(item);
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		int count = 0;
		while(count < arr.length) {
			System.out.println(arr[count]);
			count++;
		}
		
	}

}

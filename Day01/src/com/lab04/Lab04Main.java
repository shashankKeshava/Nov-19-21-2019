package com.lab04;

public class Lab04Main {

	public static void main(String[] args) {
		String input = "+5 -1 +9 +5 -7 +5 -3 +2 -4 +6 +8";
		
		String[] items = input.split(" ");
		int total = 0;
		for (String item : items) {
			int num = Integer.parseInt(item);
			total += num;
		}
		System.out.println("Total: " + total);
		
	}

}

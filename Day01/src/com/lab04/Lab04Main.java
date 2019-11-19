package com.lab04;

import java.util.Arrays;
import java.util.List;

public class Lab04Main {

	public static void main(String[] args) {
		String input = "+5 -1 +9 +5 -7 +5 -3 +2 -4 +6 +8";
		
		oldStyle(input);
		java8Style(input);
	}

	private static void java8Style(String input) {
		int total = Arrays
						.asList(input.split(" "))
						.stream()
						.mapToInt(e -> Integer.parseInt(e))
						.sum();	
		System.out.println("Total: " + total);
	}

	private static void oldStyle(String input) {
		String[] items = input.split(" ");
		int total = 0;
		//external iterator
		for (String item : items) {
			int num = Integer.parseInt(item);
			total += num;
		}
		System.out.println("Total: " + total);
	}

}

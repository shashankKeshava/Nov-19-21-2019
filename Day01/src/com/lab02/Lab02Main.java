package com.lab02;

import java.util.Scanner;

public class Lab02Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		int result = calculateSquare(number);
		result = increment(result);
		result = doubleNum(result);
		System.out.println("Output: " + result);
		scanner.close();
	}

	private static int calculateSquare(int num) {
		int square = num * num;
		System.out.println("*** squaring (" + square + ")");
		return square;
	}
	
	private static int increment(int num) {
		int incrementedValue = num + 1;
		System.out.println("*** incrementing (" + incrementedValue + ")");
		return incrementedValue;
	}
	
	private static int doubleNum(int num) {
		int doubledValue = num * 2;
		System.out.println("*** doubling (" + doubledValue + ")");
		return doubledValue;
	}
}

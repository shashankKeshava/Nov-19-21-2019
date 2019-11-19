package com.lab03;

import java.util.Scanner;

public class Lab03Main {

	public static void main(String[] args) {
		int[] inputNumbers = new int[3];
		
		readNumbersFromConsole(inputNumbers);
		
		calculateSquare(inputNumbers);
		System.out.println(getFormattedOutput("Squaring", inputNumbers));
		
		increment(inputNumbers);
		System.out.println(getFormattedOutput("Incrementing", inputNumbers));
		
		doubleIt(inputNumbers);
		System.out.println(getFormattedOutput("Doubling", inputNumbers));
		
		System.out.println("Output: " + inputNumbers);
	}

	private static void doubleIt(int[] inputNumbers) {
		for (int i = 0; i < inputNumbers.length; i++) {
			inputNumbers[i] *= 2;
		}
	}

	
	private static void increment(int[] inputNumbers) {
		for (int i = 0; i < inputNumbers.length; i++) {
			inputNumbers[i] += 1;
		}
	}
	
	private static void calculateSquare(int[] inputNumbers) {
		for (int i = 0; i < inputNumbers.length; i++) {
			inputNumbers[i] *= inputNumbers[i];
		}
	}

	private static String getFormattedOutput(String operation, int[] inputNumbers) {
		String output = "**** " + operation + "(";
		for (int i = 0; i < inputNumbers.length; i++) {
			if(i < inputNumbers.length - 1) {
				output += inputNumbers[i] + ", ";
			}
			else {
				output += inputNumbers[i];
			}
		}
		output += ")";
		return output;
	}

	private static void readNumbersFromConsole(int[] inputNumbers) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number I");
		inputNumbers[0] = scanner.nextInt();
		
		System.out.println("Enter number II");
		inputNumbers[1] = scanner.nextInt();
		
		System.out.println("Enter number III");
		inputNumbers[2] = scanner.nextInt();
		scanner.close();
	}

}

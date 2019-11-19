package com.lab01;

import java.util.Scanner;

public class Lab01Main {

	public static void main(String[] args) {
		System.out.println("Enter a number between 1 and 100");
		int target = (int)(Math.random() * 100);
		int attempts = 0;
		Scanner scanner = new Scanner(System.in);
		int guess = -1;
		while(true) {
			attempts++;
			guess = scanner.nextInt();
			if(guess > target) {
				System.out.println("Aim Lower");
			}
			else if(guess < target) {
				System.out.println("Aim Higher");
			}
			else {
				System.out.println("You've got it in " + attempts + " attempts");
				break;
			}
		}
	}

}

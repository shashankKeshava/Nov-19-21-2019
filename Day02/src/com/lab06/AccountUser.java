package com.lab06;

public class AccountUser {

	public static void main(String[] args) {
		//playWithNormalAccount();
		//playWithCurrentAccount();
		playWithPremiumCurrentAccount();
	}
	
	private static void playWithPremiumCurrentAccount() {
		PremiumCurrentAccount account = new PremiumCurrentAccount("ORR Caterers", 20000000);
		account.deposit(1000);
		account.deposit(1000);
		for(int i = 0; i < 200; i++) {
			double amount = Math.random() * 1100000;
			account.withdraw(amount);
		}
		account.printStatement();
		System.out.println("Balance: ₹" + account.getBalance());
	}
	
	private static void playWithCurrentAccount() {
		CurrentAccount account = new CurrentAccount("Intuit Caterers", 2000000);
		account.deposit(1000);
		account.deposit(1000);
		account.withdraw(100);
		account.withdraw(100);
		account.withdraw(100);
		account.withdraw(100);
		account.withdraw(100);
		account.withdraw(100);
		account.withdraw(100);
		account.withdraw(100);
		account.withdraw(100);
		account.withdraw(100);
		account.withdraw(100);
		account.withdraw(1000001);
		account.withdraw(1000003);
		account.printStatement();
		System.out.println("Balance: ₹" + account.getBalance());
	}

	private static void playWithNormalAccount() {
		Account account = new Account(20000);
		account.deposit(1000);
		account.deposit(1000);
		account.withdraw(100);
		account.withdraw(100);
		account.withdraw(100);
		account.withdraw(100);
		account.printStatement();
		System.out.println("Balance: ₹" + account.getBalance());
	}

}

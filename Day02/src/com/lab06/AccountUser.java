package com.lab06;

public class AccountUser {

	public static void main(String[] args) {
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

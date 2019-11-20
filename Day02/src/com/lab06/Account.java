package com.lab06;

import java.util.ArrayList;
import java.util.List;

public class Account {
	private double balance;
	private int withdrawCount;
	private List<Transaction> transactions = new ArrayList<>();
	
	public Account(double balance) {
		this.balance = balance;
	}
	
	public int getMaximumAllowableWithdrawals() {
		return 3;
	}
	
	
	public double getBalance() {
		return balance;
	}

	public void deposit(double amount) {
		balance += amount;
		Transaction txn = new Transaction("Deposit", amount);
		//transactions.add(e)
		transactions.add(txn);
	}
	
	public void withdraw(double amount) {
		withdrawCount++;
		balance -= amount;
		Transaction txn = new Transaction("Withdraw", amount);
		transactions.add(txn);
		
		if(withdrawCount > getMaximumAllowableWithdrawals()) {
			double fees = amount * 0.005;
			balance -= fees;
			Transaction txnObj = new Transaction("Interest", amount);
			transactions.add(txnObj);
		}
	}
	
	public void printStatement() {
		for (Transaction txn : transactions) {
			System.out.println(txn.getType() + " -> ₹" + txn.getAmount() + " at " + txn.getDate().toString());
		}
	}
}







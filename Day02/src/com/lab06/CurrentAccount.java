package com.lab06;

public class CurrentAccount extends Account {
	private String name;
	
	public CurrentAccount(String name, double balance) {
		super(balance);
		this.name = name;
	}
	
	public boolean isWithdrawWithinLimit(double amount) {
		return amount <= 100000;
	}

	public void withdraw(double amount) {
		if(!isWithdrawWithinLimit(amount)) {
			System.out.println("*****Withdraw denied for ₹" + amount);
		}
		else {
			super.withdraw(amount);
		}
	}
	
	public int getMaximumAllowableWithdrawals() {
		return 10;
	}
	
	
}

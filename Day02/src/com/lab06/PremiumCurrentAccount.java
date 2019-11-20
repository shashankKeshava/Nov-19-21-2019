package com.lab06;

public class PremiumCurrentAccount extends CurrentAccount {
	
	public PremiumCurrentAccount(String name, double balance) {
		super(name, balance);
	}
	
	public boolean isWithdrawWithinLimit(double amount) {
		return amount <= 1000000;
	}
	
	
	public int getMaximumAllowableWithdrawals() {
		return 100;
	}
}

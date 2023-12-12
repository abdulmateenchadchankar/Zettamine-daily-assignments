package com.zettamine.java.day4.question2;

public class SavingsAccount extends Account {


	private double minimumBalance;
	
	
	
	public SavingsAccount(int accountNumber, Customer customerObj, double balance, double minimumBalance) {
		super(accountNumber, customerObj, balance);
		this.minimumBalance = minimumBalance;
	}



	public double getMinimumBalance() {
		return minimumBalance;
	}



	public void setMinimumBalance(double minimumBalance) {
		this.minimumBalance = minimumBalance;
	}



	
	@Override
	public double withdraw(double amount) {
		if(balance>minimumBalance) {
			amount=balance-amount;
			
		}
		else {
			System.out.println("Insufficient amount");
		}return amount;
		
	}

}

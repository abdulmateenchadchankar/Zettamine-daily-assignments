package com.zettamine.java.day2;

public class BankApplication {
	
	private long accountNumber;
    private String name;
    private double balance;
    


	 public BankApplication() {
	        this.accountNumber = 0;
	        this.name = null;
	        this.balance = 0.0;
	    }
	 
	 public void createAccount(long accountNumber, String name, double initialDeposit) {
	        if (this.accountNumber == 0) {
	            this.accountNumber = accountNumber;
	            this.name = name;
	            this.balance = initialDeposit;
	            System.out.println("A/C opened");
	        } else {
	            System.out.println("A/C already opened with us.");
	        }
	    }
	 
	 public void deposit(double amount) {
	        if (accountNumber != 0) {
	            balance += amount;
	        } else {
	            System.out.println("Please open an A/C with us...");
	        }
	    }

	    public boolean withdraw(double amount) {
	        if (accountNumber != 0) {
	            if (amount <= balance) {
	                balance -= amount;
	                return true;
	            } else {
	                System.out.println("Error: Insufficient Balance");
	                return false;
	            }
	        } else {
	            System.out.println("Please open an A/C with us...");
	            return false;
	        }
	    }

	    public void displayDetails() {
	        if (accountNumber != 0) {
	            System.out.println("A/C no: " + accountNumber);
	            System.out.println("Name: " + name);
	            System.out.println("Balance: " + balance);
	        } else {
	            System.out.println("Please open an A/C with us...");
	        }
	    }
}

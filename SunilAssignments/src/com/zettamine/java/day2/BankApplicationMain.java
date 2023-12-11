package com.zettamine.java.day2;

import java.util.Scanner;

public class BankApplicationMain {
	 private static BankApplication account = new BankApplication();
	 private static Scanner sc = new Scanner(System.in);
	 
	public static void main(String[] args) {
		while (true) {
            System.out.println("1. Create account\n2. Deposit\n3. Withdraw\n4. Details\n5. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    createAccount();
                    break;
                case 2:
                    deposit();
                    break;
                case 3:
                    withdraw();
                    break;
                case 4:
                    displayDetails();
                    break;
                case 5:
                    System.out.println("Bye bye");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid operation. Please try again...");
            }
        }
		

	}
	private static void displayDetails() {
		account.displayDetails();
		
	}
	private static void withdraw() {
		System.out.print("Enter amount to be withdrawn: ");
        double amount = sc.nextDouble();
        account.withdraw(amount);
		
		
	}
	private static void deposit() {
		System.out.print("Enter amount to be deposited: ");
        double amount = sc.nextDouble();
        account.deposit(amount);
		
		
	}
	private static void createAccount() {
		System.out.print("Enter account number: ");
        long accountNumber = sc.nextLong();
        System.out.print("Enter name: ");
        String name = sc.next();
        System.out.print("Enter initial deposit: ");
        double initialDeposit = sc.nextDouble();

        account.createAccount(accountNumber, name, initialDeposit);	
	}
	

}

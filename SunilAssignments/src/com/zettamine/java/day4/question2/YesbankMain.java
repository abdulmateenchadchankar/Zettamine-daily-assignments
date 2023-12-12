package com.zettamine.java.day4.question2;

import java.util.Scanner;

public class YesbankMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter A/C number: ");
		int accountNumber = sc.nextInt();
		
		System.out.println("enter customer id: ");
		int customerId = sc.nextInt();
		
		System.out.println("enter customer name: ");
		String customerName = sc.next();
		
		System.out.println("enter customer email: ");
		String emailId = sc.next();
		
		System.out.println("enter balance: ");
		double balance = sc.nextDouble();
		
		System.out.println("enter minimum balance:");
		double minimumBalance = sc.nextDouble();
		
		System.out.println("enter amount to withdraw: ");
		double amount = sc.nextDouble();
		Customer customerObj = new Customer(customerId, customerName, emailId);
		SavingsAccount sa = new SavingsAccount(accountNumber, customerObj, balance, minimumBalance);
		System.out.println("Rs " + amount + "Debited");
		System.out.println("Balance " + sa.withdraw(amount) );
	}

}

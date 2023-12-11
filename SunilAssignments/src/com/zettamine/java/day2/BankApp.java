package com.zettamine.java.day2;

import java.util.Scanner;

public class BankApp {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		
		System.out.println("Enter the option: \n 1.Create Account \n 2.Deposit "
				+ "\n 3.Withdrawl \n 4.Details \n 5.Exit ");
		int a = sc.nextInt();
		
		
		if (a==1) {
			
			
			createAccount();
			
				
		}
		else if(a==2) {
			
			depositAmount();
		}
		else if (a==3) {
			withdrawAmount();
		}
		else if (a==4) {
			details();
		}
		else if (a==5) {
			System.out.println("--BYE BYE--");
			System.exit(0);
			
		}
		else {
			System.out.println("Invalid operator...Please try again...");
		}
	}
	
	
	
	

}

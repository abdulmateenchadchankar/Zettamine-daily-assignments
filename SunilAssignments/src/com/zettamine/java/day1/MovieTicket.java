package com.zettamine.java.day1;

import java.util.Scanner;

public class MovieTicket {
	
	
	
	
	  public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
		  System.out.println("Enter the number of tickets: ");
		  int noOfTic = sc.nextInt();
		  
		  if (noOfTic<5 || noOfTic>40) {
			  System.out.println("Minimum of 5 and Maximum of 40 Tickets");
			  return;
		  }
		  
		  System.out.println("Do you want refreshment:[Y/N] ");
		  char ref = sc.next().charAt(0);
		  
		  System.out.println("Do you have coupon code: [Y/N] ");
		  char coupon = sc.next().charAt(0);
		  
		  System.out.println("Enter the circle: [K/Q] ");
		  char circle = sc.next().charAt(0);
		  
		  
		  
		  double kingClassCost = 75.0;
	        double queenClassCost = 150.0;
	        double refreshmentCost = 50.0;

	        double totalCost = 0.0;

	        if (circle == 'K') {
	            totalCost = noOfTic * kingClassCost;
	        } else if (circle == 'Q') {
	            totalCost = noOfTic * queenClassCost;
	        } else {
	            System.out.println("Invalid Input");
	            return;
	        }

	        
	        if (noOfTic > 20) {
	            totalCost *= 0.90; 
	        }

	        if (ref == 'Y') {
	            totalCost += noOfTic * refreshmentCost;
	        }

	        if (coupon == 'Y') {
	            totalCost *= 0.98; 
	        }

	        
	        System.out.printf("Ticket cost: %.2f%n", totalCost);
	        
	        sc.close();
		  
}
}
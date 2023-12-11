package com.zettamine.java.day2;

import java.util.Scanner;

public class TicketMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TicketPrice tp = new TicketPrice();
		
		System.out.println("Enter no of bookings: ");
		int noOfBooking = sc.nextInt();
		
		System.out.println("Enetr no of available tickets: ");
	    TicketPrice.setAvailabletickets(sc.nextInt());	
		
	    for(int i=0;i<noOfBooking;i++) {
	    	
	    	System.out.println("Enter ticket Id: "   );
	    	tp.setTicketId(sc.nextInt());
	    	
	    	System.out.println("Enter the price: ");
	    	tp.setPrice(sc.nextInt());
	    	
	    	System.out.println("Enter the number of tickets: ");
			int noOfTickets = sc.nextInt();
			
			System.out.println();
			System.out.println("Available tickets: "+ TicketPrice.getAvailabletickets() );
			System.out.println("Total amount "+ tp.calculateTicketCost(noOfTickets));
			System.out.println("Available ticket after booking: " +TicketPrice.getAvailabletickets());
			System.out.println();
	    }
	    
		
		sc.close();
		
	}

}

package com.zettamine.java.day2;

public class TicketPrice {
	private int ticketId;
	private int price;
	private static int availabletickets;
	
	
	
	public int getTicketId() {
		return ticketId;
	}
	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public static int getAvailabletickets() {
		return availabletickets;
	}
	public static int setAvailabletickets(int availabletickets) {
		if(availabletickets>0) {
			return TicketPrice.availabletickets = availabletickets;
		}else {
		return -1;
	}
	

	
		
		
	}
	public int calculateTicketCost(int noOfTickets) {
		if(availabletickets>0) {
			availabletickets = availabletickets-noOfTickets;
			int totalAmount = noOfTickets*price;
			return totalAmount;
		}else {
			return -1;
		}
		
	}
	
}
		
		
	
	
	


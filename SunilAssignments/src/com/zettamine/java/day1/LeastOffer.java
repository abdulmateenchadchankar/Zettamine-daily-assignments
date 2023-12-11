package com.zettamine.java.day1;

import java.util.Scanner;

public class LeastOffer {
	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        
	        System.out.print("Enter the number of items: ");
	        int noOfItems = sc.nextInt();
	        sc.nextLine(); 

	        
	        int minDiscount = Integer.MAX_VALUE;
	        StringBuffer itemMinDisc = new StringBuffer();

	        
	        for (int i = 0; i < noOfItems; i++) {
	            
	            System.out.print("Enter item details (name, price, discount percentage): ");
	            String itemDetails = sc.nextLine();
	            String[] detailsArray = itemDetails.split(",");

	            
	            String itemName = detailsArray[0];
	            int price = Integer.parseInt(detailsArray[1]);
	            int discPercent = Integer.parseInt(detailsArray[2]);

	            
	            int discount = (price * discPercent) / 100;

	            
	            if (discount < minDiscount) {
	                minDiscount = discount;
	                itemMinDisc = new StringBuffer(itemName);
	            } else if (discount == minDiscount) {
	                
	                itemMinDisc.append("\t").append(itemName);
	            }
	        }

	       
	        System.out.println("Items with Minimum Discount: " + itemMinDisc);

	      sc.close();
	    }
	}




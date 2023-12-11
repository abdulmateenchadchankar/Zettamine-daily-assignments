package com.zettamine.java.day1;

import java.util.Scanner;

public class BillGeneration {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.print("Enter the no of Pizzas bought: ");
		int noOfPizza = sc.nextInt();
		
		System.out.print("Enter the no of puffs bought: ");
		int noOfPuff = sc.nextInt();
		
		System.out.print("Enter the no Of cool drinks bought: ");
		int noOfCool = sc.nextInt();
		
		billDetails(noOfPizza,noOfPuff,noOfCool);
		
		
		
		

	}
	private static void billDetails(int noOfPizza, int noOfPuff, int noOfCool) {
		System.out.println("Bill Details");
		int pizza= 100;
		int puffs= 20;
		int cooldrink=10;
		System.out.println("No Of Pizza:\t\t" + noOfPizza+"\tCost:"+pizza*noOfPizza);
		System.out.println("No Of puffs:\t\t" + noOfPuff+"\tCost:"+puffs*noOfPuff);
		System.out.println("No Of Cool Drinks:\t" + noOfCool +"\tCost:"+cooldrink*noOfCool);
		
	}

}

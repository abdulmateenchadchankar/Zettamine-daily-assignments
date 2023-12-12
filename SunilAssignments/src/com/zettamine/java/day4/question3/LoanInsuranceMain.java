package com.zettamine.java.day4.question3;

import java.util.Scanner;

public class LoanInsuranceMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the vehicle details ");
		System.out.println();
		System.out.print("Enter the vehicle number: ");
		String vehNumber = sc.next();
		System.out.print("Enter the model name: ");
		String modelName = sc.next();
		System.out.print("Enter the vehicle type: ");
		sc.nextLine();
		String vehicleType = sc.nextLine();
		System.out.print("Enter the price of vehicle: ");
		double vehiclePrice = sc.nextDouble();
		
		Vehicle vc = new Vehicle(vehNumber, modelName, vehicleType, vehiclePrice);
		System.out.printf("the eligible loan amount is %.2f",vc.issueLoan());
		System.out.println("\nInsurance ammount is "+vc.takeInsurance());
		

	}

}

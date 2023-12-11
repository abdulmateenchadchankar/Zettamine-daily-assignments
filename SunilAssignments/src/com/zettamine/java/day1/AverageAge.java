package com.zettamine.java.day1;

import java.util.Scanner;

public class AverageAge {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Enter the no of Employees: ");
		int noOfEmp= sc .nextInt();
		
		
		if (noOfEmp>=2) {
			
			
			avgAge(noOfEmp);
			
		}else {
			System.out.println("Please enter valid employee count");
			return;
		}
		
		
	}

	private static void avgAge(int noOfEmp) {
		int[] ageArr = new int[noOfEmp];
		double avg =0.00;
		double total = 0;
		System.out.printf("Enter the age of %d employees",noOfEmp);
		for (int i = 0; i < ageArr.length; i++) {
			
			ageArr[i]= sc.nextInt();
			if (ageArr[i]>=28 && ageArr[i]<=40 ) {
			total+= ageArr[i];
			avg = total/noOfEmp;
		    
			}else {
				System.out.println("Invalid age encountered!");
			}
		}System.out.println("The average age:" + avg);
		
	}

}

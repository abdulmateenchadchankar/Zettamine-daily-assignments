package com.zettamine.java.day2;

import java.util.Scanner;

public class PfMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the choice \n1.Permanent Employee \n2.Temporary Employee");
		int choice = sc.nextInt();
		
		
		
		if (choice ==1) {
			
			System.out.println("Enter Employee Id: ");
			int employeeId = sc.nextInt();
			
			System.out.println("Enter employeeName: ");
			String employeeName= sc.next();
			
			System.out.println("Enter basicPay: ");
			double basicPay =sc.nextDouble();
			
			Employee pf = new PermanentEmployee(employeeId, employeeName, basicPay);
			System.out.println();
			
			System.out.printf("The Calculated Salary is: ", pf.calculateSalary());
			System.out.printf("The loan amount is ", ((PermanentEmployee) pf).calculateLoanAmount());
		}else if (choice == 2 ){
			System.out.println("Enter Employee Id: ");
			int employeeId = sc.nextInt();
			
			System.out.println("Enter employeeName: ");
			String employeeName= sc.next();
			
			System.out.println("Enter hoursworked: ");
			int hoursWorked =sc.nextInt();
			
			System.out.println("Enter hourly wages ");
			
			System.out.println("");
			
			Employee pf = new TemporaryEmployee(employeeId, employeeName, hoursWorked, hourlyWages);
			System.out.println();
			
			System.out.printf("The Calculated Salary is: ", pf.calculateSalary());
			System.out.printf("The loan amount is ", ((PermanentEmployee) pf).calculateLoanAmount());
		}else {
			System.out.println("Invalid input");
		}

	}

}

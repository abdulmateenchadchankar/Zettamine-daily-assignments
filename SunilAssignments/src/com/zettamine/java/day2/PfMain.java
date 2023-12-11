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
			Loan ln = new Loan();
			System.out.println("The Calculated Salary is: "+ pf.getSalary());
			System.out.println("The loan amount is "+ ln.calculateLoanAmount(pf)) ;
			return;
		}else if (choice == 2 ){
			System.out.println("Enter Employee Id: ");
			int employeeId = sc.nextInt();
			
			System.out.println("Enter employeeName: ");
			String employeeName= sc.next();
			
			System.out.println("Enter hoursworked: ");
			int hoursWorked =sc.nextInt();
			
			System.out.println("Enter hourly wages ");
			int hourlyWages = sc.nextInt();
			
			System.out.println();
			
			Employee tf = new TemporaryEmployee(employeeId, employeeName, hoursWorked, hourlyWages);
			System.out.println();
			
			System.out.println("The Calculated Salary is: "+ tf.getSalary());
			Loan ln = new Loan();
			System.out.println("The loan amount is "+ ln.calculateLoanAmount(tf) );
			return;
		}else {
			System.out.println("Invalid input");
		}

	}

}

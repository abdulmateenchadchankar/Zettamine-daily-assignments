package com.zettamine.java.day2;

import java.util.Scanner;

public class StudentDetailsMain {
	private static String collName ="NIT";
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student's Id: ");
		int studentId = sc.nextInt();
		System.out.println("Enter Student's Name: ");
		String studentName = sc.next();
		
		System.out.println("Enter Student's address: ");
		String studentAddress = sc.next();
		
		System.out.println("Whether the student is from NIT(Yes/No): ");
		String dF = sc.next();
		
		
		if (dF.equalsIgnoreCase("Yes")) {
			StudentDetails sd = new StudentDetails(studentId, studentName, studentAddress);
			System.out.println("student Id " + sd.getStudentId() );
			System.out.println("student name "+ sd.getStudentName());
			System.out.println("student Address "+ sd.getStudentAddress());
			System.out.println("Student College "+ collName );
			
		}else if (dF.equalsIgnoreCase("No")) {
			System.out.println("Enter College Name");
			String collegeName = sc.next();
			StudentDetails sd = new StudentDetails(studentId, studentName, studentAddress, collegeName);
			System.out.println("student Id " + sd.getStudentId() );
			System.out.println("student name "+ sd.getStudentName());
			System.out.println("student Address "+ sd.getStudentAddress());
			System.out.println("College name "+ sd.getCollegeName() );
		}else {
			System.out.println("Wrong input");
			do {
				System.out.println("whether the student is from NIT(Yes/No): ");
				dF = sc.next();
				System.out.println();
				StudentDetails sd = new StudentDetails(studentId, studentName, studentAddress);
				System.out.println("student Id " + sd.getStudentId() );
				System.out.println("student name "+ sd.getStudentName());
				System.out.println("student Address "+ sd.getStudentAddress());
				System.out.println("Student College "+ collName );
				
			}while(dF.equalsIgnoreCase("Yes"));
		}
		sc.close();
	}

}

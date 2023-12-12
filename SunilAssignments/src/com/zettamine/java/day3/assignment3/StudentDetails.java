package com.zettamine.java.day3.assignment3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentDetails {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Student> sd = new ArrayList<Student>();
		do {
			System.out.println("Enter the name and  email: ");
			String name = sc.nextLine();
			String email = sc.nextLine();
			Student s = new Student(name,email);
			sd.add(s);
			
			System.out.print("do you want to add more students ?[Y/N]");
		}while(sc.nextLine().equalsIgnoreCase("y"));
		
		System.out.println("=".repeat(100));
		System.out.println("  STUD_ID   |     STUDENT NAME      |     STUDENT EMAIL       |  COLLEGE NAME" );
		System.out.println("=".repeat(75));
		
		sd.forEach(a->{
			System.out.println(a);
			System.out.println("-".repeat(100));
		});
		sc.close();
	}


}

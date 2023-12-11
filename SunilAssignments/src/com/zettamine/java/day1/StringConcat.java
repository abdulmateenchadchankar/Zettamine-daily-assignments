package com.zettamine.java.day1;

import java.util.Scanner;

public class StringConcat {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Inmate's name: ");
		String name = sc.next().concat(" ");
		System.out.println("Inmate's father's name: ");
		String fName = sc.next();
		
		
		String result = name.concat(fName);
		
		if (result.matches("[a-zA-Z ]+\\.?")) {
			System.out.println(result.toUpperCase());
		}else {
			System.err.println("Invalid name");
		}
		sc.close();
	}
	

}

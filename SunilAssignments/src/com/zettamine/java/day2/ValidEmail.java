package com.zettamine.java.day2;

import java.util.Scanner;

public class ValidEmail {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter email id: ");
		String s=sc.next();
		
		boolean b = s.matches("^[a-zA-Z0-9+.]+@[a-zA-Z0-9.-]+");
		if (b==true) {
			System.out.println("Valid Email");
		}else {
			System.out.println("Invalid Email");
		}
		
		

	}

}

package com.zettamine.java.day1;

import java.util.Scanner;

public class DisplayCharacter {
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter  4 number : ");
		int[] numArr = new int[4];
		for (int i = 0; i < numArr.length; i++) {
			numArr[i] = sc.nextInt();
		}
		System.out.println();
		for (int i = 0; i < numArr.length; i++) {
			System.out.println(numArr[i]+"\t"+(char) numArr[i]);
		}
		
		
		
	}
	
		
		
	}



package com.zettamine.java.day3.assignment2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class NumberOfNewWords {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student's Article");
		String article = sc.nextLine();
		
		String[] articleArray = article.toLowerCase().split("[,!. ]+");
		System.out.println("Number of words "+articleArray.length);
		
		Set<String> unqWords = new HashSet<String>(Arrays.asList(articleArray));
		System.out.println(unqWords);
		System.out.println("Number of unique words"+unqWords.size());
		sc.close();
	}


}

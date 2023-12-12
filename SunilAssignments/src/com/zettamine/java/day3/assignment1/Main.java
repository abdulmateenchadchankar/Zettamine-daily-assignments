package com.zettamine.java.day3.assignment1;

import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		Hosteller hstl1 = getHostellerDetails();
		System.out.print("Modify Room Number(Y/N): ");
		String rmNoCh = sc.next();
		if(rmNoCh.equalsIgnoreCase("Y")) {
			System.out.print("New Room Number: ");
			hstl1.setRoomNumber(sc.nextInt());
		}
		System.out.print("Modify Phone Number(Y/N): ");
		String phCh = sc.next();
		if(phCh.equalsIgnoreCase("Y")) {
			System.out.print("New Phone Number: ");
			hstl1.setPhone(sc.next());
		}
		System.out.println();
		System.out.println("The Student Details are as follows:");
		System.out.println("Student ID: "+hstl1.getStudentId());
		System.out.println("Student Name: "+hstl1.getName());
		System.out.println("Department ID: "+hstl1.getDepartmentId());
		System.out.println("Student Gender: "+hstl1.getGender());
		System.out.println("Student Phone No: "+hstl1.getPhone());
		System.out.println("Hostel Name: "+hstl1.getHostelName());
		System.out.println("Room No: "+hstl1.getRoomNumber());
		

	}
	public static Hosteller getHostellerDetails(){
		System.out.println("Enter the Student Details & Hostel Details: ");
		System.out.print("Student ID: ");
		int studId = sc.nextInt();
		sc.nextLine();
		System.out.print("Student Name: ");
		String studName = sc.nextLine();
		System.out.print("Department ID: ");
		int deptId = sc.nextInt();
		System.out.print("Student Gender: ");
		String gender = sc.next();
		System.out.print("Student Phone: ");
		String phone = sc.next();
		System.out.print("Hostel Name: ");
		String hostelName = sc.next();
		System.out.print("Room Number:  ");
		int roomNo = sc.nextInt();
	
		
		Hosteller hstl = new Hosteller(studId, studName, deptId, gender, phone, hostelName, roomNo);
		return hstl;
		

}
}

package com.zettamine.java.day4.question1;

import java.util.Scanner;

public class StudentHostellerMain {

	public static void main(String[] args) {
		Student student = getHostellerDetails();
        modifyDetails(student);

        System.out.println("The Student Details are as follows:");
        System.out.println("Student ID: " + student.getStudentId());
        System.out.println("Student Name: " + student.getName());
        System.out.println("Department ID: " + student.getDepartmentId());
        System.out.println("Student Gender: " + student.getGender());
        System.out.println("Student Phone No: " + student.getPhone());
        System.out.println("Hostel Name: " + student.getHosteller().getHostelName());
        System.out.println("Room No: " + student.getHosteller().getRoomNumber());
    }

    public static Student getHostellerDetails() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Student Details & Hostel Details:");
        System.out.print("Student ID: ");
        int studentId = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Student Name: ");
        String name = sc.nextLine();
        System.out.print("Department ID: ");
        int departmentId = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Gender[M/F]: ");
        String gender = sc.nextLine();
        System.out.print("Phone Number: ");
        String phone = sc.nextLine();
        
        
        System.out.print("Hostel Name: ");
        String hostelName = sc.nextLine();
        System.out.print("Room Number: ");
        int roomNumber = sc.nextInt();
        
        return new Student(studentId, hostelName, departmentId, gender, phone, new Hosteller(hostelName, roomNumber));
        
    }

    public static void modifyDetails(Student student) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Modify Room Number(Y/N): ");
        String modifyRoom = sc.nextLine();
        if (modifyRoom.equalsIgnoreCase("Y")) {
            System.out.print("New Room Number: ");
            student.getHosteller().setRoomNumber(sc.nextInt());
        }

        System.out.print("Modify Phone Number(Y/N): ");
        String modifyPhone = sc.nextLine();
        if (modifyPhone.equalsIgnoreCase("y")) {
            System.out.print("New Phone Number: ");
            String newPhone = sc.nextLine();
            student.setPhone(newPhone);
        }
    }
		
}

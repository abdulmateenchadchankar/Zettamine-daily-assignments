package com.zettamine.java.day4.question1;

public class Hosteller{
	private String hostelName;
    private int roomNumber;
	

    public Hosteller(String hostelName, int roomNumber) {
        
    	this.hostelName = hostelName;
        this.roomNumber = roomNumber;
    }

   

    public String getHostelName() {
        return hostelName;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }
	
	
}

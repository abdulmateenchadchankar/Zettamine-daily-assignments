package com.zettamine.java.day4.question1;

public class Student{
	protected int studentId;
    protected String name;
    protected int departmentId;
    protected String gender;
    protected String phone;
    protected Hosteller hosteller;

    public Student(int studentId, String name, int departmentId, String gender, String phone,Hosteller hosteller) {
        this.studentId = studentId;
        this.name = name;
        this.departmentId = departmentId;
        this.gender = gender;
        this.phone = phone;
        this.hosteller = hosteller;
    }

    

    public Hosteller getHosteller() {
		return hosteller;
	}



	public void setHosteller(Hosteller hosteller) {
		this.hosteller = hosteller;
	}



	public int getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public String getGender() {
        return gender;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
	

}

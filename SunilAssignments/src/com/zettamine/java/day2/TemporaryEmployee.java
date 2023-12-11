package com.zettamine.java.day2;

public class TemporaryEmployee extends Employee {
    public int  hoursWorked;
    public int hourlyWages;



	public TemporaryEmployee(int employeeId, String employeeName, int hoursWorked, int hourlyWages) {
		super(employeeId, employeeName);
		this.hoursWorked = hoursWorked;
		this.hourlyWages = hourlyWages;
	}



	@Override
	public void calculateSalary() {
		salary = hoursWorked * hourlyWages;
	}

}

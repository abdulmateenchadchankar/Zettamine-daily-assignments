package com.zettamine.java.day2;

public class PermanentEmployee extends Employee {
	private double basicPay;


	
	
	public PermanentEmployee(int employeeId, String employeeName, double basicPay) {
		super(employeeId, employeeName);
		this.basicPay = basicPay;
		calculateSalary();
	}


	


	@Override
	public void calculateSalary() {
		double PF_Amount = this.basicPay * 0.12;
		this.setSalary(this.basicPay - PF_Amount);
	}

}

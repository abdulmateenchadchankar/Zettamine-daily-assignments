package com.zettamine.java.day2;

public class PermanentEmployee extends Employee {
	private double basicPay;


	
	
	public PermanentEmployee(int employeeId, String employeeName, double basicPay) {
		super(employeeId, employeeName);
		this.basicPay = basicPay;
	}


	


	@Override
	public void calculateSalary() {
		double PF_Amount = basicPay * 0.12;
		salary = this.basicPay - PF_Amount;
	}

}

package com.zettamine.java.day2;

public class Loan {
	

	
	
	public double calculateLoanAmount(Employee employeeObj) {
		if (employeeObj instanceof PermanentEmployee ) {
			return (15/100)*employeeObj.getSalary();
		}else if (employeeObj instanceof TemporaryEmployee) {
			return (10/100)*employeeObj.getSalary();
		}else {
			return -1;
		}
	}
	
	
	

}

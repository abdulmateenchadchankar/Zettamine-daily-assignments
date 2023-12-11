package com.zettamine.java.day2;

public class Loan {
	

	
	
	public double calculateLoanAmount(Employee employeeObj) {
		if (employeeObj instanceof PermanentEmployee ) {
			return 0.15*employeeObj.getSalary();
		}else if (employeeObj instanceof TemporaryEmployee) {
			return 0.1*employeeObj.getSalary();
		}else {
			return -1;
		}
	}
	
	
	

}

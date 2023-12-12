package com.zettamine.java.day4.question3;

public class Vehicle implements Loan,Insurance {
	private String vehicleNumber;
	private String modelName;
	private String vehicleType;
	private double price;
	public String getVehicleNumber() {
		return vehicleNumber;
	}
	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public String getVehicleType() {
		return vehicleType;
	}
	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Vehicle(String vehicleNumber, String modelName, String vehicleType, double price) {
		super();
		this.vehicleNumber = vehicleNumber;
		this.modelName = modelName;
		this.vehicleType = vehicleType;
		this.price = price;
	}
	@Override
	public double takeInsurance() {
		if (this.price<=150000) {
			return 3500;
		} else if(this.price>150000 && this.price<=300000 ){
			return 4000;
		}else if (this.price>300000 ) {
			return 5000;

		}else {
			return -1;
		}
		
		
	}
	@Override
	public double issueLoan() {
		if (this.vehicleType.equalsIgnoreCase("4 Wheeler")) {
			return 0.8*this.price;
		}else if (this.vehicleType.equalsIgnoreCase("3 Wheeler")) {
			return 0.75*this.price;
		}else if (this.vehicleType.equalsIgnoreCase("2 Wheeler")) {
			return 0.5*this.price;
		}else {
		return -1;
		}
	}

	
}

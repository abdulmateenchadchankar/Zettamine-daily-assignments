package com.zeetamine.rainfall.Exception;

public class InvalidCityPincodeException extends RuntimeException {

	
	private static final long serialVersionUID = 1L;
	public InvalidCityPincodeException() {
		System.out.println("Enter Valid Pincode with 5 digits only");
		
	}

	public InvalidCityPincodeException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		
	}

	public InvalidCityPincodeException(String message, Throwable cause) {
		super(message, cause);
		
	}

	public InvalidCityPincodeException(String message) {
		super(message);
		
	}

	public InvalidCityPincodeException(Throwable cause) {
		super(cause);
		
	}
	
	
}

package com.zeetamine.rainfall.main;

import java.util.List;

import com.zeetamine.rainfall.UtilRainfall.RainfallReport;
import com.zeetamine.rainfall.dto.AnnualRainfall;
import com.zeetamine.rainfall.service.AnnualRainfallService;
import com.zeetamine.rainfall.service.AnnualRainfallServiceImpl;

public class RainfallLauncher {
	public static void main(String[] args) {
		String filePath = "C:\\Users\\Abdul Mateen\\Desktop\\AllCityMonthlyRainfall.txt";
		List<AnnualRainfall> cityDetails = RainfallReport.generateRainfallReport(filePath);
		AnnualRainfallService annualRainfall = new AnnualRainfallServiceImpl();
		annualRainfall.saveAnnualRainfall(cityDetails);
		annualRainfall.retrieveMaxAnnualRainfall();
}
}
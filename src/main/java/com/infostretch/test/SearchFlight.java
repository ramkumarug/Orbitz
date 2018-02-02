package com.infostretch.test;

import org.testng.annotations.Test;

import com.infostretch.generic.Driver;
import com.infostretch.generic.Lib;
import com.infostretch.page.Best_Travel_Deals;

public class SearchFlight extends Driver {


	@Test
	public void searchForFlights()
	{
		Best_Travel_Deals b=new Best_Travel_Deals(driver);
		Lib.getScreenshot(driver,"BeforeSearch");
		b.clickFLights();
		b.clickOneway();
		b.setOrigin("pune");
		b.setDestination("coimbatore");
		b.clickCalender();
		b.setDate();
		b.clickSearch();
		
		Lib.getScreenshot(driver,"AfterSearch");

		
	}
}

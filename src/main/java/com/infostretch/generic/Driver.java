package com.infostretch.generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


public class Driver implements Const {
	public WebDriver driver;
	static
	{
		System.setProperty(CHROME_KEY,CHROME_VALUE);
	}

	@BeforeClass
	public void openApplication()
	{
	    driver =new ChromeDriver();
	    driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get(URL);
	}
	
	@AfterClass
	public void closeApplication()
	{
		driver.close();
	}

	
}

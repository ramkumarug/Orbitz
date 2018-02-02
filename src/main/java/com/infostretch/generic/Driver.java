package com.infostretch.generic;

import java.util.concurrent.TimeUnit;
import com.infostretch.generic.Const;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class Driver implements Const {
	public WebDriver driver;
	static
	{
		System.setProperty(CHROME_KEY,CHROME_VALUE);
	}

	@BeforeMethod
	public void openApplication()
	{
	    driver =new ChromeDriver();
	    driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get(URL);
	}
	
	@AfterMethod
	public void closeApplication()
	{
		driver.close();
	}

	
}

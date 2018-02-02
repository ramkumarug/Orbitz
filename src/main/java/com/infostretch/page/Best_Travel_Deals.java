package com.infostretch.page;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Best_Travel_Deals {
	WebDriver driver;
	@FindBy(id="primary-header-flight")
	WebElement flights;

	@FindBy(id="flight-type-one-way-label")
	WebElement oneWay;

	@FindBy(id="flight-origin")
	WebElement origin;
	

	@FindBy(id="flight-destination")
	WebElement destination;

	@FindBy(xpath="//span[@class='icon icon-calendar']")
	WebElement calender;

	@FindBy(xpath="//button[@class='datepicker-cal-date' and @data-year='2018' and @data-month='1' and @data-day='26']")
	WebElement date;

	@FindBy(xpath="//select[@id='flight-adults']")
	WebElement adults;

	@FindBy(id="search-button")
	WebElement search;
	
	public Best_Travel_Deals(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickFLights()
	{
		flights.click();
	}
	
	public void clickOneway()
	{
		oneWay.click();
	}
	
	public void setOrigin(String source)
	{
		origin.sendKeys(source);
	}
	
	public void setDestination(String dest)
	{
		destination.sendKeys(dest);

	}
	public void clickCalender()
	{
		calender.click();
	}
	
	public void setDate()
	{
		date.click();
	}
	public void selectNoOfAdults()
	{
		Select s=new Select(adults);
		s.selectByIndex(0);
	}
	public void clickSearch()
	{
		search.click();
	}
	
}

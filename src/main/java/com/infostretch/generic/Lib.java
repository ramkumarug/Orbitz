package com.infostretch.generic;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Lib {
	public static void getScreenshot(WebDriver driver, String pageName)
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File srcFile=ts.getScreenshotAs(OutputType.FILE);
		File destFile=new File("./screen/"+new SimpleDateFormat("dd-MM-yyyy-H-m-s").format(new Date()).toString()+pageName+".png");
		try
		{
			FileUtils.copyFile(srcFile, destFile);
		}
		catch(Exception e)
		{
			
		}
	
	}


}

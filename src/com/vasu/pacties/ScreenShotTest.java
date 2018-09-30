package com.vasu.pacties;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScreenShotTest
{
	public static void main(String[] args) throws Exception
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://google.co.in");
		driver.manage().window().maximize();
	TakesScreenshot ts=(TakesScreenshot)driver;
	File src=ts.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(src, new 
		File("C:\\Users\\somesh\\Desktop\\ScreenShots\\google.png"));
	
	

	}

}

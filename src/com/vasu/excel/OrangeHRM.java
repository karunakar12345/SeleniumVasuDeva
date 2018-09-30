package com.vasu.excel;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OrangeHRM 
{
	public FirefoxDriver driver;
	String res;
	// appLaunch
	public String  appLaunch(String url)
	{
		driver=new FirefoxDriver();
		driver.get(url);
		driver.manage().window().maximize();
		
		//validation
		if (driver.findElement(By.id("btnLogin")).isDisplayed())
		{
			//System.out.println("Pass");
			res="Pass";
		}
		else
		{
			//System.out.println("Fails");
			res="Fail";
		}
		return res;
		
	}
	//appLogin
	public String  appLogin(String userName,String password)
	{
		driver.findElement(By.id("txtUsername")).sendKeys(userName);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
		driver.findElement(By.id("btnLogin")).click();
		
		//validation
		if (driver.findElement(By.linkText("PIM")).isDisplayed())
		{
			//System.out.println("Pass");
			res="Pass";
		}
		else
		{
			//System.out.println("Fails");
			res="Fail";
		}
		return res;
		
	}
	//AddEmp
	public String empReg(String fName,String lName) throws Exception
	{
		Thread.sleep(2000);
		
driver.findElement(By.linkText("PIM")).click();
		
		driver.findElement(By.linkText("Add Employee")).click();
		
		driver.findElement(By.id("firstName")).sendKeys(fName);
		driver.findElement(By.id("lastName")).sendKeys(lName);
		driver.findElement(By.xpath(".//*[@id='employeeId']")).clear();
		
		//driver.findElement(By.xpath(".//*[@id='employeeId']")).sendKeys("1);
		//driver.findElement(By.id("photofile")).click();
		
		//Runtime.getRuntime().exec("C:\\Users\\somesh\\Desktop\\vasu.exe");
		Thread.sleep(2000);
		driver.findElement(By.id("btnSave")).click();
		if (driver.findElement(By.xpath(".//*[@id='profile-pic']/h1")).isDisplayed()) 
		{
			res="Pass";
		}else
		{
			res="Fail";
		}
		return res;
	}
}

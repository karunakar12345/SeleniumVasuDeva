package com.vasu.java;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AppLaunchTest 
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
	
	public static void main(String[] args) 
	{
		AppLaunchTest app=new AppLaunchTest();
		//app.appLaunch("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");
	String results=app.appLaunch("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");
	System.out.println(results);
	app.appLogin("Admin", "Admin");
	
	}
}

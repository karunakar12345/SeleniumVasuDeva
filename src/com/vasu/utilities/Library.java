package com.vasu.utilities;



import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Library
{
	//global variables
	public static FirefoxDriver driver;
	public static String res;
public static String url="http://opensource.demo.orangehrmlive.com";
public static String userName="Admin";
public static String password="admin";


	// appLaunch
	
	public String appLaunch(String url)
	{
		driver=new FirefoxDriver();
		driver.get(url);
		driver.manage().window().maximize();
		
		if(driver.findElement(By.id("btnLogin")).isDisplayed())
		{
			res="Pass";
		}else
		{
			res="Fail";
		}
		return res;
	}
	
	//appLogin
	public String appLogin(String userName, String password)
	{
		driver.findElement(By.id("txtUsername")).sendKeys(userName);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
		driver.findElement(By.id("btnLogin")).click();
		if(driver.findElement(By.id("welcome")).isDisplayed())
		{
			res="Pass";
		}else
		{
			res="Fail";
		}
		return res;
		
	}
	//appLogout
	public String appLogout()
	{
		driver.findElement(By.id("welcome")).click();
		driver.findElement(By.linkText("Logout")).click();
		if(driver.findElement(By.id("btnLogin")).isDisplayed())
		{
			res="Pass";
		}else
		{
			res="Fail";
		}
		return res;
	}
	//appClose
	
	public void appClose()
	{
		driver.close();
	}
	//addEmp
	public String empAdd(String fName,String lName) throws Exception
	{
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.linkText("Add Employee")).click();
		driver.findElement(By.id("firstName")).sendKeys(fName);
		driver.findElement(By.id("lastName")).sendKeys(lName);
		driver.findElement(By.id("photofile")).click();
		Runtime.getRuntime().exec("C:\\Users\\somesh\\Desktop\\fup.exe");
		Thread.sleep(2000);
		driver.findElement(By.id("btnSave")).click();
		
		if(driver.findElement(By.xpath(".//*[@id='profile-pic']/h1")).isDisplayed())
		{
			res="Pass";
			
		}else
		{
			res="Fail";
		}
		return res;
	}
	public static void main(String[] args) throws Exception 
	{

Library app=new Library();
//app.appLaunch(url);

System.out.println(app.appLaunch(url));
System.out.println(app.appLogin(userName, password));
System.out.println(app.empAdd("vasusele","selenium"));

System.out.println(app.appLogout());
app.appClose();

	}

}

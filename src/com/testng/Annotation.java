package com.testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotation
{
	@Test() //class
	public void method()
	{
		System.out.println("AppLogin");
	}
	@Test() //class
	public void method1()
	{
		System.out.println("AddEmp");
	}
	@BeforeMethod
	public void before()
	{
		System.out.println("AppLaunch");
	}
	@AfterMethod
	public void after()
	{
		System.out.println("AppClose");
	}
	
	/*@BeforeMethod
	public void before()
	{
		System.out.println("BeforeMethod Executed");
	}
	@AfterMethod
	public void after()
	{
		System.out.println("AfterMethod Executed");
	}*/
}

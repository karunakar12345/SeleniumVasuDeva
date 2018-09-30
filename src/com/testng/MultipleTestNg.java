package com.testng;

import org.testng.annotations.Test;

public class MultipleTestNg
{
	@Test() 
	public void appLaunch()
	{
		System.out.println("appLaunch");
	}
	@Test(dependsOnMethods="appLaunch")
	public void appLogin()
	{
		System.out.println("appLogin");
	}
	@Test(dependsOnMethods="appLogin")
	public void appClose()
	{
		System.out.println("appClose");
	}
}

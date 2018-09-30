package com.testng;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class AddEmp extends ORHM
{
@Test 
public void addEmp()
{
	driver.findElement(By.linkText("PIM")).click();
	
	driver.findElement(By.linkText("Add Employee")).click();
	
	driver.findElement(By.id("firstName")).sendKeys("vasude344");
	driver.findElement(By.id("lastName")).sendKeys("vasu34565");
	
	
	driver.findElement(By.id("btnSave")).click();
}
}

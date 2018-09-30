package com.vasu.pacties;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileUploadTest 
{
	public static void main(String[] args) throws Exception  {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("Admin");
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("PIM")).click();
		
		driver.findElement(By.linkText("Add Employee")).click();
		
		driver.findElement(By.id("firstName")).sendKeys("vety6va34");
		driver.findElement(By.id("lastName")).sendKeys("sudd34678");
		
		driver.findElement(By.id("photofile")).click();
		
		Runtime.getRuntime().exec("C:\\Users\\somesh\\Desktop\\vasu.exe");
		Thread.sleep(2000);
		driver.findElement(By.id("btnSave")).click();
		

	}

}

package com.vasu.pacties;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GmailTest {

	public static void main(String[] args)
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("Http://google.co.in");
		driver.manage().window().maximize();
		
		//images
driver.findElement(By.xpath("//a[@class='gb_P'][@data-pid='2']")).click();

	}

}

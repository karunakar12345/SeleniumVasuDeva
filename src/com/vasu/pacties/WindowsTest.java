package com.vasu.pacties;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowsTest 
{

	public static void main(String[] args)
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.hdfcbank.com/");
		driver.manage().window().maximize();
		//.//*[@id='div-close']
		
	String parent=driver.getWindowHandle();
	//System.out.println(parent);
	
	driver.findElement(By.id("loginsubmit")).click();
	
Set<String> windows=driver.getWindowHandles();

for(String child:windows)
{
	//System.out.println(child);
	
	if (!parent.equals(child)) 
	{
		driver.switchTo().window(child);
		driver.findElement(By.xpath("html/body/div[4]/div[2]/div[1]/a")).click();
		
	}
}




	}

}

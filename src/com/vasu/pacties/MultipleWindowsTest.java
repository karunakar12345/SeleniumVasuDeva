package com.vasu.pacties;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
public class MultipleWindowsTest 
{
	public static void main(String[] args) throws Exception
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		
	Set<String> windows=driver.getWindowHandles();
	
	/*for(String child:windows)
	{
		//System.out.println(child);
		driver.switchTo().window(child);
		driver.close();
	}*/
		
				
		ArrayList<String> tabs=new ArrayList<>(windows);
		driver.switchTo().window(tabs.get(3));
		driver.close();
		Thread.sleep(3000);
		driver.switchTo().window(tabs.get(2));
	driver.close();
		Thread.sleep(3000);
		driver.switchTo().window(tabs.get(1));
	driver.close();

	}

}

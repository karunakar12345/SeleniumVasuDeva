package com.vasu.pacties;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebTableTest
{
	public static void main(String[] args) throws Exception
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("Admin");
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("PIM")).click();
		
		driver.findElement(By.linkText("Employee List")).click();
		//row Count
		
List<WebElement> rows=driver.findElements
(By.xpath(".//*[@id='resultTable']/tbody/tr"));
		System.out.println(rows.size());
		//coloumn count
		for (int i = 0; i < rows.size(); i++) 
		{
List<WebElement> col=rows.get(i).findElements(By.tagName("td"));
		//for (int j = 0; j < col.size(); j++) 
		//{

		System.out.println(col.get(2).getText());	
		//}
		}
	}

}

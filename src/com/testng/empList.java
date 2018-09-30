package com.testng;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class empList extends ORHM
{
	@Test
	public void empList()
	{
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
		for (int j = 0; j < col.size(); j++) 
		{
	//retrieving 3rd coloumn data 
		System.out.println(col.get(j).getText());	
		}
		}
	}
	
}

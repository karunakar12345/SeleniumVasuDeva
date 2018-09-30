package com.vasu.pacties;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class CalendarTest {
	public static void main(String[] args) throws Exception 
	{
		/*Scanner sc=new Scanner(System.in);
		String date=sc.next();*/
		String date="25/june/2019";
		String [] dateSplit=date.split("/");
		
		String day=dateSplit[0];
		String month=dateSplit[1];
		String year=dateSplit[2];
		
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.cleartrip.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//click on date 
		driver.findElement(By.id("DepartDate")).click();
		// selecting calyear
	String calYear=driver.findElement(By.className("ui-datepicker-year")).getText();
	while (!calYear.equals(year)) 
	{
		driver.findElement(By.className("nextMonth")).click();
		calYear=driver.findElement(By.className("ui-datepicker-year")).getText();
	}
	
//Select calMonth
	String calMonth=driver.findElement(By.className("ui-datepicker-month")).getText();
	while (!calMonth.equalsIgnoreCase(month)) 
	{
		driver.findElement(By.className("nextMonth")).click();
		calMonth=driver.findElement(By.className("ui-datepicker-month")).getText();
	}
	//Select calDay
	
	//Rows count
List<WebElement>  rows=
driver.findElements(By.xpath(".//*[@id='ui-datepicker-div']/div[1]/table/tbody/tr"));
	
for (int i = 0; i <rows.size(); i++)
{
	//cloumn count
	List<WebElement> col=rows.get(i).findElements(By.tagName("td"));
	for (int j = 0; j <col.size(); j++) 
	{
	String claDay=col.get(j).getText();
	if (claDay.equals(day)) 
	{
		col.get(i).click();
		break;
	}
		
	}
	
}
	}

}

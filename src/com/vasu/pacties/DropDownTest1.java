package com.vasu.pacties;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DropDownTest1
{
	public static void main(String[] args) 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("Http://Amazon.in");
		driver.manage().window().maximize();
	WebElement drop=driver.findElement(By.id("searchDropdownBox"));
List<WebElement> dropList=drop.findElements(By.tagName("option"));
System.out.println(dropList.size());
for (int i = 0; i < dropList.size(); i++)
{
	if (dropList.get(i).getText().equals("Baby"))
	{
		dropList.get(i).click();
	}
}
/*for(WebElement element:dropList)
{
if (element.getText().equals("Baby"))
{
element.click();	
}
}*/
	}

}

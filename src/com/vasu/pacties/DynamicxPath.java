package com.vasu.pacties;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DynamicxPath
{
	public static void main(String[] args) throws Exception
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		
driver.findElement(By.xpath(".//*[@id='src']")).sendKeys("H");

Thread.sleep(3000);
		
List<WebElement> list=
driver.findElements(By.xpath(".//*[@id='search']/div/div[1]/div/ul/li"));
for(WebElement element:list)
{
	System.out.println(element.getText());
}

	}

}

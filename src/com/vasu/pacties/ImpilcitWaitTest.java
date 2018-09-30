package com.vasu.pacties;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImpilcitWaitTest 
{
	public static void main(String[] args)
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://gmail.com");
			driver.manage().window().maximize();
//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebDriverWait myWait=new WebDriverWait(driver, 20);
driver.findElement(By.xpath
		(".//*[@id='identifierId']")).sendKeys("vasu.584");
driver.findElement(By.xpath
		(".//*[@id='identifierNext']/content/span")).click();

myWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath
(".//*[@id='password']/div[1]/div/div[1]/input")));

driver.findElement(By.xpath
(".//*[@id='password']/div[1]/div/div[1]/input")).sendKeys("asdsfc");
	}

}

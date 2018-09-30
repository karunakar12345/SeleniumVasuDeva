package com.vasu.pacties;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertTest
{
	public static void main(String[] args)
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://ksrtc.in/oprs-web/");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//explicit
		
		WebDriverWait myWait=new WebDriverWait(driver, 30);
		
		driver.findElement(By.xpath(".//*[@id='searchBtn']")).click();
		
		myWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("pwsd")));
		
		Alert alt=driver.switchTo().alert();
		//get the text present on alert box
		System.out.println(alt.getText());
		alt.accept();// clik on Ok Button
		//alt.dismiss();//click on close/cancell
		//alt.sendKeys("Message");
		driver.close();
		driver.quit();

	}

}

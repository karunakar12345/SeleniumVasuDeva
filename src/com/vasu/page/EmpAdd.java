package com.vasu.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EmpAdd 
{
@FindBy(linkText="PIM")
WebElement pim;
@FindBy(linkText="Add Employee")
WebElement addEmp;
@FindBy(id="firstName")
WebElement fName;
@FindBy(id="lastName")
WebElement lName;
@FindBy(id="btnSave")
WebElement save;
public void addEmp()
{
	pim.click();
	addEmp.click();
	fName.sendKeys("vasueree");
	lName.sendKeys("asdfghjkl");
	save.click();
}
}

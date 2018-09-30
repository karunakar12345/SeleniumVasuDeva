package com.vasu.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage 
{

@FindBy(id="txtUsername")
WebElement userName;
@FindBy(id="txtPassword")
WebElement password;
@FindBy(id="btnLogin")
WebElement login;


public void appLogin(String uName,String pwd)
{
	userName.sendKeys(uName);
	password.sendKeys(pwd);
	login.click();
	
}


}

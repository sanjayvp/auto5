package com.dice5.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.dice5.base.BasePageObject;

public class LoginPage extends BasePageObject<LoginPage>{
	
	private By emailfield=By.xpath("//input[@id='email']");
	private By passwordfield=By.xpath("//input[@id='password']");	
	private By signinButton= By.xpath("//button[@type='submit']");
	private  By ErrorMessageLocator=By.xpath("//*[@data-automation-id='login-failure-help-message']");
	private By ForgotPasswordLink=By.linkText("Forgot Password?");
	
	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
public void openLoginPage(String loginurl) {
	System.out.println("opening login page");
	getPage(loginurl);
}
public HomePage login(String loginurl,String email,String password) {
	openLoginPage(loginurl);
	System.out.println("typing email");
	type(email,emailfield);
	System.out.println("typing password");
	type(password, passwordfield);
	System.out.println("Click on SigninButton");
	click(signinButton);
	return new HomePage(driver);
}
public String captureLoginError() {
	System.out.println("wait till Error is displayed");
	waitForVisibilityOf(ErrorMessageLocator);
	return getTextOfWebelement(ErrorMessageLocator);
}
public ForgotPasswordPage openForgotPasswordPage() {
	click(ForgotPasswordLink);
	return new ForgotPasswordPage(driver);
	
}

}

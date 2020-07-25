package com.dice5;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.dice5.pages.HomePage;
import com.dice5.pages.LoginPage;

public class LoginTests extends BaseTests{
	public String Loginurl="https://www.dice.com/dashboard/login";
	public String email="aerosoftn@gmail.com";
	public String password="ganitanand12@";

	@Test
	public void positiveLoginTest() {
		LoginPage lp=new LoginPage(driver);
		HomePage hp=lp.login(Loginurl,email, password);
		hp.waitForHomePageToLoad();
		Assert.assertTrue(hp.captureTitle().equals(hp.HomePage_expectedTitle), "Actual title is not as expected");
		
	}
	
	
}

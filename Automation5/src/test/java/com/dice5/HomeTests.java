package com.dice5;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.dice5.pages.HomePage;
import com.dice5.pages.LoginPage;

public class HomeTests extends BaseTests {
	public String Loginurl="https://www.dice.com/dashboard/login";
	public String email="aerosoftn@gmail.com";
	public String password="ganitanand12@";
/**
 * verify correctProfile()
 * call below methods
 * 1.LoginPage : login() and pass driver to HomePage constructor
 * 2.HomePage : wait to load
 * 3.Home page tests :call HomePage : isCorrectProfileloaded() and use in assert
 */
	@Test
	public void verifyProfile() {
		LoginPage lp=new LoginPage(driver);
		HomePage hp=lp.login(Loginurl, email, password);
		hp.waitForHomePageToLoad();
		Assert.assertTrue(hp.isCorrectProfileLoaded(),"Loaded profile is not as expected ");
		
	}
	
}

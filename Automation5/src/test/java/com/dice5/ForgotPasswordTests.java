package com.dice5;

import org.testng.annotations.Test;

public class ForgotPasswordTests extends BaseTests {
@Test
	public void verifyForgotPassword() {
		/**
		 * 1.LoginPage : open login page
		 * 2.Login Page : click on link forgot password pass driver 
		 * 3.forgot password page : wait to load
		 * 4.forgot password page : get title of page
		 * 
		 */
	}

public void verifyForgotPassword_invaliddata() {
	/**
	 * 1.LoginPage : open login page
	 * 2.Login Page : click on link forgot password
	 * 3.forgot password page : wait to load
	 * 4.forgot password page : get title of page
	 * 5.forgot password page :enter invalid email in field email
	 * 6.forgot password page :enter same email in field confirm email
	 * 7.forgot password page :capture error 
	 * 8.ForgotPasswordTests : validate error
	 */
}
	
}

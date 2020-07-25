package com.dice5.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.dice5.base.BasePageObject;

public class HomePage extends BasePageObject<HomePage> {
	private By customerName = By.xpath("//*[@id='dice-login-customer-name']");
	private By SearchButton = By.xpath("//*[@id='submitSearch-button']");
	private String expectedProfileName = "Sanjay vp";
	public String HomePage_expectedTitle = "Dashboard Home Feed | Dice.com";

	public HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void waitForHomePageToLoad() {
		// waitForVisibilityOf(customerName);
		waitForVisibilityOf(SearchButton);
	}

	public String captureTitle() {

		return getTitle();

	}

	public boolean isCorrectProfileLoaded() {
		System.out.println("Actual Customer name displayed : "+ getTextOfWebelement(customerName));
		return getTextOfWebelement(customerName).equals(expectedProfileName);

	}

}

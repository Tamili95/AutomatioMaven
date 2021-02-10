package com.automation.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShopPayment_Page {

	
	public static WebDriver driver;
	
	@FindBy(xpath="//a[@class='bankwire']")
	private WebElement payByBank;
	
	//Second Order
	
	@FindBy(xpath="//a[@title='Pay by check.']")
	private WebElement payByCheck;
	

	public WebElement getPayByCheck() {
		return payByCheck;
	}

	public ShopPayment_Page(WebDriver driver2) {

		this.driver = driver2;
		PageFactory.initElements(driver, this);
	
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getPayByBank() {
		return payByBank;
	}
	
	
}

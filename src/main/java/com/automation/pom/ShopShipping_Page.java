package com.automation.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShopShipping_Page {

	
	public static WebDriver driver;
	
	@FindBy(xpath="//button[@name='processCarrier']")
	private WebElement shippingProceed;
	
	@FindBy(xpath="//a[@class='fancybox-item fancybox-close']")
	private WebElement termsandcondtionsPopup;
	
	@FindBy(xpath="//input[@id='cgv']")
	private WebElement termsandcondtions_Checkbox;
	
	//Second Order
	
	@FindBy(xpath="//input[@name='cgv']")
	private WebElement checkbox;
	
	@FindBy(xpath="//button[@name='processCarrier']")
	private WebElement shipProceed;

	public WebElement getCheckbox() {
		return checkbox;
	}

	public WebElement getShipProceed() {
		return shipProceed;
	}

	public ShopShipping_Page(WebDriver driver2) {

	this.driver = driver2;
	PageFactory.initElements(driver, this);
	
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getShippingProceed() {
		return shippingProceed;
	}

	public WebElement getTermsandcondtionsPopup() {
		return termsandcondtionsPopup;
	}

	public WebElement getTermsandcondtions_Checkbox() {
		return termsandcondtions_Checkbox;
	}
	
	
	
	
}

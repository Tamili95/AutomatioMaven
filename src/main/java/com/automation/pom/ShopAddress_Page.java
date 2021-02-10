package com.automation.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShopAddress_Page {

	public static WebDriver driver;
	
	@FindBy(xpath="//textarea[@name='message']")
	private WebElement textArea;
	
	@FindBy(xpath="//button[@name='processAddress']")
	private WebElement addressProceed;
	
	@FindBy(xpath="//textarea[@name='message']")
	private WebElement textArea2;
	
	@FindBy(xpath="//button[@name='processAddress']")
	private WebElement addressProceed2;

	public WebElement getTextArea2() {
		return textArea2;
	}

	public WebElement getAddressProceed2() {
		return addressProceed2;
	}

	public ShopAddress_Page(WebDriver driver2) {

		this.driver = driver2;
		PageFactory.initElements(driver, this);
	
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getTextArea() {
		return textArea;
	}

	public WebElement getAddressProceed() {
		return addressProceed;
	}
	
	
	
	
}

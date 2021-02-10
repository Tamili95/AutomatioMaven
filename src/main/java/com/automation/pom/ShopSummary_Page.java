package com.automation.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShopSummary_Page {

	public static WebDriver driver;
	
	@FindBy(xpath="//a[@class='cart_quantity_down btn btn-default button-minus']")
	private WebElement minus_Btn;
	
	@FindBy(xpath="(//a[@title='Proceed to checkout'])[2]")
	private WebElement addressProcees;
	
	@FindBy(xpath="//span[text()='Proceed to checkout']")
	private WebElement summaryCheckout;

	public WebElement getSummaryCheckout() {
		return summaryCheckout;
	}

	public ShopSummary_Page(WebDriver driver2) {

		this.driver = driver2;
		PageFactory.initElements(driver, this);
	
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getMinus_Btn() {
		return minus_Btn;
	}

	public WebElement getAddressProcees() {
		return addressProcees;
	}
	
	
	
}

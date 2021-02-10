package com.automation.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShopOrderconfirm1_Page {

	public static WebDriver driver;
	
	@FindBy(xpath="(//strong[@class='dark'])[6]")
	private WebElement scrollDown;
	
	@FindBy(xpath="//a[@title='Back to orders']")
	private WebElement backToOrder;
	
	//Second ORder
	
	@FindBy(xpath="//p[text()='Your order on My Store is complete.']")
	private WebElement orderComplete;

	public WebElement getOrderComplete() {
		return orderComplete;
	}

	public ShopOrderconfirm1_Page(WebDriver driver2) {

		this.driver = driver2;
		PageFactory.initElements(driver, this);
	
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getScrollDown() {
		return scrollDown;
	}

	public WebElement getBackToOrder() {
		return backToOrder;
	}
	
	
	
	
}

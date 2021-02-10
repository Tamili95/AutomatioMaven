package com.automation.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderHistory_Page {

	public static WebDriver driver;

	@FindBy(xpath = "(//a[@class='btn btn-default button button-small'])[10]")
	private WebElement backToHome;

	public OrderHistory_Page(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);

	}

	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getBackToHome() {
		return backToHome;
	}

}

package com.automation.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShopPay_Page {

	public static WebDriver driver;
	public ShopPay_Page(WebDriver driver2) {
 
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	
	}

	@FindBy(xpath="//button[@class='button btn btn-default button-medium']")
	private WebElement confirm_Btn;
	
	@FindBy(xpath="(//button[@type='submit'])[2]")
	private WebElement confirm;

	public WebElement getConfirm() {
		return confirm;
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getConfirm_Btn() {
		return confirm_Btn;
	}
	
	
}

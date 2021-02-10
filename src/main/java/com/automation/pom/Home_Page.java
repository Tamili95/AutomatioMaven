package com.automation.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Page {

	public static WebDriver driver;
	
	@FindBy(xpath="//a[contains(text(),'Sign in')]")
	private WebElement signin_Btn;
	
	@FindBy(xpath="//a[@title='Women']")
	private WebElement womenBtn;
	
	@FindBy(xpath="//a[@title='Blouses']")
	private WebElement blousesBtn;
	

	public WebElement getWomenBtn() {
		return womenBtn;
	}

	public WebElement getBlousesBtn() {
		return blousesBtn;
	}

	public Home_Page(WebDriver driver2) {

	this.driver = driver2;
	PageFactory.initElements(driver, this);
	
	}

	public WebElement getSignin_Btn() {
		return signin_Btn;
	}
	
	
	
	
}

package com.automation.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Blouses_Page {

	public static WebDriver driver;
	
	@FindBy(xpath="//img[@title='Blouse']")
	private WebElement blouse_Img;
	
	@FindBy(xpath="//a[@class='quick-view']")
	private WebElement blouse_Quickview;
	
	@FindBy(xpath="//iframe[@class='fancybox-iframe']")
	private WebElement blouse_iframe;
	
	@FindBy(xpath="//input[@name='qty']")
	private WebElement qty_field;
	
	@FindBy(xpath="//select[@id='group_1']")
	private WebElement sizeDropdown;
	
	@FindBy(xpath="//a[@name='White']")
	private WebElement blouseColor;
	
	@FindBy(xpath="//button[@name='Submit']")
	private WebElement BlouseaddToCart;
	
	@FindBy(xpath="//a[@title='Proceed to checkout']")
	private WebElement firstcheckout;

	public Blouses_Page(WebDriver driver2) {

	this.driver = driver2;
	PageFactory.initElements(driver, this);
	
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getBlouse_Img() {
		return blouse_Img;
	}

	public WebElement getBlouse_Quickview() {
		return blouse_Quickview;
	}

	public WebElement getBlouse_iframe() {
		return blouse_iframe;
	}

	public WebElement getQty_field() {
		return qty_field;
	}

	public WebElement getSizeDropdown() {
		return sizeDropdown;
	}

	public WebElement getBlouseColor() {
		return blouseColor;
	}

	public WebElement getBlouseaddToCart() {
		return BlouseaddToCart;
	}

	public WebElement getFirstcheckout() {
		return firstcheckout;
	}
	
	
	
}

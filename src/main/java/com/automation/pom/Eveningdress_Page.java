package com.automation.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Eveningdress_Page {

	
	public static WebDriver driver;
	
	@FindBy(xpath="//span[text()='Manufacturer']")
	private WebElement manufacturer;
	
	@FindBy(xpath="//img[@title='Printed Dress']")
	private WebElement dress_img;
	
	@FindBy(xpath="//span[text()='Quick view']")
	private WebElement quickView;
	
	@FindBy(xpath="//iframe[@class='fancybox-iframe']")
	private WebElement quickView_Popup;
	
	@FindBy(xpath="//a[contains(@class,'plus product')]")
	private WebElement plusIcon;
	
	@FindBy(xpath="//select[@id='group_1']")
	private WebElement size_Dropdown;
	
	@FindBy(xpath="//a[@id='color_24']")
	private WebElement dressColor;
	
	@FindBy(xpath="//a[@id='wishlist_button']")
	private WebElement addtoWishlist_Btn;
	
	@FindBy(xpath="//a[@title='Close']")
	private WebElement wishlist_Popup;
	
	@FindBy(xpath="//button[@name='Submit']")
	private WebElement addToCart_Btn;
	
	@FindBy(xpath="//a[@title='Proceed to checkout']")
	private WebElement proceedToCheckout;
	
	public WebElement getQuickView_Popup() {
		return quickView_Popup;
	}

	public WebElement getPlusIcon() {
		return plusIcon;
	}

	public WebElement getSize_Dropdown() {
		return size_Dropdown;
	}

	public WebElement getDressColor() {
		return dressColor;
	}

	public WebElement getAddtoWishlist_Btn() {
		return addtoWishlist_Btn;
	}

	public WebElement getWishlist_Popup() {
		return wishlist_Popup;
	}

	public WebElement getAddToCart_Btn() {
		return addToCart_Btn;
	}

	public WebElement getProceedToCheckout() {
		return proceedToCheckout;
	}

	public Eveningdress_Page(WebDriver driver2) {

	this.driver = driver2;
	PageFactory.initElements(driver, this);
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getManufacturer() {
		return manufacturer;
	}

	public WebElement getDress_img() {
		return dress_img;
	}

	public WebElement getQuickView() {
		return quickView;
	}
	
	
}

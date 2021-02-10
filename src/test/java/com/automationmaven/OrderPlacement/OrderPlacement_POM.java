package com.automationmaven.OrderPlacement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.automation.baseclass.BaseClass;
import com.automation.pom.Blouses_Page;
import com.automation.pom.Eveningdress_Page;
import com.automation.pom.Home_Page;
import com.automation.pom.Login_Page;
import com.automation.pom.MyAccount_Page;
import com.automation.pom.OrderHistory_Page;
import com.automation.pom.ShopAddress_Page;
import com.automation.pom.ShopOrderconfirm1_Page;
import com.automation.pom.ShopPay_Page;
import com.automation.pom.ShopPayment_Page;
import com.automation.pom.ShopShipping_Page;
import com.automation.pom.ShopSummary_Page;

public class OrderPlacement_POM extends BaseClass {

	public static WebDriver driver;
	
	public static void main(String[] args) throws Throwable {

		driver = getDriver("chrome");
		getURL("http://automationpractice.com/index.php");
		
		Home_Page home = new Home_Page(driver);
		clickOnElement(home.getSignin_Btn());
		
		Login_Page login = new Login_Page(driver);
		scrollUpandDown(login.getCreateAccount_Txt());
		inputValueElement(login.getEmailAddress(), "tomandjerry1@gmail.com");
		inputValueElement(login.getPassword(), "tomandjerry");
		clickOnElement(login.getSubmit_Btn());
		
		MyAccount_Page account = new MyAccount_Page(driver);
		actionsClass("moveto", account.getDresses());
		actionsClass("moveto", account.getEveningDresses());
		actionsClass("clickon", account.getEveningDresses());
		
		Eveningdress_Page eve = new Eveningdress_Page(driver);
		scrollUpandDown(eve.getManufacturer());
		
		explicitWait(100, eve.getDress_img());
		
		actionsClass("moveto", eve.getDress_img());
		actionsClass("moveto", eve.getQuickView());
		actionsClass("clickon", eve.getQuickView());
		
		frameOperations("framebyElement", null, null, eve.getQuickView_Popup());
		
		implicitWait(30, TimeUnit.SECONDS);

		clickOnElement(eve.getPlusIcon());
		clickOnElement(eve.getPlusIcon());
		
		dropdownSelect(eve.getSize_Dropdown(), "byValue", "3");
		clickOnElement(eve.getDressColor());
		clickOnElement(eve.getAddtoWishlist_Btn());
		
		implicitWait(30, TimeUnit.SECONDS);
		
		clickOnElement(eve.getWishlist_Popup());
		clickOnElement(eve.getAddToCart_Btn());
		
		sleep(3000);
		
		clickOnElement(eve.getProceedToCheckout());
		

		ShopSummary_Page sum = new ShopSummary_Page(driver);
		clickOnElement(sum.getMinus_Btn());
		scrollUpandDown(sum.getAddressProcees());
		clickOnElement(sum.getAddressProcees());
		

		ShopAddress_Page add = new ShopAddress_Page(driver);
		inputValueElement(add.getTextArea(), "Please handle with care");
		clickOnElement(add.getAddressProceed());

		implicitWait(30,TimeUnit.SECONDS);
		
		ShopShipping_Page ship = new ShopShipping_Page(driver);
		clickOnElement(ship.getShippingProceed());

		implicitWait(30,TimeUnit.SECONDS);
		
		clickOnElement(ship.getTermsandcondtionsPopup());
		clickOnElement(ship.getTermsandcondtions_Checkbox());
		clickOnElement(ship.getShippingProceed());
		
		ShopPayment_Page pay = new ShopPayment_Page(driver);
		scrollUpandDown(pay.getPayByBank());
		clickOnElement(pay.getPayByBank());
		
		ShopPay_Page shop = new ShopPay_Page(driver);
		clickOnElement(shop.getConfirm_Btn());
		
		ShopOrderconfirm1_Page conf = new ShopOrderconfirm1_Page(driver);
		scrollUpandDown(conf.getScrollDown());

		implicitWait(30,TimeUnit.SECONDS);

		takeScreenshot("C:\\Users\\Tamil\\eclipse-workspace\\AutomationProject\\Screenshot\\snap.png");
        sleep(3000);
		clickOnElement(conf.getBackToOrder());
		implicitWait(30,TimeUnit.SECONDS);
		
		OrderHistory_Page his = new OrderHistory_Page(driver);
		clickOnElement(his.getBackToHome());

		implicitWait(30,TimeUnit.SECONDS);
		
		actionsClass("moveto", home.getWomenBtn());
		actionsClass("moveto", home.getBlousesBtn());
		actionsClass("clickon", home.getBlousesBtn());
		
		Blouses_Page bl = new Blouses_Page(driver);
		actionsClass("moveto", bl.getBlouse_Img());
		actionsClass("moveto", bl.getBlouse_Quickview());
		actionsClass("clickon", bl.getBlouse_Quickview());
		frameOperations("framebyElement", null, null, bl.getBlouse_iframe());
		sleep(2000);
		bl.getQty_field().clear();
		inputValueElement(bl.getQty_field(), "5");
		dropdownSelect(bl.getSizeDropdown(), "byValue", "2");
		clickOnElement(bl.getBlouseColor());
		clickOnElement(bl.getBlouseaddToCart());
		sleep(3000);
		clickOnElement(bl.getFirstcheckout());

		clickOnElement(sum.getSummaryCheckout());

		inputValueElement(add.getTextArea2(), "This is my second order");
		clickOnElement(add.getAddressProceed2());

		implicitWait(30, TimeUnit.SECONDS);
		
		clickOnElement(ship.getCheckbox());
		clickOnElement(ship.getShipProceed());

		clickOnElement(pay.getPayByCheck());
		
		sleep(3000);

		clickOnElement(shop.getConfirm());
		scrollUpandDown(conf.getOrderComplete());
		
		takeScreenshot("C:\\Users\\Tamil\\eclipse-workspace\\AutomationProject\\Screenshot\\snap1.png");

	}
	
}

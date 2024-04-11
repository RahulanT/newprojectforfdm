package com.newprojectforfdm.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.newprojectforfdm.global.utilities.BrowserUtilities;

public class ProductPage extends BrowserUtilities{
	
	public WebDriver sdriver;

	public ProductPage() {

		PageFactory.initElements(driver, this);
		
	}

	@FindBy(xpath = "//*[@id=\"test\"]/button")
	WebElement AddToCartButton;
	
	public void addToCart() {
		
	      Actions a = new Actions(driver);
	      a.moveToElement(AddToCartButton);
	      a.perform();
		
		setExplicitWait(10);
		waitForElementToBeClickable(AddToCartButton);
		//waitForVisibilityOf(AddToCartButton);
		AddToCartButton.click();
	}	
	
	
//	public void addToCart() {
//		try {
//			Thread.sleep(3000);
//			//assertEquals( "https://www.bestbuy.ca/en-ca?intlreferer=&intlredir=https://www.bestbuy.com/" , driver.getCurrentUrl() );
//			//objSelect = new Select(ShopLink);
//			AddToCartButton.click();
//			
//			Thread.sleep(3000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		
//	}
}

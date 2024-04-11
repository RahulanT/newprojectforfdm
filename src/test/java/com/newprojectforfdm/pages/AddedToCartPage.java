package com.newprojectforfdm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.newprojectforfdm.global.utilities.BrowserUtilities;

public class AddedToCartPage extends BrowserUtilities{
	

	@FindBy(xpath = "//p[text()='This item has been added to your cart.']")
	WebElement  AddedToCartMessage;
	
	public AddedToCartPage() {
		
		PageFactory.initElements(driver, this);
		
		
	}
	
	public String getAddedToCartMessage() {
		
		setExplicitWait(3);
		waitForVisibilityOf(AddedToCartMessage);
		return AddedToCartMessage.getText();
		
	}
}

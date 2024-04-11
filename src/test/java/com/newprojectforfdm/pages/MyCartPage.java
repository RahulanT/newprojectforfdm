package com.newprojectforfdm.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.newprojectforfdm.global.utilities.BrowserUtilities;

public class MyCartPage extends BrowserUtilities{
	
	 List<WebElement> productList;
	
	@FindBy(xpath = "//span[text()='Cart']") 
	WebElement cartIcon; 
	
	@FindBy(xpath = "//ul[@class='lineItems_2PRRQ']" )
	WebElement  MyCartList;
	
	@FindBy(xpath = "//div[@data-automation='remove-button']" )
	WebElement  RemoveItem;
	
	@FindBy(xpath ="//div[@class = 'successMessage_1FVBy']")
	WebElement CartSuccessMessage;
	
	@FindBy(xpath ="//div[@class = 'successMessage_1FVBy']//div[contains(text() ,'has been removed from your cart' )]")
	WebElement removeFromCartSuccessMessage;
	
	public MyCartPage() {

		PageFactory.initElements(driver, this);
		
	}
	
	public void navigateToMyCart() {
		setExplicitWait(3);
		waitForVisibilityOf(cartIcon);
		cartIcon.click();
	}
	
	public void removeProductFromCart(int itemOnList) {
		setExplicitWait(3);
		waitForVisibilityOf(driver.findElement(By.xpath("//ul[@class='lineItems_2PRRQ']/li[" + itemOnList + "]//button[@data-automation='remove-button']")));
		driver.findElement(By.xpath("//ul[@class='lineItems_2PRRQ']/li[" + itemOnList + "]//button[@data-automation='remove-button']")).click();
		
	}
	public String removeProductFromCartMessage() {
		setExplicitWait(3);
		waitForVisibilityOf(removeFromCartSuccessMessage);
		return removeFromCartSuccessMessage.getText();
	}
	
	public int numberOfItemsInCart () {
		setExplicitWait(3);
		waitForVisibilityOf(MyCartList);
		productList = MyCartList.findElements(By.xpath("//div[contains (@class ,'lineItemContainer_1T6ea scroll-target-')]")); 

		return productList.size();
	}
	
	
}

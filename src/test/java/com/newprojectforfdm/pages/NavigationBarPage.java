package com.newprojectforfdm.pages;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.newprojectforfdm.global.utilities.BrowserUtilities;

public class NavigationBarPage extends BrowserUtilities{
	
	Select objSelect ;
	Actions act;

	public NavigationBarPage() {
		
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath = "//li[@data-automation='shop']")
	WebElement  ShopLink;
	
	@FindBy(xpath = "//div[@class='rootMenu_1l1Ix']")
	WebElement rootMenuItem;
	
	
	@FindBy(xpath = "//li[@data-automation='shop']//div[contains(@class , 'menuActive')]")
	WebElement ExpandedShopMenu;
	
	//@FindBy(xpath = "//h2[contains(@class , categoryTitle)]/span[text()=(@class , )]")
	
	public void clickShopLink() {
		

			ShopLink.click();
	}	
	
	

	public boolean expandedMenuVisible() {
		
		return ExpandedShopMenu.isDisplayed();
	}
	
	public void selectShopByCategory(String category) {
		
		driver.findElement(By.xpath("//a[@title='"+ category +"']")).click();
	} 
	
	public boolean subMenuIsVisible(String category) {
		
		return driver.findElement(By.xpath("//h2[contains(@class , 'categoryTitle')]/span[text()='" + category + "']")).isDisplayed();
		
	}
	
	public void selectRootMenuItem(String MenuItem) {
		
		driver.findElement(By.xpath("//div[@class='rootMenu_1l1Ix']//span[text()='"+MenuItem+"']")).click();
	}
	
	public boolean rootMenuItemIsVisible(String MenuItem) {
		
		return driver.findElement(By.xpath("//div[@class='rootMenu_1l1Ix']//li[@class = 'rootMenuItem_Qh9am isVisible']//span[text()='"+MenuItem+"']")).isDisplayed();
	}
}

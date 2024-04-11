package com.newprojectforfdm.pages;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.newprojectforfdm.global.utilities.BrowserUtilities;

public class SearchBarPage  extends BrowserUtilities{
	//public WebDriver sdriver;

	Actions act;

	public SearchBarPage() {

		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath = "//input[@type='search' and @name='search']")
	WebElement  SearchInputField;
	
	@FindBy(xpath = "//button[@type='submit' and contains(@class ,'searchButton')]")
	WebElement  SearchButton;
	
	@FindBy(xpath = "//div[@class = 'autocompleteList_2Pq-x productPreview_1mFGU']")
	WebElement AutoCompleteList;
	
	public void typeInSeachBar(String userInput ) {
		SearchInputField.sendKeys(userInput);
	}
	
	public void enterInSearchBar(String userInput) {
		
		SearchInputField.sendKeys(userInput);
		
		SearchButton.click();
//		try {
//			SearchButton.click();
//			Thread.sleep(8000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} 
		
	}
	
	public boolean autoCompleteListIsVisible() {
		return AutoCompleteList.isDisplayed();
	}
	
	public String selectFromAutoCompleteList(int listElement) {
		
		String hrefpath = driver.findElement(By.xpath("//div[@class = 'autocompleteList_2Pq-x productPreview_1mFGU']//div[@class = 'productPreviewContent_3gWpo']//ul//li[" + Integer.toString(listElement) + "]/div/a")).getAttribute("href");
		driver.findElement(By.xpath("//div[@class = 'autocompleteList_2Pq-x productPreview_1mFGU']//div[@class = 'productPreviewContent_3gWpo']//ul//li[" + Integer.toString(listElement) + "]")).click();
		
		return hrefpath;
	}
	
	
}

package com.newprojectforfdm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.newprojectforfdm.global.utilities.BrowserUtilities;

public class FrontCountrySelectionPage extends BrowserUtilities{
	

	WebDriverWait wait ;
	
	Actions act = new Actions(driver);

	public FrontCountrySelectionPage() {
		
		PageFactory.initElements(driver, this);
		
		
	}

	@FindBy(xpath = "//a[@class='canada-link']")
	WebElement  CanadaStoreLink;
	
	public void clickCanadaStoreLink() {
		

		//waitForVisibilityOfElementLocated(CanadaStoreLink);
//		setExplicitWait(3);
//		waitForVisibilityOf(CanadaStoreLink);
//		CanadaStoreLink.click();
//		CanadaStoreLink.click();
	try {
//			Thread.sleep(2);
			CanadaStoreLink.click();
			CanadaStoreLink.click();

			//act.doubleClick(CanadaStoreLink).perform();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
}

package com.newprojectforfdm.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.newprojectforfdm.global.utilities.BrowserUtilities;

public class SearchResultsPage extends BrowserUtilities{
//	public WebDriver sdriver;

	Actions act = new Actions(driver);


	public SearchResultsPage() {

		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath = "//h1[contains(text() , 'Results for:')]")
	WebElement  SearchResultsHeader;
	
	//Fitler-Sort Section
	@FindBy(xpath = "//select[@id = 'Sort']")
	WebElement SortDropDown;
	
	@FindBy(xpath = "//div[contains(@class , 'facetsContainer')]")
	WebElement FilterContainer;
	
	@FindBy(xpath = "//span[text()='Screen Size']")
	WebElement ScreenSizeFilter;
	
	@FindBy(xpath = "//span[text()='12 Inches and Smaller']")
	WebElement ScreenSizeOption;
	
	@FindBy(xpath = "//div[contains(@class , 'searchResultHeader')]//span[contains(text() , 'results')]")
	WebElement resultsHeader;

	@FindBy(xpath = "//li[@class = 'clearAll_1WS6s']")
	WebElement clearfilterButton;
	
	
	@FindBy(xpath = "//ul[@class = 'container_1lbbF']")
	WebElement activeFilterList;
	
	public void filterResults() {
				
		ScreenSizeFilter.click();
		ScreenSizeOption.click();
	}
	
	public String getSearchResultTitle() {
		
		return SearchResultsHeader.getText();
		
	}
	public void sortResults(String sortBy) {
		
		Select drpCountry = new Select(SortDropDown);
		
		drpCountry.selectByVisibleText(sortBy);

	}
	public String getNumberOfResults() {
		
		return resultsHeader.getText();
	}
	
	public String setFilterData(String filterName , String filterValue ) {
		
//		driver.findElement(By.xpath("//div[@class = 'facetsContainer_2DDqq']//span[text()= '" + filterName + "']")).click();
//		//Thread.sleep(3000);
//		driver.findElement(By.xpath("//div[@class = 'body_maqiI down_1fxZR open_2zRYc']//li//span[@class = 'productName_3Ikre' and text()='"+ filterValue +"']")).click();
//		
	      Actions a = new Actions(driver);
		
		
		WebElement f1 = driver.findElement(By.xpath("//div[@class = 'facetsContainer_2DDqq']//span[text()= '" + filterName + "']"));
		//Thread.sleep(3000);
//		WebElement f2 = driver.findElement(By.xpath("//div[@class = 'body_maqiI down_1fxZR open_2zRYc']//li//span[@class = 'productName_3Ikre' and text()='"+ filterValue +"']"));
      a.moveToElement(f1);
      a.perform();
      f1.click();
      WebElement f2 = driver.findElement(By.xpath("//div[@class = 'body_maqiI down_1fxZR open_2zRYc']//li//span[@class = 'productName_3Ikre' and text()='"+ filterValue +"']"));

      a.moveToElement(f2);
      a.perform();
      f2.click();
//		f1.click();
//		f2.click();

		WebElement fV = driver.findElement(By.xpath("//li[@class = 'pill_2ra42' and text()='"+filterValue +"']"));
		
		setExplicitWait(5);
		waitForVisibilityOfElementLocated(By.xpath("//li[@class = 'pill_2ra42' and text()='"+filterValue +"']"));
		
		return driver.findElement(By.xpath("//li[@class = 'pill_2ra42' and text()='"+filterValue +"']")).getText();
		 
	}
	
//	//working
//	public void setFilterData(String filterName , String filterValue ) {
//		
//		try {
//			
//			driver.findElement(By.xpath("//div[@class = 'facetsContainer_2DDqq']//span[text()= '" + filterName + "']")).click();
//			//Thread.sleep(3000);
//			driver.findElement(By.xpath("//div[@class = 'body_maqiI down_1fxZR open_2zRYc']//li//span[@class = 'productName_3Ikre' and text()='"+ filterValue +"']")).click();
//			Thread.sleep(3000);
//			
//		}
//		catch(Exception e){
//			e.printStackTrace();
//		}
//		
//		(By.xpath("//li[@class = 'pill_2ra42']")
//
//		 
//	}
	
	
	
	
	
	public int numberOfActiveFilters () {
		List <WebElement> activeFiltersList ;

		activeFiltersList = activeFilterList.findElements(By.xpath("//li[@class = 'pill_2ra42']")); 

		return activeFiltersList.size() ;
		
	}
	
	public void clearFilters() {
		
		act.doubleClick(clearfilterButton).perform();

	}
}

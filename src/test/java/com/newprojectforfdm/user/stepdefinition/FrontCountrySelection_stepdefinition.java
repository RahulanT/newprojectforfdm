package com.newprojectforfdm.user.stepdefinition;
import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.newprojectforfdm.pages.FrontCountrySelectionPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.newprojectforfdm.stepdefinition.Hooks;
import com.newprojectforfdm.testData.DataFile;

public class FrontCountrySelection_stepdefinition {
	
	DataFile df = new DataFile();
	
	FrontCountrySelectionPage frontpage = new FrontCountrySelectionPage();
	
//	public WebDriver driver = getDriver();
//	public FrontCountrySelectionPage frontpage;
//	public WebDriverWait wait;
	
//	@Given("User Launch Chrome Browser")
//	public void user_launch_chrome_browser() {
////		System.setProperty("webdriver.chrome.driver" , System.getProperty("user.dir")+ "//Drivers/chromedriver.exe");
////		driver = new ChromeDriver();
//		frontpage = new FrontCountrySelectionPage(driver);
//		driver.manage().window().maximize();
//	}
	
	@Given("User navigates to BestBuy Canada")
	public void user_navigates_to_bestbuy_canada() {
		
		frontpage.driverGet(df.BestBuyCanadaSite);
//		frontpage.setExplicitWait(2);
//		frontpage.clickCanadaStoreLink();
	}
	
	@When("User opens URL {string}")
	public void user_opens_url(String url) {
	    
	    frontpage.driverGet(url);
	}

	@When("User clicks country as Canada")
	public void user_clicks_country_as_canada() {
		
		frontpage.clickCanadaStoreLink();
		
	}

	@Then("Page redirects to Canada store link")
	public void page_redirects_to_canada_store_link() {

		frontpage.setExplicitWait(2);
		assertEquals( df.BestBuyCanadaRedirectSite , frontpage.getCurrentURL() );


	}


}

package com.newprojectforfdm.user.stepdefinition;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import com.newprojectforfdm.pages.FrontCountrySelectionPage;
import com.newprojectforfdm.pages.SearchBarPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchBar_StepDefinition {

	public SearchBarPage searchbarpage = new SearchBarPage();
	
	String redirectHrefLink ="";
	
	@Then("User Enters {string} into Search Bar")
	public void user_enters_into_search_bar(String userinput) {
	  
		searchbarpage.enterInSearchBar( userinput);
		
	}
	
	@When("User Types {string} into Search Bar")
	public void user_types_into_search_bar(String string) {
	    searchbarpage.typeInSeachBar(string);
	    
	}

	@Then("Autocomplete Displays related Products")
	public void autocomplete_displays_related_products() {
		 assertTrue(searchbarpage.autoCompleteListIsVisible());
	}

	@Then("User Selects {string} Product from Preview List")
	public void user_selects_product_from_preview_list(String string) {
	    // Write code here that turns the phrase above into concrete actions
		redirectHrefLink = searchbarpage.selectFromAutoCompleteList(Integer.parseInt(string));
		
		
	}
	
	@Then("Page redirects to Product Link")
	public void page_redirects_to_product_link() {
	    System.out.println(redirectHrefLink);
	    System.out.println(searchbarpage.getCurrentURL());
	    
//		try {
//			
//			Thread.sleep(8300);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} 
		assertTrue( searchbarpage.getCurrentURL().contains( redirectHrefLink) );
		
	}
}

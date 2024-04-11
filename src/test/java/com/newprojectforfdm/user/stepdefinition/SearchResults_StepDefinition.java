package com.newprojectforfdm.user.stepdefinition;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import com.newprojectforfdm.pages.FrontCountrySelectionPage;
import com.newprojectforfdm.pages.SearchResultsPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchResults_StepDefinition{
	

	public SearchResultsPage searchresultspage = new SearchResultsPage();
	
	public String searchResultVar ;
	
	@Then("User is returned search results {string}")
	public void user_is_returned_search_results(String expectedTitle) {
		
		searchResultVar = searchresultspage.getNumberOfResults();
	    assertTrue(searchresultspage.getSearchResultTitle().contains(expectedTitle));
	}
	
	
//	@Then("User Selects Filters")
//	public void user_selects_filters() {
//		
//		searchresultspage.filterResults();
//		searchresultspage.sortResults();
//	}

	@Then("Page Reloads new List of Products")
	public void page_reloads_new_list_of_products() {
		System.out.println( searchResultVar + " " + searchresultspage.getNumberOfResults());
		assertFalse ( searchResultVar.equals(searchresultspage.getNumberOfResults()) );
	}
	
	@Then("User Sets Filter {string} to {string}")
	public void user_sets_filter_to(String string, String string2) {
		assertEquals ( string2 , searchresultspage.setFilterData(string , string2) );
	}
	
	@Then("User Sorts Results by {string}")
	public void user_sorts_results_by(String string) {
		searchresultspage.sortResults(string );
	}
	@Then("Clear Filters")
	public void clear_filters() {
		searchresultspage.clearFilters();
	}
	@Then("Sort Results by {string}")
	public void sort_results_by(String string) {
		searchresultspage.sortResults(string);
	}
	@Then("There should be {string} active filters")
	public void there_should_be_active_filters(String string) {
		
		assertEquals(Integer.parseInt(string) , searchresultspage.numberOfActiveFilters());

	}
}

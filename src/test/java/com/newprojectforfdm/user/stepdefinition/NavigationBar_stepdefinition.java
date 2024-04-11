package com.newprojectforfdm.user.stepdefinition;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.newprojectforfdm.pages.FrontCountrySelectionPage;
import com.newprojectforfdm.pages.NavigationBarPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NavigationBar_stepdefinition {
	

	public NavigationBarPage navbar = new NavigationBarPage();

	
	@Then("User clicks Shop from Navigation Bar")
	public void user_clicks_shop_from_navigation_bar() {
		
		navbar.clickShopLink();
	}
	
	@Then("Expanded Toolbar should appear")
	public void expanded_toolbar_should_appear() {
	    assertEquals(true ,navbar.expandedMenuVisible());
	}
	
	@When("User clicks {string} from Shop by Category")
	public void user_clicks_from_shop_by_category(String categoryName) {
	    
		navbar.selectShopByCategory(categoryName);
		
	}

	@Then("Another submenu called {string} should display")
	public void another_submenu_called_should_display(String categoryName) {
		assertEquals(true , navbar.subMenuIsVisible(categoryName));
	}
	
	@When("User clicks {string} from root menu bar")
	public void user_clicks_from_root_menu_bar(String rootItem) {
		
		navbar.selectRootMenuItem(rootItem);
		
	}

	@Then("Expanded {string} Menu should appear")
	public void expanded_menu_should_appear(String rootItem) {
	  
		navbar.rootMenuItemIsVisible(rootItem);
		
	}
	
	@When("User clicks ([^\"]*) from root menu bar")
	public void user_clicks_root_menu_option_from_root_menu_bar(String rootOption) {
		navbar.selectRootMenuItem(rootOption);

	}

	@When("User clicks ([^\"]*) from Shop by Category")
	public void user_clicks_category_option_from_shop_by_category(String categoryOption) {
		navbar.selectShopByCategory(categoryOption);
	}

	@Then("Another submenu called ([^\"]*) should display")
	public void another_submenu_called_category_should_display(String categoryName) {
		assertEquals(true , navbar.subMenuIsVisible(categoryName));

	}
}

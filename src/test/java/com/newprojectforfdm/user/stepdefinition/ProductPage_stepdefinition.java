package com.newprojectforfdm.user.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.newprojectforfdm.pages.AddedToCartPage;
import com.newprojectforfdm.pages.ProductPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProductPage_stepdefinition{
	
	public ProductPage productpage = new ProductPage();
	public AddedToCartPage addedtoCartpage = new AddedToCartPage();
	
	
	@When("Adds Current Product to Cart")
	public void adds_current_product_to_cart() {
	    
		productpage.addToCart();
		
	}

}

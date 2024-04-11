package com.newprojectforfdm.user.stepdefinition;

import static org.junit.Assert.assertEquals;

import com.newprojectforfdm.pages.AddedToCartPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddedToCart_stepdefinition {
	
	
	public AddedToCartPage addedtoCartpage = new AddedToCartPage();
	

	@Then("Recieve message item has been added to Cart")
	public void recieve_message_item_has_been_added_to_cart() {
		assertEquals("This item has been added to your cart." , addedtoCartpage.getAddedToCartMessage());
	}
}

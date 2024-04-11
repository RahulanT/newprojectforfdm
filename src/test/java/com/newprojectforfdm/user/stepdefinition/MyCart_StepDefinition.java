package com.newprojectforfdm.user.stepdefinition;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import com.newprojectforfdm.pages.FrontCountrySelectionPage;
import com.newprojectforfdm.pages.MyCartPage;
import com.newprojectforfdm.testData.DataFile;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import junit.framework.Assert;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.containsString;

public class MyCart_StepDefinition {
	
	DataFile df = new DataFile();
	
	MyCartPage mycartpage = new MyCartPage();

	
	@Given("User navigates to My Cart")
	public void user_navigates_to_my_cart() {
	    mycartpage.navigateToMyCart();
	}

	@Then("Cart should have {string} Items")
	public void cart_should_have_items(String string) {
		assertEquals ( Integer.parseInt(string) ,  mycartpage.numberOfItemsInCart());
	}

	@Given("User Removes Item {string} from Cart")
	public void user_removes_item_from_cart(String string) {
		mycartpage.removeProductFromCart(Integer.parseInt(string));
	}
	

	@Given("Recieve message item has been removed from Cart")
	public void recieve_message_item_has_been_removed_from_cart() {
		//assertContains( df.RemoveFromCartMessage,mycartpage.removeProductFromCartMessage());
		assertTrue(mycartpage.removeProductFromCartMessage().contains(df.RemoveFromCartMessage));

	}

}

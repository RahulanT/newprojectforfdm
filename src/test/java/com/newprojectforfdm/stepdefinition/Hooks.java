package com.newprojectforfdm.stepdefinition;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import com.newprojectforfdm.global.utilities.BrowserUtilities;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ResponseOptions;

public class Hooks extends BrowserUtilities {

	
	@Before
	public void setup() {
		driverUtilities = getInstance();
		driver = driverUtilities.getDriver();
		maximizeWindow();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	
	@After
	public void tearDown() {
		
//		driverUtilities.resetDriver();
//		restAssuredUtilities.resetUtilities();
	}
	
	@Given("User navigates to URL {string}")
	public void user_navigates_to_url(String string) {
		driverGet(string);
	}
}
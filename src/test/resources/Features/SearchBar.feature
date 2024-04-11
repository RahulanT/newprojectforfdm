Feature: Select from Navigation Bar

Scenario: Select Product from Autocomplete List
  Given User navigates to BestBuy Canada
	And User Types "mac" into Search Bar
	Then Autocomplete Displays related Products
	And User Selects "1" Product from Preview List 
	And Page redirects to Product Link
	
Scenario: Add Product from Autocomplete List to Cart
  Given User navigates to BestBuy Canada
	And User Types "mac" into Search Bar
	Then Autocomplete Displays related Products
	And User Selects "1" Product from Preview List 
	And Page redirects to Product Link
	And Adds Current Product to Cart
	And Recieve message item has been added to Cart
#	And User navigates to My Cart
	

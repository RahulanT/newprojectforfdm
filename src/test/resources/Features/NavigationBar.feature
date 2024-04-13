Feature: Select from Navigation Bar

Scenario Outline: Select option from Shop by Category
	Given User navigates to BestBuy Canada
	When User clicks "<rootOption>" from root menu bar
	And Expanded Toolbar should appear
	And User clicks "<categoryOption>" from Shop by Category
	Then Another submenu called "<categoryName>" should display
Examples:
	|rootOption|categoryOption|categoryName|
	|Shop|Appliances|Appliances|
	|Shop|Home Living|Home Living|

Scenario Outline: Select option from root menu bar
	Given User navigates to BestBuy Canada
	And User clicks "<rootMenuOption>" from root menu bar
	Then Expanded "<rootMenuOptionAppear>" Menu should appear
	
	Examples:
	|rootMenuOption|rootMenuOptionAppear|
	|Outlet|Outlet|

Scenario Outline: Select root menu and Category
	Given User navigates to BestBuy Canada
	And User clicks "<rootMenuOption>" from root menu bar
	Then Expanded "<rootMenuOptionAppear>" Menu should appear
	And User clicks "<categoryOption>" from Shop by Category
	Then Another submenu called "<categoryName>" should display
	Examples:
	|rootMenuOption|rootMenuOptionAppear|categoryOption|categoryName|
	|Shop|Shop|Home Living|Home Living|
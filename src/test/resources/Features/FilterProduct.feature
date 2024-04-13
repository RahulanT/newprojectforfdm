Feature: Filter Products from Products Page


Scenario: Filter and Sort Products from Search Results

	Given User navigates to URL "https://www.bestbuy.ca/en-ca/search?search=Windows+Laptop"
	And User Sets Filter "<FilterName1>" to "<FilterValue1>"
	And User Sets Filter "<FilterName2>" to "<FilterValue2>"
	And User Sets Filter "<FilterName3>" to "<FilterValue3>"
	Then There should be "3" active filters
	And Sort Results by "<SortResultsBy>"
	And Clear Filters
	Examples:
	|FilterName1|FilterValue1|FilterName2|FilterValue2|FilterName3|FilterValue3|SortResultsBy|
	|Screen Size|15 Inches|Processor Brand|Intel|RAM (GB)|8|Price Low-High|
#	|Screen Size|16 Inches|Processor Brand|AMD|RAM (GB)|16|Price High-Low|

#Scenario: Search Product and Filter Products
  #Given User navigates to BestBuy Canada
#	And User Enters "macbook" into Search Bar
#	And User Sets Filter "<FilterName1>" to "<FilterValue1>"
#	And User Sets Filter "<FilterName2>" to "<FilterValue2>"
#	Then There should be "2" active filters
#	Examples:
#	|FilterName1|FilterValue1|FilterName2|FilterValue2|
#	|Screen Size|15 Inches|Processor Brand|Intel|
#
#Scenario: Search TV Product and Filter Products
  #Given User navigates to BestBuy Canada
#	And User Enters "SONY TV" into Search Bar
#	And User Sets Filter "<FilterName1>" to "<FilterValue1>"
#	And User Sets Filter "<FilterName2>" to "<FilterValue2>"
#	Then There should be "2" active filters
#	Examples:
#	|FilterName1|FilterValue1|FilterName2|FilterValue2|
#	|Shop by Size|70 Inches & up|Refresh Rate (Hz)|120 Hz|
Feature: Add Product to Cart

Scenario: Add Product to Cart
	Given User navigates to URL "https://www.bestbuy.ca/en-ca/product/sony-x85k-65-4k-uhd-hdr-led-smart-google-tv-kd65x85k/16064796?source=search&adSlot=1"
	And Adds Current Product to Cart
	And Recieve message item has been added to Cart
	And User navigates to My Cart
	Then Cart should have "1" Items
	
Scenario: Add Two Items to Cart
	Given User navigates to URL "https://www.bestbuy.ca/en-ca/product/sony-x85k-65-4k-uhd-hdr-led-smart-google-tv-kd65x85k/16064796?source=search&adSlot=1"
	And Adds Current Product to Cart
	And Recieve message item has been added to Cart
	And User navigates to URL "https://www.bestbuy.ca/en-ca/product/acer-cb317-17-3-chromebook-silver-intel-celeron-n4500-128gb-emmc-8gb-ram-chrome-os/16250531?source=product&adSlot=2"
	And Adds Current Product to Cart
	And Recieve message item has been added to Cart
	And User navigates to My Cart
	Then Cart should have "2" Items
	
#Scenario: Add Two Items to Cart and Remove One Item from Cart
#	Given User navigates to URL "https://www.bestbuy.ca/en-ca/product/sony-x85k-65-4k-uhd-hdr-led-smart-google-tv-kd65x85k/16064796?source=search&adSlot=1"
#	And Adds Current Product to Cart
#	And Recieve message item has been added to Cart
#	And User navigates to URL "https://www.bestbuy.ca/en-ca/product/acer-cb317-17-3-chromebook-silver-intel-celeron-n4500-128gb-emmc-8gb-ram-chrome-os/16250531?source=product&adSlot=2"
#	And Adds Current Product to Cart
#	And Recieve message item has been added to Cart
#	And User navigates to My Cart
#	And User Removes Item "1" from Cart
#	And Recieve message item has been removed from Cart
#	Then Cart should have "1" Items
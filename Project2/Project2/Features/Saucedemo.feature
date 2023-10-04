Feature: Saucedemo

Scenario: Login with walid credentials
	Given user is on login page URL "https://www.saucedemo.com/"
	When user enters the username as "standard_user"
	And user enters the password as "secret_sauce"
	And user clicks on login button
	Then user is on the home page URL "https://www.saucedemo.com/inventory.html"
	#Filter
	When user clicks on filter button 
	And user select price(low to high) option
	When user clicks on filter button
	And user select name(Z to A) option
	When user clicks on filter button
	And user select price(high to low) option
#SideMenuBar
	When user click on side menu bar
	And user select all items
	Then user is on inventory page URL "https://www.saucedemo.com/inventory.html"
	When user select Reset App State 
	Then user is on inventory page URL "https://www.saucedemo.com/inventory.html"
	
	Then user is on the home page URL "https://www.saucedemo.com/inventory.html"
	When user select on About 
	Then user is on about page URL "https://saucelabs.com/"
#Logout
	#When user is on inventory page URL "https://www.saucedemo.com/inventory.html"
	#And user select Logout
	#Then user is on Login page URL "https://www.saucedemo.com/"
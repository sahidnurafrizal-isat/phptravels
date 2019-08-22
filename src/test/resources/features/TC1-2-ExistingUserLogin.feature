#Author: sahid.nurafrizal@inmarsat.com

@TestAll
@P2Tests

Feature: Existing User Login
	User should be able to traverse to login page from home page
	
	Background: Open PHP Travels.net homepage on Chrome
		Given User was on the homepage
		And User entered the "Login page" from the Homepage
	
	Scenario: Login with valid login ID
		When User fills in below data on Login page:
			| Field    | Value              | 
      | Email    | krokov1@outlook.com | 
      | Password | London2018         | 
		And User clicks on "Login" button on Login Page
		Then User should be on "My Account" page
		And  User should see "Hi, Vanya Krokov" on heading of My Account page
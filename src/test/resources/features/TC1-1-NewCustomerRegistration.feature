#Author: sahid.nurafrizal@inmarsat.com

@TestAll
@P1Tests

Feature: New Customer Registration
	User should be able to traverse to registration page from home page

	Background: Open PHP Travels.net homepage on Chrome
		Given User was on the homepage
		And User entered the "User Registration page" from the Homepage
	
	Scenario: Sign up using correct data
		When User fills in with below data on Registration page:
		  | Field            | Value             | 
      | First Name       | Vanya             | 
      | Last Name        | Krokov            | 
      | Mobile Number    | +627785706034     | 
      | Email            | krokov1@outlook.com | 
      | Password         | London2018        | 
      | Confirm Password | London2018        | 
		And User click on "Sign Up" button on Registration page
		Then User should be on "My Account" page
		And User should see "Hi, Vanya Krokov" on heading of My Account page
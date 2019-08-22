#Author: sahid.nurafrizal@inmarsat.com

@TestAll
@P1Test

Feature: Hotel Booking (Search)
  User can book the hotel as guest user or as registered user

	Background: Open PHP Travels.net homepage on Chrome
		Given User was on the homepage
		
  	Scenario: All inputs are correct with typing
  		When User clicks on "Hotels Tab" button on Homepage
  		And User fills in "City/Hotel Name" with "Delhi" on Homepage
  		And User clicks on "1" choice from the "City/Hotel Name" dropdown on Homepage
  		And User fills in the "Hotel" search with below data:
  		| Field | Value |
  		| Check In | 15/08/2019 |
  		| Check Out | 17/08/2019 |
  		| Adult Count | 3 |
  		| Child Count | 1 |
  		And User clicks on "City/Hotel Search" button on Homepage
  		Then User should see "Result list" on Result page
  		And All hotels search result should be from "New Delhi"

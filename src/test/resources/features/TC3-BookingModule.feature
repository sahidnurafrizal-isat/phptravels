#Author: sahid.nurafrizal@inmarsat.com

@TestAll
@P1Test
@Ignore
Feature: Booking Module - Hotel
  Test booking module working or not
  	
  	Background: Traverse to booking module
  		Given User was on the homepage
			And User clicks on "Hotels Tab" button on Homepage
  		And User fills in "City/Hotel Name" with "Jakarta" on Homepage
  		And User clicks on "0" choice from the "City/Hotel Name" dropdown on Homepage
  		And User fills in the "Hotel" search with below data:
  		| Field | Value |
  		| Check In | 15/08/2019 |
  		| Check Out | 17/08/2019 |
  		| Adult Count | 3 |
  		| Child Count | 1 |
  		And User clicks on "City/Hotel Search" button on Homepage
  		And User clicks on "1" selection from result list on Result page
  		#And User should see "Holiday Inn Express Jakarta Pluit Citygate" on the page header of Hotel Details page
  
    Scenario: Book a hotel with valid values
  		When User clicks on "Book now" button on Hotel Details page for "1" selection
  		Then I should see "BOOKING INFORMATION" on Booking Information page
  		And I should see "BOOKING SUMMARY" on Booking Information page
  		And I should see "Holiday Inn Express Jakarta Pluit Citygate" on "Booking Summary Hotel Name" on Booking Information page
  		And I should see "2019-08-15" on "Booking Summary Check In Date" on Booking Information page
  		And I should see "2019-08-17" on "Booking Summary Check Out Date" on Booking Information page
  		And I should see "2" on "Booking Summary Number of Nights" on Booking Information page
  		And I should see "1" on "Booking Summary Number of Rooms" on Booking Information page
  		
  		When I click on "Guest Booking" button on Booking Information page
  		And I fill in "First Name" with "Popo" on Booking Information page
  		And I fill in "Last Name" with "Pipi" on Booking Information page
  		And I fill in "Email" with "popipopi@popo.com" on Booking Information page
  		And I fill in "Phone" with "9876545522" on Booking Information page
  		And I fill in "Card Holder Name" with "Hannah Nelson" on Booking Information page
  		And I fill in "Card Number" with "4169408988709774" on Booking Information page
  		And I select "06" in "Month CC Exp Date" on Booking Information page
  		And I select "2022" in "Year CC Exp Date" on Booking Information page
  		And I fill in "Security Code" with "366" on Booking Information page
  		And I click on "Complete Booking" button on Booking Information page
  		Then I should not see any error messages
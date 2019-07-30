#Author: sahid.nurafrizal@inmarsat.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@PrimaryTest
Feature: Hotel Booking (Search)
  User can book the hotel as guest user or as registered user

	Background: Open PHP Travels.net homepage on Chrome
		Given I am on the page on URL "https://www.phptravels.net/"
		Then I should see "PHPTRAVELS | Travel Technology Partner" on title
		
  	Scenario: All inputs are correct with typing
  		When I click on "Hotels Tab" button on Homepage
  		And I click on "City/Hotel Name" button on Homepage
  		And I fill in "City/Hotel Name" with "Delhi" on Homepage
  		And I click on "1" choice from the "City/Hotel Name" dropdown on Homepage
  		And I fill in "Check In" with "15/08/2019" on Homepage
  		And I fill in "Check Out" with "17/08/2019" on Homepage
  		And I click on "Guest Details" button on Homepage
  		And I fill in "Guest Adult Count" with "3" on Homepage
  		And I fill in "Guest Child Count" with "2" on Homepage
  		And I click on "Search" button on Homepage
  #		Then I should see "Search Result" on title

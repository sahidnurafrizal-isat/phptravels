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
@P1Tests
Feature: New Customer Registration
	User should be able to traverse to registration page from home page

	Background: Open PHP Travels.net homepage on Chrome
		Given I am on the page on URL "https://www.phptravels.net/"
		Then I should see "PHPTRAVELS | Travel Technology Partner" on title
	
	Scenario: Traverse to sign up menu and do registration
		When I click on "My Account" button on Homepage
		And I click on "Sign Up" button on Homepage
		Then I should see "Register" on title
		When I fill in "First Name" with "Vanya" on Registration page
		And I fill in "Last Name" with "Krokov" on Registration page
		And I fill in "Mobile Number" with "+627785706034" on Registration page
		And I fill in "Email" with "vanya@outlook.com" on Registration page
		And I fill in "Password" with "London2018" on Registration page
		And I fill in "Confirm Password" with "London2018" on Registration page
		And I click on "Sign Up" button on Registration page
		Then I should see "My Account" on title
		And  I should see "Hi, Vanya Krokov" on heading of My Account page
@TestCase01
Feature: New Customer Registration
	User should be able to traverse to registration page from home page

Background: Open PHP Travels.net homepage on Chrome
	Given I am on the page on URL "https://www.phptravels.net/"
	Then I should see "PHPTRAVELS | Travel Technology Partner" on title

Scenario: Traverse to sign up menu and do registration
	When I click on "My Account" button on Homepage
	And I click on "Sign Up" button on Homepage
	Then I should see "Register" on title
	When I fill in "First Name" with "Vanya"
	And I fill in "Last Name" with "Krokov"
	And I fill in "Mobile Number" with "+627785706034"
	And I fill in "Email" with "vanya@outlook.com"
	And I fill in "Password" with "London2018"
	And I fill in "Confirm Password" with "London2018"
	And I click on "Sign Up" button on Registration page
	Then I should see "My Account" on title
	And  I should see "Hi, Vanya Krokov" on heading of My Account page
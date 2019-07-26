$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("P1-NewCustomerRegistration.feature");
formatter.feature({
  "line": 2,
  "name": "New Customer Registration",
  "description": "User should be able to traverse to registration page from home page",
  "id": "new-customer-registration",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@TestCase01"
    }
  ]
});
formatter.before({
  "duration": 20278942695,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "Open PHP Travels.net homepage on Chrome",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "I am on the page on URL \"https://www.phptravels.net/\"",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I should see \"PHPTRAVELS | Travel Technology Partner\" on title",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.phptravels.net/",
      "offset": 25
    }
  ],
  "location": "HomePageStepDefs.i_am_on_the_page_on_URL(String)"
});
formatter.result({
  "duration": 4890034023,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "PHPTRAVELS | Travel Technology Partner",
      "offset": 14
    }
  ],
  "location": "HomePageStepDefs.i_should_see_on_title(String)"
});
formatter.result({
  "duration": 11623401,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "Traverse to sign up menu and do registration",
  "description": "",
  "id": "new-customer-registration;traverse-to-sign-up-menu-and-do-registration",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 10,
  "name": "I click on \"My Account\" button on Homepage",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "I click on \"Sign Up\" button on Homepage",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I should see \"Register\" on title",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "I fill in \"First Name\" with \"Vanya\"",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "I fill in \"Last Name\" with \"Krokov\"",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I fill in \"Mobile Number\" with \"+627785706034\"",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I fill in \"Email\" with \"vanya@outlook.com\"",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I fill in \"Password\" with \"London2018\"",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I fill in \"Confirm Password\" with \"London2018\"",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "I click on \"Sign Up\" button on Registration page",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "I should see \"My Account\" on title",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "I should see \"Hi, Vanya Krokov\" on heading of My Account page",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "My Account",
      "offset": 12
    }
  ],
  "location": "HomePageStepDefs.click_on_button_on_homepage(String)"
});
formatter.result({
  "duration": 296503388,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Sign Up",
      "offset": 12
    }
  ],
  "location": "HomePageStepDefs.click_on_button_on_homepage(String)"
});
formatter.result({
  "duration": 2756921334,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Register",
      "offset": 14
    }
  ],
  "location": "HomePageStepDefs.i_should_see_on_title(String)"
});
formatter.result({
  "duration": 4860059,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "First Name",
      "offset": 11
    },
    {
      "val": "Vanya",
      "offset": 29
    }
  ],
  "location": "UserRegistrationPageStepDefs.i_fill_in_with(String,String)"
});
formatter.result({
  "duration": 314807686,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Last Name",
      "offset": 11
    },
    {
      "val": "Krokov",
      "offset": 28
    }
  ],
  "location": "UserRegistrationPageStepDefs.i_fill_in_with(String,String)"
});
formatter.result({
  "duration": 94359893,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Mobile Number",
      "offset": 11
    },
    {
      "val": "+627785706034",
      "offset": 32
    }
  ],
  "location": "UserRegistrationPageStepDefs.i_fill_in_with(String,String)"
});
formatter.result({
  "duration": 147849736,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Email",
      "offset": 11
    },
    {
      "val": "vanya@outlook.com",
      "offset": 24
    }
  ],
  "location": "UserRegistrationPageStepDefs.i_fill_in_with(String,String)"
});
formatter.result({
  "duration": 238191660,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Password",
      "offset": 11
    },
    {
      "val": "London2018",
      "offset": 27
    }
  ],
  "location": "UserRegistrationPageStepDefs.i_fill_in_with(String,String)"
});
formatter.result({
  "duration": 166959553,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Confirm Password",
      "offset": 11
    },
    {
      "val": "London2018",
      "offset": 35
    }
  ],
  "location": "UserRegistrationPageStepDefs.i_fill_in_with(String,String)"
});
formatter.result({
  "duration": 138047173,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Sign Up",
      "offset": 12
    }
  ],
  "location": "UserRegistrationPageStepDefs.click_on_button_on_registration_page(String)"
});
formatter.result({
  "duration": 167503302,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "My Account",
      "offset": 14
    }
  ],
  "location": "HomePageStepDefs.i_should_see_on_title(String)"
});
formatter.result({
  "duration": 5472732662,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Hi, Vanya Krokov",
      "offset": 14
    }
  ],
  "location": "MyAccountPageStepDefs.i_should_see_on_heading_of_my_account_page(String)"
});
formatter.result({
  "duration": 71979882,
  "status": "passed"
});
formatter.after({
  "duration": 1223330144,
  "status": "passed"
});
});
$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("P1-HotelBookingSearch.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: sahid.nurafrizal@inmarsat.com"
    },
    {
      "line": 2,
      "value": "#Keywords Summary :"
    },
    {
      "line": 3,
      "value": "#Feature: List of scenarios."
    },
    {
      "line": 4,
      "value": "#Scenario: Business rule through list of steps with arguments."
    },
    {
      "line": 5,
      "value": "#Given: Some precondition step"
    },
    {
      "line": 6,
      "value": "#When: Some key actions"
    },
    {
      "line": 7,
      "value": "#Then: To observe outcomes or validation"
    },
    {
      "line": 8,
      "value": "#And,But: To enumerate more Given,When,Then steps"
    },
    {
      "line": 9,
      "value": "#Scenario Outline: List of steps for data-driven as an Examples and \u003cplaceholder\u003e"
    },
    {
      "line": 10,
      "value": "#Examples: Container for s table"
    },
    {
      "line": 11,
      "value": "#Background: List of steps run before each of the scenarios"
    },
    {
      "line": 12,
      "value": "#\"\"\" (Doc Strings)"
    },
    {
      "line": 13,
      "value": "#| (Data Tables)"
    },
    {
      "line": 14,
      "value": "#@ (Tags/Labels):To group Scenarios"
    },
    {
      "line": 15,
      "value": "#\u003c\u003e (placeholder)"
    },
    {
      "line": 16,
      "value": "#\"\""
    },
    {
      "line": 17,
      "value": "## (Comments)"
    },
    {
      "line": 18,
      "value": "#Sample Feature Definition Template"
    }
  ],
  "line": 20,
  "name": "Hotel Booking (Search)",
  "description": "User can book the hotel as guest user or as registered user",
  "id": "hotel-booking-(search)",
  "keyword": "Feature",
  "tags": [
    {
      "line": 19,
      "name": "@PrimaryTest"
    }
  ]
});
formatter.before({
  "duration": 3549826408,
  "status": "passed"
});
formatter.background({
  "line": 23,
  "name": "Open PHP Travels.net homepage on Chrome",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 24,
  "name": "I am on the page on URL \"https://www.phptravels.net/\"",
  "keyword": "Given "
});
formatter.step({
  "line": 25,
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
  "duration": 6460555089,
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
  "duration": 30914491,
  "status": "passed"
});
formatter.scenario({
  "line": 27,
  "name": "All inputs are correct with typing",
  "description": "",
  "id": "hotel-booking-(search);all-inputs-are-correct-with-typing",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 28,
  "name": "I click on \"Hotels Tab\" button on Homepage",
  "keyword": "When "
});
formatter.step({
  "line": 29,
  "name": "I click on \"City/Hotel Name\" button on Homepage",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "I fill in \"City/Hotel Name\" with \"Delhi\" on Homepage",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "I click on \"1\" choice from the \"City/Hotel Name\" dropdown on Homepage",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "I fill in \"Check In\" with \"15/08/2019\" on Homepage",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "I fill in \"Check Out\" with \"17/08/2019\" on Homepage",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "I click on \"Guest Details\" button on Homepage",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "I click on \"Adult +\" button on Homepage",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "I click on \"Child +\" button on Homepage",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "I click on \"City/Hotel Search\" button on Homepage",
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "I should see \"Result list\" on Result page",
  "keyword": "Then "
});
formatter.step({
  "line": 39,
  "name": "All hotels search result should be from \"New Delhi\"",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "Hotels Tab",
      "offset": 12
    }
  ],
  "location": "HomePageStepDefs.click_on_button_on_homepage(String)"
});
formatter.result({
  "duration": 341156159,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "City/Hotel Name",
      "offset": 12
    }
  ],
  "location": "HomePageStepDefs.click_on_button_on_homepage(String)"
});
formatter.result({
  "duration": 281646116,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "City/Hotel Name",
      "offset": 11
    },
    {
      "val": "Delhi",
      "offset": 34
    }
  ],
  "location": "HomePageStepDefs.i_fill_in_with_on_homepage(String,String)"
});
formatter.result({
  "duration": 387599110,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 12
    },
    {
      "val": "City/Hotel Name",
      "offset": 32
    }
  ],
  "location": "HomePageStepDefs.i_click_on_choice_from_the_dropdown_on_homepage(String,String)"
});
formatter.result({
  "duration": 4213440612,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Check In",
      "offset": 11
    },
    {
      "val": "15/08/2019",
      "offset": 27
    }
  ],
  "location": "HomePageStepDefs.i_fill_in_with_on_homepage(String,String)"
});
formatter.result({
  "duration": 201943431,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Check Out",
      "offset": 11
    },
    {
      "val": "17/08/2019",
      "offset": 28
    }
  ],
  "location": "HomePageStepDefs.i_fill_in_with_on_homepage(String,String)"
});
formatter.result({
  "duration": 146870458,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Guest Details",
      "offset": 12
    }
  ],
  "location": "HomePageStepDefs.click_on_button_on_homepage(String)"
});
formatter.result({
  "duration": 106881018,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Adult +",
      "offset": 12
    }
  ],
  "location": "HomePageStepDefs.click_on_button_on_homepage(String)"
});
formatter.result({
  "duration": 159569932,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Child +",
      "offset": 12
    }
  ],
  "location": "HomePageStepDefs.click_on_button_on_homepage(String)"
});
formatter.result({
  "duration": 151853179,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "City/Hotel Search",
      "offset": 12
    }
  ],
  "location": "HomePageStepDefs.click_on_button_on_homepage(String)"
});
formatter.result({
  "duration": 40851113421,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Result list",
      "offset": 14
    }
  ],
  "location": "ResultPageStepDefs.i_should_see_on_result_page(String)"
});
formatter.result({
  "duration": 36153518,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "New Delhi",
      "offset": 41
    }
  ],
  "location": "ResultPageStepDefs.all_hotels_search_result_should_be_from(String)"
});
formatter.result({
  "duration": 5076119219,
  "status": "passed"
});
formatter.after({
  "duration": 1402534441,
  "status": "passed"
});
});
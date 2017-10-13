$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("main/resources/Features/TestA.feature");
formatter.feature({
  "line": 1,
  "name": "Search Functionality",
  "description": "      \r\nUser should be a to search for any product\n\r\n     by using the search feature",
  "id": "search-functionality",
  "keyword": "Feature"
});
formatter.scenario({
  "comments": [
    {
      "line": 11,
      "value": "#@ignore"
    }
  ],
  "line": 15,
  "name": "Searching for Selenium book",
  "description": "",
  "id": "search-functionality;searching-for-selenium-book",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 13,
      "name": "@TestA"
    }
  ]
});
formatter.step({
  "line": 17,
  "name": "I am on Amazon Home Page on \"browser\"",
  "keyword": "Given "
});
formatter.step({
  "line": 19,
  "name": "I enter my search as \"Selenium Automation\"",
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "I click enter",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "I should be Presented with a search result page",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "browser",
      "offset": 29
    }
  ],
  "location": "StepDef.i_am_on_Amazon_Home_Page_on(String)"
});
formatter.result({
  "duration": 5837633025,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Selenium Automation",
      "offset": 22
    }
  ],
  "location": "StepDef.i_enter_my_search_as(String)"
});
formatter.result({
  "duration": 1021470607,
  "status": "passed"
});
formatter.match({
  "location": "StepDef.i_click_enter()"
});
formatter.result({
  "duration": 1196564587,
  "status": "passed"
});
formatter.match({
  "location": "StepDef.i_should_be_Presented_with_a_search_result_page()"
});
formatter.result({
  "duration": 872567983,
  "status": "passed"
});
formatter.after({
  "duration": 858307272,
  "status": "passed"
});
formatter.uri("main/resources/Features/TestB.feature");
formatter.feature({
  "line": 1,
  "name": "Add To Cart",
  "description": "      \r\nAS a user I should be able to add my good to cart",
  "id": "add-to-cart",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 10,
  "name": "Navigate to Selenium book page",
  "description": "",
  "id": "add-to-cart;navigate-to-selenium-book-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 9,
      "name": "@TestB"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": "I am the Search Return Result Page on \"browser\"",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "I click on Selenium Automation book link",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "I should navigate to Selenium book title Page",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "I should see the Price of the Book",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "I should see Add to Cart button",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "browser",
      "offset": 39
    }
  ],
  "location": "StepDef.i_am_the_Search_Return_Result_Page_on(String)"
});
formatter.result({
  "duration": 5621324933,
  "status": "passed"
});
formatter.match({
  "location": "StepDef.i_click_on_Selenium_Automation_book_link()"
});
formatter.result({
  "duration": 2335276819,
  "status": "passed"
});
formatter.match({
  "location": "StepDef.i_should_navigate_to_Selenium_book_title_Page()"
});
formatter.result({
  "duration": 151233011,
  "status": "passed"
});
formatter.match({
  "location": "StepDef.i_should_see_the_Price_of_the_Book()"
});
formatter.result({
  "duration": 52293552,
  "status": "passed"
});
formatter.match({
  "location": "StepDef.i_should_see_Add_to_Cart_button()"
});
formatter.result({
  "duration": 1020564239,
  "status": "passed"
});
formatter.after({
  "duration": 781809575,
  "status": "passed"
});
formatter.scenario({
  "line": 26,
  "name": "Add To cart",
  "description": "",
  "id": "add-to-cart;add-to-cart",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 25,
      "name": "@TestB"
    }
  ]
});
formatter.step({
  "line": 27,
  "name": "I am on the Selenium tile Page on \"browser\"",
  "keyword": "Given "
});
formatter.step({
  "line": 29,
  "name": "I check my Trolley basket",
  "keyword": "When "
});
formatter.step({
  "line": 31,
  "name": "I click on Add To Cart button",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "I should see my Selenium book added to cart",
  "keyword": "Then "
});
formatter.step({
  "line": 35,
  "name": "I should see my Trolleybasket with one Added Selenium book",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "browser",
      "offset": 35
    }
  ],
  "location": "StepDef.i_am_on_the_Selenium_tile_Page(String)"
});
formatter.result({
  "duration": 5713191446,
  "status": "passed"
});
formatter.match({
  "location": "StepDef.i_check_my_Trolley_basket()"
});
formatter.result({
  "duration": 998534288,
  "status": "passed"
});
formatter.match({
  "location": "StepDef.i_click_on_Add_To_Cart_button()"
});
formatter.result({
  "duration": 1252745646,
  "status": "passed"
});
formatter.match({
  "location": "StepDef.i_should_see_my_Selenium_book_added_to_cart()"
});
formatter.result({
  "duration": 68354492,
  "status": "passed"
});
formatter.match({
  "location": "StepDef.i_should_see_my_Trolleybasket_with_one_Added_Selenium_book()"
});
formatter.result({
  "duration": 50866326,
  "status": "passed"
});
formatter.after({
  "duration": 787647730,
  "status": "passed"
});
});
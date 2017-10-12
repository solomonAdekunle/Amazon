Feature: Search Functionality
         User should be a to search for any product
         by using the search feature
         

#@ignore        
@Search      
 Scenario: Searching for Selenium book
 Given I am on Amazon Home Page on "browser"
 When  I enter my search as "Selenium Automation"
  And  I click enter
  Then I should be Presented with a search result page
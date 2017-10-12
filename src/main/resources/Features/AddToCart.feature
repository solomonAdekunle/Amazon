Feature: Add To Cart
        AS a user I should be able to add my good to cart
        
        
        
Scenario: Navigate to Selenium book page
Given I am the Search Return Result Page on "browser"
When I click on Selenium Automation book link
Then I should navigate to Selenium book title Page
 And I should see the Price of the Book
 And I should see Add to Cart button
 
 
Scenario: Add To cart
Given I am on the Selenium tile Page on "browser"
When  I check my Trolley basket
 And  I click on Add To Cart button
Then  I should see my Selenium book added to cart
 And  I should see my Trolleybasket with one Added Selenium book
  
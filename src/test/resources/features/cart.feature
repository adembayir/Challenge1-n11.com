
Feature: User should be able to add product to the cart


  Scenario: As a user, I should be able to add any available product in my cart.
    Given I am on the main page
    When I make a search for "iphone"
    And I add first product in my cart.
    Then Product should be added in my cart.
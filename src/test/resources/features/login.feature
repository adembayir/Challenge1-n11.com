Feature: User should be able to login

  @wip
  Scenario: As a user, I should be able login
    Given I am on the main page
    Then I click on login button
    And I enter valid credentials
    And I click on Giriş Yap button
    Then I should be logged in
Feature: Registering of existing user
  Scenario: Verify that existing user could create an additional account
    Given the user is on the 'authentication' page
    When he enters his valid email 'jeka@gmail.com'
    And press Create an account button
    Then appears an allert massage with the text 'An account using this email address has already been registered'
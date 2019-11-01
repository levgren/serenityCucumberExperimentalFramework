Feature: user subscription
  Scenario: verify user subscription works as expected
    Given the user is on the automationpractice page
    When user enters his email 'kekas@gmail.com' in email field
    And user press submitNewsletter button
    Then user should see message 'Newsletter : You have successfully subscribed to this newsletter.'
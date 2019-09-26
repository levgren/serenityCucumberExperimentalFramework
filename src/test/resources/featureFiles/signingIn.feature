Feature: Signing in the existing user using valid email and password
  Scenario: Verify that user is able to sign in using valid data
    Given the user is on the 'authentication' page
    When user enters valid email 'jekson@gmail.com'
    And user enters valid password 'ACE-250'
    And press sign in button
    Then opens a 'my-account' page


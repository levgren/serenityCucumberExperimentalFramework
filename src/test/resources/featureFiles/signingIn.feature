Feature: Signing in the existing user using valid email and password

  Scenario Outline: Verify that user is able to sign in using valid data
    Given the user is on the 'authentication' page
    When user enters valid email <login>
    And user enters valid password <password>
    And press sign in button
    Then opens a 'my-account' page

    Examples:
      | login | password |
      |jekson@gmail.com| ACE-250 |
      |badlogin        | ACE_250 |
      |jekson@gmail.com|badpassword|
      |badlogin        |badpassword|

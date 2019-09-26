Feature: Opening registration page

  Scenario: Verify that the user is able to register
    Given the user is on the automationpractice page
    When he clicks Sign in button
    Then appears page 'authentication'
    When the user enters 'roma_empire@gmail.com' in the Email address input
    And press 'Create an account' button
    Then the registration form opens on the page 'Create an account'
    Given the user is on the registration page
    When he enters a valid first name 'Septimious'
    And enters a valid last name 'Severus'
    And enters a valid email 'roman_empire@gmail.com'
    And enters a password 'ACE-250'
    And enters in the address section a name 'Septimious'
    And enters in the address section a surname 'Severus'
    And enters in the address section an address 'Cherniakhivska street'
    And chose from the dropdown a country 'United States'
    And enters in the address section a city 'Bohonyky'
    And enters postal code '01021'
    And chose from the dropdown a state 'Alaska'
    And enters mobile phone '103'
    And enters alias address 'address'
    And press Register button
    Then opens a 'my-account' page
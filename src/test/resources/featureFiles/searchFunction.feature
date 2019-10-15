Feature: Search function

  Scenario: Verify that search function works correctly
    Given the user is on the 'authentication' page
    When user fill in search_query with 'summer dress'
    And user press submit_search
    Then user should see Search results page for 'summer dress'
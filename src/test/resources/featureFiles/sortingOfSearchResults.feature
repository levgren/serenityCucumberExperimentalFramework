Feature: Checking the order of search results

  Scenario: Verify that search results are displayed in correct order
    Given the user is on the 'authentication' page
    When user fill in search_query with 'black'
    And user press submit_search
    When user selects 'name:asc' from selectProductSort
    Then user should see results sorted in ascending order
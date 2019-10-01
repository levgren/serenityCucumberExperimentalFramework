Feature: The pages with correct categories opens

  Scenario Outline: Verify that category will opens according to the users actions
    Given the user is on the automationpractice page
    When when user press button 'Dresses'
    Then opens a 'category' page
    When user press on <subcategory>
    Then opens page with <subcategory>

    Examples:
      | subcategory     |
      | Casual Dresses  |
      | Summer Dresses  |
      | Evening Dresses |
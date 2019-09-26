Feature: Adding a product to the cart

  Scenario: Verify possibility to ad any product to the cart
    Given the user is on the automationpractice page
    When user select any product
      | Printed Dress |
      | Blouse        |
      | Printed Summer Dress |
      | Printed Chiffon Dress |
      | Faded Short Sleeve T-shirts |
    Then opens a 'product' page
    When user clicks on Add to cart button
    Then opens a popup with a success message 'Product successfully added to your shopping cart'
    When user clicks on proceed to checkout button
    Then opens a shopping cart page 'order'
    And selected 'product' is in the users cart
    And user remove all products from the cart



Feature: Create and send a message to customer service
  Scenario: Verify that user is able to get contact with us
    Given the user is on the automationpractice page
    When user press a Contact us button
    Then opens a 'contact' page
    When user choose Subject Handling as 'Customer service'
    And user enter his valid email 'jekson@gmail.com'
    And user enter message text 'I need a new metal detector, please help me!'
    And user press a send button
    Then appears a confirmation message with text 'Your message has been successfully sent to our team.'
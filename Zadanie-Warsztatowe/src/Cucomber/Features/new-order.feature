Feature: Placing new order

  Scenario: Placing a new order for Hummingbird Printed Sweater

    Given I'm on the "https://mystore-testlab.coderslab.pl" page
    When I log in using email "hhunbhpyknwhgwmqkq@tcwlx.com" and password "12345"
    And I go to the Clothes product list page
    And I see that Hummingbird Printed Sweater is 20% discounted
    Then I add 5 units of size "M" to my basket
    When I proceed to checkout
    And I confirm my address
    And I choose PrestaShop pick up in store delivery method
    And I choose Pay by Check payment method
    And I check the term of service checkbox
    And I place an order
    Then I can see "YOUR ORDER IS CONFIRMED" message
    And I go to the Order history and details page
    And I see that my order has "Awaiting check payment" status
    And I see that my order's total price is the same as on the order confirmation page
    And I close my browser
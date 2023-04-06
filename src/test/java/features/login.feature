Feature: Test Vodafone Shop
  Scenario: User select Iphone
    Given User Go To URL
    And Select Lang as English
    And Go to “Shop By Brand” section and select “Iphone”
    Then Select any of returned iphone mobiles
    And Press add to cart.
    And Press Proceed to Checkout
    Then Select “Delivery Options” as “Cairo” “Ain Shams”
    Then Select “Deliver to My Address”
    And Add address details
    And Press continue.
    Then assertion error message







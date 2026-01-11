Feature: Checkout Flow

  Scenario: User successfully checkout a product
    Given user opens the app
    When user selects backpack product
    And user adds product to cart
    And user proceeds to checkout
    And user logs in with valid credentials
    And user fills checkout information
    And user fills payment method
    Then order should be completed successfully

Feature: Product List
  #positive
  Scenario: User views the details of the product
    Given User access link web Demoblaze
    When User clicks 'Samsung galaxy s6' product
    Then User successfully views the details of the product

    #positive
  Scenario: User Add to Cart the product
    Given User access link web Demoblaze
    When User clicks 'Samsung galaxy s6' product
    And User clicks Add to Cart button
    Then User successfully Added to Cart the product

    #positive
  Scenario: User repeat Add to Cart the product
    Given User access link web Demoblaze
    When User clicks 'Samsung galaxy s6' product
    And User clicks Add to Cart button
    And User clicks OK button on alert 'Product added.'
    And User clicks Add to Cart button
    Then User successfully Added to Cart 2 products

    #positive
  Scenario: User views the products based on phones category
    Given User access link web Demoblaze
    When User clicks Phones in category list
    And Scroll down
    Then User can views all the products phones in the displayed product

    #positive
  Scenario: User views the products based on laptops category
    Given User access link web Demoblaze
    When User clicks Laptops in category list
    And Scroll down
    Then User can views all the products laptops in the displayed product

    #positive
  Scenario: User views the products based on monitors category
    Given User access link web Demoblaze
    When User clicks Monitors in category list
    And Scroll down
    Then User can views all the products monitors in the displayed product






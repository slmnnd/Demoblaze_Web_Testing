Feature: Navigation Bar
  #positive
  Scenario: User access Home Page properly
    Given User clicks Home in the navbar
    When Scroll down
    Then User successfully access Home Page and views the displayed products

    #positive
  Scenario: User is using menu Contact with valid data
    Given User access link web
    When User clicks Contact in the navbar
    And User inputs contact email with 'aishazelnut@gmail.com'
    And User inputs contact name with 'Aisha'
    And User inputs message with 'how can i buy this one?'
    And User clicks Send Message button
    Then User successfully send message in the Contact menu

    #negative
  Scenario: User is using menu Contact without @ in contact email
    Given User clicks Contact in the navbar
    When User inputs contact email with 'aishazelnut'
    And User inputs contact name with 'Aisha'
    And User inputs message with 'hehehehehe'
    And User clicks Send Message button
    Then User can't send message in the Contact menu

    #negative
  Scenario: User is using menu Contact with inputs full numbers in contact name
    Given User clicks Contact in the navbar
    When User inputs contact email with 'aishazelnut@gmail.com'
    And User inputs contact name with '123412341234'
    And User inputs message with 'hehehehehe'
    And User clicks Send Message button
    Then User can't send message in the Contact menu

    #negative
  Scenario: User is using menu Contact without inputs anything
    Given User clicks Contact in the navbar
    When User clicks Send Message button
    Then User can't send message in the Contact menu
    #negative
  Scenario: User places order without product
    Given User clicks Cart in the navbar
    When User clicks Place Order button
    And User inputs name with 'aisha'
    And User inputs country with 'indonesia'
    And User inputs city with 'jakarta'
    And User inputs credit card with '12345'
    And User inputs month with 'march'
    And User inputs year with '2024'
    And User clicks Purchase button
    Then User can't order without product

    #positive
  Scenario: User places an order one product
    Given User clicks OK button on the modal
    When User clicks 'Samsung galaxy s6' product
    And User clicks Add to Cart button
    And User clicks OK button on alert 'Product added.'
    And User clicks Cart in the navbar
    And User clicks Place Order button
    And User inputs name with 'aisha'
    And User inputs country with 'indonesia'
    And User inputs city with 'jakarta'
    And User inputs credit card with '12345'
    And User inputs month with 'march'
    And User inputs year with '2024'
    And User clicks Purchase button
    Then User successfully placed an order one product

    #positive
  Scenario: User places an order 2 products in the same various
    Given User clicks OK button on the modal
    When User clicks 'Samsung galaxy s6' product
    And User clicks Add to Cart button
    And User clicks OK button on alert 'Product added.'
    And User clicks Add to Cart button
    And User clicks OK button on alert 'Product added.'
    And User clicks Cart in the navbar
    And User clicks Place Order button
    And User inputs name with 'aisha'
    And User inputs country with 'indonesia'
    And User inputs city with 'jakarta'
    And User inputs credit card with '12345'
    And User inputs month with 'march'
    And User inputs year with '2024'
    And User clicks Purchase button
    Then User successfully placed an order 2 products

    #negative
  Scenario: User places an order without filling out the order form
    Given User clicks OK button on the modal
    When User clicks 'Samsung galaxy s6' product
    And User clicks Add to Cart button
    And User clicks OK button on alert 'Product added.'
    And User clicks Cart in the navbar
    And User clicks Place Order button
    And User clicks Purchase button
    Then User gets an error must fill out the form

    #positive
  Scenario: User places an order with filling out the order form only in the inputs name and credit card
    Given User clicks OK button on the alert
    When User inputs name with 'aisha'
    And User inputs credit card with '12345'
    And User clicks Purchase button
    Then User gets an error by being required to fill out a more complete form

    #positive
  Scenario: User places an order 3 products in the different devices
    Given User clicks OK button on the modal
    When User clicks 'Samsung galaxy s6' product
    And User clicks Add to Cart button
    And User clicks OK button on alert 'Product added.'
    And User clicks Home in the navbar
    And User clicks Laptops category
    And User clicks 'Sony vaio i5' product
    And User clicks Add to Cart button
    And User clicks OK button on alert 'Product added.'
    And User clicks Home in the navbar
    And User clicks Monitors category
    And User clicks 'ASUS Full HD' product
    And User clicks Add to Cart button
    And User clicks OK button on alert 'Product added.'
    And User clicks Cart in the navbar
    And User clicks Place Order button
    And User inputs name with 'aisha'
    And User inputs country with 'indonesia'
    And User inputs city with 'jakarta'
    And User inputs credit card with '12345'
    And User inputs month with 'march'
    And User inputs year with '2024'
    And User clicks Purchase button
    Then User successfully placed an order 3 products

    #positive
  Scenario: User log out from the account
    Given User access link web
    When User clicks Login in the navbar
    And User inputs username with 'asoy'
    And User inputs password with 'asoy'
    And User clicks Login Button
    And User clicks Log Out in the navbar
    Then User successfully log out from the account
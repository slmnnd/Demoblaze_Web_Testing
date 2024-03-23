Feature: Login
  #positive
  Scenario: User inputs valid username and password
    Given User access link web
    When User click Log In in the navbar
    And Input valid username with 'asoy'
    And Input valid password with 'asoy'
    And Click Log In button
    Then User success login with valid username and password

    #negative
  Scenario: User inputs valid username and wrong password
    Given User click Log In in the navbar
    When Input valid username with 'asoy'
    And Input password with 'asyo'
    And Click Log In button
    Then User can't Login with valid username and wrong password

    #negative
  Scenario: User inputs wrong username and valid password
    Given User click Log In in the navbar
    When Input username with 'asyo'
    And Input valid password with 'asoy'
    And Click Log In button
    Then User can't Login with wrong username and valid password

    #negative
  Scenario: User just inputs valid username
    Given User click Log In in the navbar
    When Input valid username with 'asoy'
    And Click Log In button
    Then User can't Login with just username without password

    #negative
  Scenario: User just inputs valid password
    Given User click Log In in the navbar
    When Input valid password with 'asoy'
    And Click Log In button
    Then User can't Login with just password without username

    #negative
  Scenario: User login without inputs anything
    Given User click Log In in the navbar
    When Click Log In button
    Then User can't Login without username and password
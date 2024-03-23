Feature: Sign Up
  #positive
  Scenario: User inputs username and password with combination of letters and numbers
    Given User access link web
    When User click Sign Up in the navbar
    And Input valid username with 'alo123'
    And Input valid password with 'alo123'
    And Click Sign Up button
    Then User successfully Sign Up with username and password with combination of letters and numbers

    #positive
  Scenario: User inputs username and password with full numbers input
    Given User click Sign Up in the navbar
    When Input username with '23456123'
    And Input password with '23456123'
    And Click Sign Up button
    Then User successfully Sign Up with username and password just numbers

    #negative
  Scenario: User inputs username and password with full special characters input
    Given User click Sign Up in the navbar
    When Input username with '#$%%$#'
    And Input password with '#$%%$#'
    And Click Sign Up button
    Then User can't Sign Up with username and password with special characters

    #negative
  Scenario: User just inputs password without username
    Given User click Sign Up in the navbar
    When Input password with '123qwe'
    And Click Sign Up button
    Then User gets an error alert when Sign Up without username

    #negative
  Scenario: User just inputs username without password
    Given User click Sign Up in the navbar
    When Input username with '123qwe'
    And Click Sign Up button
    Then User gets an error alert when Sign Up without password

    #negative
  Scenario: User Signs Up without username and password
    Given User click Sign Up in the navbar
    When Click Sign Up button
    Then User gets an error alert when Sign Up without username and password

    #negative
  Scenario: User signs up with an existing username
    Given User click Sign Up in the navbar
    When Input username with '#$%%$#'
    And Input password with '#$%%$#'
    And Click Sign Up button
    Then User gets an error alert when Sign Up with an existing username

    #negative
  Scenario: User inputs username and password with one letter
    Given User click Sign Up in the navbar
    When Input username with 'a'
    And Input password with 'a'
    And Click Sign Up button
    Then User can't signs up with just one letter in username and password

    #positive
  Scenario: User inputs username and password with all letters
    Given User click Sign Up in the navbar
    When Input username with 'abcdefghijklmnopqrstuvwxyz'
    And Input password with 'abcdefghijklmnopqrstuvwxyz'
    And Click Sign Up button
    Then User successfully signs up with all letters in username and password

    #negative
  Scenario: User inputs username and password with unlimited letters
    Given User click Sign Up in the navbar
    When Input username with 'abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz'
    And Input password with 'abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz'
    And Click Sign Up button
    Then User can't signs up with unlimited letters in username and password

    #negative
  Scenario: User input username and password with all numbers
    Given User click Sign Up in the navbar
    When Input username with '1234567890'
    And Input password with '1234567890'
    And Click Sign Up button
    Then User can't signs up with all numbers in username and password

    #negative
  Scenario: User inputs username and password with unlimited numbers
    Given User click Sign Up in the navbar
    When Input username with '12345678901234567890'
    And Input password with '12345678901234567890'
    And Click Sign Up button
    Then User can't signs up with unlimited numbers in username and password

Feature: Search
    As a endUser
    I want to search for a product
    so that i can view the respective products

    Scenario: Search for the product
        Given I am HomePage
        When  I am searching for a product "tv"
        Then  I should be able to see respective product

    Scenario Outline: Search for the product
        Given I am HomePage
        When  I am searching for a product "<product>"
        Then  I should be able to see respective product
        Examples:
        |product|
        |backpack|
        | puma    |
        |  nike |
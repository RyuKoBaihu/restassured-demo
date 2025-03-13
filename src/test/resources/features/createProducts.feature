@Create_Products
Feature: Create products POST

  Scenario: Creating a product
    Given that I made a POST request on products
    When I use the right body request
    Then it gives me the status code 200

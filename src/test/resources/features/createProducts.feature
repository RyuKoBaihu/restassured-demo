@Create_Products
Feature: Create products POST

  Scenario: Creating a product
    Given that I prepare a POST request for a "positive" scenario
    When I send the POST request to create a product
    Then it gives me the status code 200

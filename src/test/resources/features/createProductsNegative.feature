@Create_Products
Feature: Create products POST

  Scenario: Attempt to create a product with invalid title
    Given that I prepare a POST request for a "negative with invalid title" scenario
    When I send the POST request to create a product
    Then it gives me the status code 200

  Scenario: Attempt to create a product with invalid price
    Given that I prepare a POST request for a "negative with invalid price" scenario
    When I send the POST request to create a product
    Then it gives me the status code 200
@PostVotesRequest
Feature: Post Votes API

  Scenario: Making a POST request to the Votes API
    Given that I made a POST request on Votes
    When I use the right body request
    Then it gives me the status code 200

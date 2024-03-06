Feature: Gas Refuel Feature
  As a user, I should be able to get gas token on supported networks.

  Background:For the scenario below, user is expected to be on the Gas Module
    Given user is on the gas module
    When user clicks on get started button
    And user clicks on settings icon
    And user clicks on bridges option
    And user clicks on the checkbox
    Then user selects Connext as an option


  Scenario: User gets gas token on a different chain
    When user selects the source chain and asset
    And User selects the receiving chain
    And User enters the amount
    Then User can see Connext as an option
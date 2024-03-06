Feature: Asset Bridge Feature
  As a user, I should be able to transfer assets between different blockchains.

  Background: For the scenario below, user is expected to see all the modules
    Given user is on the landing page
    When user clicks on get started button
    And user clicks on settings button
    And user clicks on bridges option
    And user clicks on the checkbox
    Then user selects Connext as an option

  Scenario: User transfers ETH from Arbitrum One to Optimism Mainnet.
    When User selects the source chain and asset
    And User selects the receiving chain and asset
    And User enters the amount to be transferred
    Then User can see Connext Bridge as an option
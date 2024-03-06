Feature: Asset Bridge and Swap Feature
  As a user, I should be able to use Connext Bridge only on supported networks.

  Background: For the scenario below, user is expected to see all the modules
    Given user is on the landing page
    Then user clicks on get started button

  Scenario: User tries to transfer ETH from Arbitrum One and get FTM Fantom.
    When User selects the source chain and asset
    And User selects the Fantom chain and FTM
    And User enters the amount to be transferred
    Then User cannot see Connext Bridge as an option
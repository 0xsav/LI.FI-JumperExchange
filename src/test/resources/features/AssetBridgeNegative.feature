Feature: Asset Bridge Feature 2
  As a user, I should not see Connext as an option when I do not select it on settings.

  Background: For the scenario below, user is expected to see all the modules
    Given user is on the landing page
    When user clicks on get started button
    And user clicks on settings button
    And user clicks on bridges option
    Then user removes Connext from options

  Scenario: User transfers ETH from Arbitrum One to Optimism Mainnet without selecting Connext Bridge.
    When User selects the source chain and asset
    And User selects the receiving chain and asset
    And User enters the amount to be transferred
    Then User cannot see Connext Bridge as an option
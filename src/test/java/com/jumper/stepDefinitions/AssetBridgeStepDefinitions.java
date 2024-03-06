package com.jumper.stepDefinitions;

import com.jumper.pages.ExchangeModule;
import com.jumper.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class AssetBridgeStepDefinitions {

    ExchangeModule exchangeModule = new ExchangeModule();


    @When("User selects the source chain and asset")
    public void user_selects_the_source_chain_and_asset() {
        BrowserUtils.waitForVisibility(exchangeModule.selectFrom, 15);
        exchangeModule.selectFrom.click();
        exchangeModule.arbitrumOne.click();
        exchangeModule.assetEth.click();

    }

    @When("User selects the receiving chain and asset")
    public void user_selects_the_receiving_chain_and_asset() {
        exchangeModule.selectTo.click();
        exchangeModule.optimism.click();
        exchangeModule.assetEth.click();
    }

    @When("User enters the amount to be transferred")
    public void user_enters_the_amount_to_be_transferred() {
        exchangeModule.inputAmount.sendKeys("1");
    }

    @Then("User can see Connext Bridge as an option")
    public void user_can_see_connext_bridge_as_an_option() {
        BrowserUtils.waitForVisibility(exchangeModule.connextAsOption, 30);
        Assert.assertTrue(exchangeModule.connextAsOption.isDisplayed());
    }
}

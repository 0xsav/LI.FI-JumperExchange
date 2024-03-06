package com.jumper.stepDefinitions;

import com.jumper.pages.ExchangeModule;
import com.jumper.utilities.BrowserUtils;
import io.cucumber.java.en.When;

public class AssetBridgeAndSwapStepDefinitions {

    ExchangeModule exchangeModule = new ExchangeModule();

    @When("User selects the Fantom chain and FTM")
    public void user_selects_the_fantom_chain_and_ftm() {
        exchangeModule.selectTo.click();
        exchangeModule.otherNetworks.click();
        BrowserUtils.waitForVisibility(exchangeModule.fantomNetwork, 10);
        exchangeModule.fantomNetwork.click();
        BrowserUtils.waitForVisibility(exchangeModule.assetFTM, 10);
        exchangeModule.assetFTM.click();
    }

}

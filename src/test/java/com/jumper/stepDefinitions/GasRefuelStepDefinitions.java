package com.jumper.stepDefinitions;

import com.jumper.pages.ExchangeModule;
import com.jumper.pages.GasRefuelPage;
import com.jumper.utilities.BrowserUtils;
import com.jumper.utilities.ConfigurationReader;
import com.jumper.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class GasRefuelStepDefinitions {

    GasRefuelPage gasRefuelPage = new GasRefuelPage();
    ExchangeModule exchangeModule = new ExchangeModule();

    @Given("user is on the gas module")
    public void user_is_on_the_gas_module() {
        Driver.getDriver().get(ConfigurationReader.getProperty("gas.refuel.url"));
        BrowserUtils.waitForVisibility(gasRefuelPage.gasHeader, 10);
    }

    @When("user selects the source chain and asset")
    public void userSelectsTheSourceChainAndAsset() {
        gasRefuelPage.selectFrom.click();
        exchangeModule.arbitrumOne.click();
        exchangeModule.assetEth.click();
    }

    @When("User selects the receiving chain")
    public void user_selects_the_receiving_chain() {
        gasRefuelPage.selectTo.click();
        gasRefuelPage.selectChainBSC.click();
    }


    @And("User enters the amount")
    public void userEntersTheAmount() {
        gasRefuelPage.inputAmount.sendKeys("1");
    }

    @And("user clicks on settings icon")
    public void userClicksOnSettingsIcon() {
        gasRefuelPage.settings.click();

    }

    @Then("User can see Connext as an option")
    public void userCanSeeConnextAsAnOption() {
        BrowserUtils.waitForVisibility(gasRefuelPage.connextAsOption, 30);
        Assert.assertTrue(gasRefuelPage.connextAsOption.isDisplayed());
    }
}

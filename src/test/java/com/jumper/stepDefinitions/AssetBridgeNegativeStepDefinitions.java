package com.jumper.stepDefinitions;


import com.jumper.pages.ExchangeModule;
import com.jumper.pages.SettingsPage;
import com.jumper.utilities.ConfigurationReader;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class AssetBridgeNegativeStepDefinitions {

    ExchangeModule exchangeModule = new ExchangeModule();
    SettingsPage settingsPage = new SettingsPage();

    @Then("user removes Connext from options")
    public void user_removes_Connext_from_options() {
        settingsPage.connextBridge.click();
        settingsPage.backButton.click();
        settingsPage.backButton.click();
    }

    @Then("User cannot see Connext Bridge as an option")
    public void user_cannot_see_connext_bridge_as_an_option() {

        for (WebElement bridge : exchangeModule.bridges) {
            String text = bridge.getText();
            Assert.assertFalse(text.contains(ConfigurationReader.getProperty("bridge.name")));
        }
    }


}

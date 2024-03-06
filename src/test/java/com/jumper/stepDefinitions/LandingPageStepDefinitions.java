package com.jumper.stepDefinitions;

import com.jumper.pages.LandingPage;
import com.jumper.pages.SettingsPage;
import com.jumper.utilities.BrowserUtils;
import com.jumper.utilities.ConfigurationReader;
import com.jumper.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LandingPageStepDefinitions {

    LandingPage landingPage = new LandingPage();
    SettingsPage settingsPage = new SettingsPage();

    @Given("user is on the landing page")
    public void user_is_on_the_landing_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("landing.page.url"));
        BrowserUtils.waitForVisibility(landingPage.getStarted, 10);
    }

    @When("user clicks on get started button")
    public void user_clicks_on_get_started_button() {
        landingPage.getStarted.click();
    }

    @When("user clicks on settings button")
    public void user_clicks_on_settings_button() {
        settingsPage.settings.click();
        BrowserUtils.waitForVisibility(settingsPage.bridgesOption, 10);
    }

    @When("user clicks on bridges option")
    public void user_clicks_on_bridges_option() {
        settingsPage.bridgesOption.click();
    }

    @When("user clicks on the checkbox")
    public void user_clicks_on_the_checkbox() {
        settingsPage.bridgesCheckbox.click();
    }

    @Then("user selects Connext as an option")
    public void user_selects_Connext_as_an_option() {
        settingsPage.connextBridge.click();
        settingsPage.backButton.click();
        settingsPage.backButton.click();
    }


}

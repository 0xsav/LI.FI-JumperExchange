package com.jumper.pages;

import com.jumper.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SettingsPage {

    public SettingsPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//div[@class='MuiBox-root css-afg6ra']/button)[1]")
    public WebElement settings;

    @FindBy(xpath = "//p[text()='Bridges']")
    public WebElement bridgesOption;

    @FindBy(xpath = "//button[@aria-label='Deselect all']")
    public WebElement bridgesCheckbox;

    @FindBy(xpath = "//span[text()='Connext']")
    public WebElement connextBridge;

    @FindBy(xpath = "//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-edgeStart MuiIconButton-sizeMedium css-n40x50']")
    public WebElement backButton;


}

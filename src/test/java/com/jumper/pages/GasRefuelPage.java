package com.jumper.pages;

import com.jumper.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GasRefuelPage {
    public GasRefuelPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//p[text()='Gas']")
    public WebElement gasHeader;

    @FindBy(xpath = "(//button[@class='MuiBox-root css-1cn7g1k'])[3]")
    public WebElement selectFrom;

    @FindBy(xpath = "(//button[@class='MuiBox-root css-1cn7g1k'])[4]")
    public WebElement selectTo;

    @FindBy(xpath = "(//div[@role='button'])[5]")
    public WebElement selectChainBSC;

    @FindBy(xpath = "(//input[@placeholder='0'])[2]")
    public WebElement inputAmount;

    @FindBy(xpath = "(//div[@class='MuiBox-root css-afg6ra']/button)[2]")
    public WebElement settings;

    @FindBy(xpath = "//p[text()='Connext']")
    public WebElement connextAsOption;




}

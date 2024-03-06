package com.jumper.pages;

import com.jumper.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {

    public LandingPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//p[@class='MuiTypography-root MuiTypography-lifiBodyMediumStrong css-1bb7mif']")
    public WebElement getStarted;
}

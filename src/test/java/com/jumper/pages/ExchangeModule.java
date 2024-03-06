package com.jumper.pages;

import com.jumper.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ExchangeModule {

    public ExchangeModule() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//div[@class='MuiCardHeader-root css-1wl6sto'])[1]")
    public WebElement selectFrom;

    @FindBy(xpath = "(//button[@class='MuiBox-root css-1cn7g1k'])[2]")
    public WebElement selectTo;

    @FindBy(xpath = "(//input[@placeholder='0'])[1]")
    public WebElement inputAmount;

    @FindBy(xpath = "//img[@alt='arb']")
    public WebElement arbitrumOne;

    @FindBy(xpath = "//img[@alt='opt']")
    public WebElement optimism;

    @FindBy(xpath = "//img[@alt='bsc']")
    public WebElement binanceSmartChain;

    @FindBy(xpath = "//img[@alt='pol']")
    public WebElement polygonMain;

    @FindBy(xpath = "//p[@class='MuiTypography-root MuiTypography-body1 css-1yzyin9']")
    public WebElement otherNetworks;

    @FindBy(xpath = "//span[text()='Fantom']")
    public WebElement fantomNetwork;

    // assetEth can be used for Arbitrum, Optimism, Ethereum, Zksync Era, Base, Polygon ZKevm, Linea
    @FindBy(xpath = "//span[text()='ETH']")
    public WebElement assetEth;

    @FindBy(xpath = "//span[text()='FTM']")
    public WebElement assetFTM;

    @FindBy(xpath = "//p[text()='Connext via LI.FI']")
    public WebElement connextAsOption;

    @FindBy(xpath = "//span[@class='MuiBox-root css-6k93df']/div/div[2]/p")
    public List<WebElement> bridges;


}

package com.nhs.pages;

import com.nhs.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SavingsPage extends Utility {
    private static final Logger log = LogManager.getLogger(SavingsPage.class.getName());

    public SavingsPage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//input[@id='radio-yes']")
    WebElement nosavaing;
    @CacheLookup
    @FindBy(xpath = "//input[@class='button']")
    WebElement nextbuttonforsaving;


    //£16000 investment in Property
    public void clickOnSavingInvestInProperty() {
        clickOnElement(nosavaing);
        log.info("Clicking on no " + nosavaing.toString());
    }
    public void clickOnNext11() {
        clickOnElement(nextbuttonforsaving);
        log.info("Clicking on next " + nextbuttonforsaving.toString());
    }
}

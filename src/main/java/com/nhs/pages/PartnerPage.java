package com.nhs.pages;

import com.nhs.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PartnerPage extends Utility
{
    private static final Logger log = LogManager.getLogger(PartnerPage.class.getName());

    public PartnerPage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//input[@id='radio-yes']")
    WebElement partnerYes;
    @CacheLookup
    @FindBy(xpath = "//input[@id='next-button']")
    WebElement nextbuttonforpartner;

    // Do you live with Partner
    public void clickonLiveWithPartner() {
        clickOnElement(partnerYes);
        log.info("Clicking on my yes " + partnerYes.toString());
    }

    public void clickOnNextButton4() {
        clickOnElement(nextbuttonforpartner);
        log.info("Clicking on next " + nextbuttonforpartner.toString());
    }
}

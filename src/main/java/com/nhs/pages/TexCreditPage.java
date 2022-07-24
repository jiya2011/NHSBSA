package com.nhs.pages;

import com.nhs.drivermanager.ManageDriver;
import com.nhs.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TexCreditPage extends Utility {
    private static final Logger log = LogManager.getLogger(TexCreditPage.class.getName());

    public TexCreditPage() {
        PageFactory.initElements(ManageDriver.driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//input[@id='radio-no']")
    WebElement noTextCredit;
    @CacheLookup
    @FindBy(xpath = "//input[@id='next-button']")
    WebElement nextbuttonfortexcredit;

    // Do you claim for tax or benifit
    public void clickOnClaimBebefirOrTax() {
        clickOnElement(noTextCredit);
        log.info("Clicking on no " + noTextCredit.toString());
    }
    public void clickOnNextButton5() {
        clickOnElement(nextbuttonfortexcredit);
        log.info("Clicking on next " + nextbuttonfortexcredit.toString());
    }
}

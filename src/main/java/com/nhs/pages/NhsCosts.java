package com.nhs.pages;

import com.nhs.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NhsCosts extends Utility {
    private static final Logger log = LogManager.getLogger(NhsCosts.class.getName());

    public NhsCosts() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//h1[@id='result-heading']")
    WebElement verifyresult;

    //Get result
    public String VerifyResultMsg() {
        log.info("Verify Text displaye on page " + verifyresult.toString());
        return getTextFromElement(verifyresult);
    }
}

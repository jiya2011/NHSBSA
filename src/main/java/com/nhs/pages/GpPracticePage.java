package com.nhs.pages;

import com.nhs.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GpPracticePage extends Utility {
    private static final Logger log = LogManager.getLogger(GpPracticePage.class.getName());
    public GpPracticePage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//input[@id='radio-yes']")
    WebElement gpPractice;
    @CacheLookup
    @FindBy(xpath = "//input[@id='next-button']")
    WebElement nextGpPractice;

    public void clickOnGPService() {
        clickOnElement(gpPractice);
        log.info("Clicking on yes " + gpPractice.toString());
    }

    public void clickOnNextButton1() {
        clickOnElement(nextGpPractice);
        log.info("Clicking on next " + nextGpPractice.toString());
    }
}

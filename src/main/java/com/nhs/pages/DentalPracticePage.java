package com.nhs.pages;

import com.nhs.drivermanager.ManageDriver;
import com.nhs.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DentalPracticePage extends Utility {
    private static final Logger log = LogManager.getLogger(DentalPracticePage.class.getName());
    public DentalPracticePage() {
        PageFactory.initElements(ManageDriver.driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//input[@id='radio-wales']")
    WebElement walesDentalPractices;
    @CacheLookup
    @FindBy(xpath = "//input[@id='next-button']")
    WebElement nextbuttonDentalPractices;

    // Click on Dental practice
    public void clickOnDentalPractice() {
        clickOnElement(walesDentalPractices);
        log.info("Clicking on wales  " + walesDentalPractices.toString());
    }

    public void clickOnNextButton2() {
        clickOnElement(nextbuttonDentalPractices);
        log.info("Clicking on next " + nextbuttonDentalPractices.toString());
    }
}

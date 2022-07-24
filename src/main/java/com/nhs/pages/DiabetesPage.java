package com.nhs.pages;

import com.nhs.drivermanager.ManageDriver;
import com.nhs.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DiabetesPage extends Utility {
    private static final Logger log = LogManager.getLogger(DiabetesPage.class.getName());

    public DiabetesPage() {
        PageFactory.initElements(ManageDriver.driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//input[@id='radio-no']")
    WebElement nodiabetes;
    @CacheLookup
    @FindBy(xpath = "//input[@id='next-button']")
    WebElement nextbuttondiabetest;

    //Do you have Diabities
    public void clickOnDiabities() {
        clickOnElement(nodiabetes);
        log.info("Clicking on no " + nodiabetes.toString());
    }
    public void clickOnNextButton8() {
        clickOnElement(nextbuttondiabetest);
        log.info("Clicking on next " + nextbuttondiabetest.toString());
    }
}

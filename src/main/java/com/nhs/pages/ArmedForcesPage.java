package com.nhs.pages;

import com.nhs.drivermanager.ManageDriver;
import com.nhs.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ArmedForcesPage extends Utility {
    private static final Logger log = LogManager.getLogger(ArmedForcesPage.class.getName());

    public ArmedForcesPage() {
        PageFactory.initElements(ManageDriver.driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//input[@id='radio-no']")
    WebElement noArmedForce;
    @CacheLookup
    @FindBy(xpath = "//input[@id='next-button']")
    WebElement nextbuttonforarmedforce;

    //injury or illlness
    public void clickOnInjuryOrIllness() {
        clickOnElement(noArmedForce);
        log.info("Clicking on no " + noArmedForce.toString());
    }
    public void clickOnNextButton7() {
        clickOnElement(nextbuttonforarmedforce);
        log.info("Clicking on next " + nextbuttonforarmedforce.toString());
    }
}

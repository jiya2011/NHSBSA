package com.nhs.pages;

import com.nhs.drivermanager.ManageDriver;
import com.nhs.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CountryPage extends Utility {
    private static final Logger log = LogManager.getLogger(CountryPage.class.getName());

    public CountryPage() {
        PageFactory.initElements(ManageDriver.driver, this);
    }


    @CacheLookup
    @FindBy(xpath = "//input[@id='radio-wales']")
    WebElement wales;

    @CacheLookup
    @FindBy(xpath = "//input[@id='next-button']")
    WebElement countrynext;

    public void clickOnWhichCountryToLiveIn() {
        clickOnElement(wales);
        log.info("Clicking on wales" + wales.toString());
    }

    public void clickOnNextButton() {
        clickOnElement(countrynext);
        log.info("Clicking on next" + countrynext.toString());
    }

}

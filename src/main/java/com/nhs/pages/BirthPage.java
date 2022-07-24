package com.nhs.pages;

import com.nhs.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BirthPage extends Utility
{
    private static final Logger log = LogManager.getLogger(BirthPage.class.getName());

    public BirthPage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//input[@id='radio-no']")
    WebElement nopregnantci;
    @CacheLookup
    @FindBy(xpath = "//input[@id='next-button']")
    WebElement nextbuttonforbirthpage;

    //Pragnent given birth
    public void clickOnPragnentOrGivenBirth() {
        clickOnElement(nopregnantci);
        log.info("Clicking on no " + nopregnantci.toString());
    }
    public void clickOnNextButton6() {
        clickOnElement(nextbuttonforbirthpage);
        log.info("Clicking on next " + nextbuttonforbirthpage.toString());
    }
}

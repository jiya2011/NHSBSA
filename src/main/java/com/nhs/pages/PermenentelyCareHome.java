package com.nhs.pages;

import com.nhs.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PermenentelyCareHome extends Utility {
    private static final Logger log = LogManager.getLogger(PermenentelyCareHome.class.getName());

    public PermenentelyCareHome() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//input[@id='radio-no']")
    WebElement careHomePermenetely;
    @CacheLookup
    @FindBy(xpath = "//input[@id='next-button']")
    WebElement nextbuttonforPermenentelyCareHome;

    //Pragnent given birth
    public void clickOncareHomePermenetely() {
        clickOnElement(careHomePermenetely);
        log.info("Clicking on no " + careHomePermenetely.toString());
    }
    public void clickOnnextbuttonforPermenentelyCareHome() {
        clickOnElement(nextbuttonforPermenentelyCareHome);
        log.info("Clicking on next " + nextbuttonforPermenentelyCareHome.toString());
    }







}

package com.nhs.pages;

import com.nhs.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GlaucomaPage extends Utility {
    private static final Logger log = LogManager.getLogger(GlaucomaPage.class.getName());

    public GlaucomaPage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//input[@id='radio-no']")
    WebElement noglaucoma;
    @CacheLookup
    @FindBy(xpath = "//input[@id='next-button']")
    WebElement nextbuttonforglaucoma;

    //Do you have Glucoma
    public void clickOnGlucoma() {
        clickOnElement(noglaucoma);
        log.info("Clicking on no " + noglaucoma.toString());
    }
    public void clickOnNext9() {
        clickOnElement(nextbuttonforglaucoma);
        log.info("Clicking on next " + nextbuttonforglaucoma.toString());
    }

}

package com.nhs.pages;

import com.nhs.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DateOfBirthPage extends Utility {
    private static final Logger log = LogManager.getLogger(DateOfBirthPage.class.getName());
    public DateOfBirthPage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//input[@id='dob-day']")
    WebElement day;
    @CacheLookup
    @FindBy(xpath = "//input[@id='dob-month']")
    WebElement month;
    @CacheLookup
    @FindBy(xpath = "//input[@id='dob-year']")
    WebElement year;
    @CacheLookup
    @FindBy(xpath = "//input[@id='next-button']")
    WebElement nextbuttonfordateofbirth;

    // select Date of Birth
    public void setDate(String date){
        log.info("Enter date "+date+ " to date field "+date.toString());
        sendTextToElement(day,date);
    }

    public void setMonth(String monthName){
        log.info("Enter month "+monthName+ " to Month field "+month.toString());
        sendTextToElement(month,monthName);
    }

    public void setYear(String Year1){
        log.info("Enter Year "+Year1+ " to Year  field "+year.toString());
        sendTextToElement(year,Year1);
    }

    public void clickOnNextButton3() {
        clickOnElement(nextbuttonfordateofbirth);
        log.info("Clicking on next " + nextbuttonfordateofbirth.toString());
    }
}

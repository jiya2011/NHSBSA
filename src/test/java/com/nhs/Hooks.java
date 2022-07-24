package com.nhs;

import com.cucumber.listener.Reporter;
import com.nhs.drivermanager.ManageDriver;
import com.nhs.propertyreader.PropertyReader;
import com.nhs.utility.Utility;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

import java.io.IOException;


/**
 * Created by Saurabh
 */
public class Hooks extends Utility {
@Before  // select cucumber api jave
    public void setup(){
    selectBrowser(PropertyReader.getInstance().getProperty("browser"));
}
@After  // select cucumber api jave
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            String screenShotPath = Utility.getScreenshot(ManageDriver.driver, scenario.getName().replace(" ", "_"));
            try {
                Reporter.addScreenCaptureFromPath(screenShotPath);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        closeBrowser();
    }
}

package com.cydeo.step_definitions;

// In this class we will be able to pass post and pre conditions to each scenario and each step.

import com.cydeo.utilites.BrowserUtils;
import com.cydeo.utilites.Driver;
import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    // import from io.cucumber.java not from junit

    @After
    public void teardownScenario(Scenario scenario){

        if (scenario.isFailed()){ // If scenario fails, take me the screenshot.
            byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot,"image/png",scenario.getName());
        }

        //BrowserUtils.sleep(5);
        Driver.closeDriver();

        //System.out.println("Closing browser using cucumber @After");
        //System.out.println("Scenario ended. Take screenshot if failed!");
    }




}
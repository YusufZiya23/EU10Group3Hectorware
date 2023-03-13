package com.cydeo.step_definitions;

// In this class we will be able to pass post and pre conditions to each scenario and each step.

import com.cydeo.utilites.BrowserUtils;
import com.cydeo.utilites.Driver;
import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    // import from io.cucumber.java not from junit
    @Before (order = 0) // order = 0 means it will be running first
    public void setupScenario(){
        System.out.println("Setting up browser using cucumber @Before");
    }

    @Before (value = "@login", order = 1) // order = 1 means it will be running second. Assigning order is optional
    public void setupScenarioForLogin(){
        System.out.println("This will only apply to scenarios with @login tag");
    }

    @Before (value = "@db",order = -1) // You can give negative number too, which means it will run before everything.
    public void setupScenarioForDatabase(){
        System.out.println("This will only apply to scenarios with @db tag");
    }

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

    @BeforeStep
    public void setupStep(){
        System.out.println("Applying setup using @BeforeStep");
    }

    @AfterStep
    public void afterStep(){
        System.out.println("Applying teardown using @AfterStep");
    }


}
package com.cydeo.step_definitions;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

/*
we will be able to create "pre" and "post" conditions for all SCENARIOS and even STEPS.
 */
public class Hooks {
    // import @Before from io.cucumber.java
    @Before(order = 1)

    public void setupMethod() {
        System.out.println("---> @Before: RUNNING BEFORE EACH SCENARIO");
    }

    /* @Before(value = "@login", order = 2)
     public void login_scenario_before(){
       System.out.println("---> @Before: Running before each Scenario login!");
    }*/
    @After
    public void teardownMethod(Scenario scenario) {

        if (scenario.isFailed()) {
            byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());
        }
        System.out.println("---> @After: RUNNING AFTER EACH SCENARIO");
        Driver.closeDriver();
    }
   /* @BeforeStep
    public void setupStep(){

        System.out.println("---> @BeforeStep: Running before each step!");

    }
    @AfterStep
    public void tearDownStep(){
        System.out.println("---> @AfterStep: Running after each step!");
    }*/


}


package com.cydeo.step_definitions;

import com.cydeo.pages.R_VytrackDashboardPage;
import com.cydeo.pages.R_VytrackLoginPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.checkerframework.checker.units.qual.C;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Map;

public class R_VytrackLogin_StepDefinitions {


    R_VytrackDashboardPage rVytrackDashboardPage = new R_VytrackDashboardPage();

    R_VytrackLoginPage vytrackLoginPage = new R_VytrackLoginPage();

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {

        Driver.getDriver().get(ConfigurationReader.getProperty("vyTrackUrl"));
    }

    @When("user enters the driver information")
    public void user_enters_the_driver_information() {

        vytrackLoginPage.login(ConfigurationReader.getProperty("driver_username"), ConfigurationReader.getProperty("driver_password"));

    }

    @Then("user should be able to login")
    public void user_should_be_able_to_login() {

        //BrowserUtils.sleep(3);

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(20));
        wait.until(ExpectedConditions.invisibilityOf(vytrackLoginPage.loadingBar));

        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = "Dashboard";


        Assert.assertEquals("Title verification failed!", expectedTitle, actualTitle);

    }

    @When("user enters the sales manager information")
    public void userEntersTheSalesManagerInformation() {
        vytrackLoginPage.login(ConfigurationReader.getProperty("sales_manager_username"), ConfigurationReader.getProperty("sales_manager_password"));


    }

    @When("user enters the store manager information")
    public void userEntersTheStoreManagerInformation() {
        vytrackLoginPage.login(ConfigurationReader.getProperty("store_manager_username"), ConfigurationReader.getProperty("store_manager_password"));
    }

    @When("user enters the {string} information")
    public void userEntersTheInformation(String userType) {
        vytrackLoginPage.loginDynamic(userType);
    }

    @When("the user login with {string},{string}")
    public void theUserLoginWith(String userName, String password) {

        vytrackLoginPage.login(userName,password);
    }

    @Then("the user should not be able to log in")
    public void theUserShouldNotBeAbleToLogIn() {

        BrowserUtils.verifyTitle("Login");
    }
    @When("user enters below credentials")
    public void user_enters_below_credentials(Map<String,String> credentials) {
        String username = credentials.get("username");
        String password = credentials.get("password");
        vytrackLoginPage.login(username,password);


    }
    @Then("user should be able to see following information")
    public void user_should_be_able_to_see_following_information(Map<String,String> userInfo) {

        String actualUserInfo = rVytrackDashboardPage.userinfo.getText();
        String expectedUserInfo = userInfo.get("firstname") + " " + userInfo.get("lastname");

        Assert.assertEquals(expectedUserInfo,actualUserInfo);

    }


}

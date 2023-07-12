package com.cydeo.step_definitions;


import com.cydeo.pages.WebTablesLoginPage;
import com.cydeo.pages.WebTablesOrderPage;
import com.cydeo.pages.WebTables_ViewAllOrdersPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import com.google.common.collect.Maps;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.eo.Se;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Map;

public class WebTables_StepDefinitions {
    WebTablesLoginPage webTablesLoginPage = new WebTablesLoginPage();

    WebTablesOrderPage webTablesOrderPage = new WebTablesOrderPage();
    @Given("user is on Cydeo Web Tables login page")
    public void user_is_on_cydeo_web_tables_login_page() {

        Driver.getDriver().get("https://web-table-2.cydeo.com/login");

    }
    @When("user enters valid username")
    public void user_enters_valid_username() {
        webTablesLoginPage.userNameBox.sendKeys("Test");



    }
    @When("user enters valid password")
    public void user_enters_valid_password() {
        webTablesLoginPage.passwordBox.sendKeys("Tester");

    }
    @When("user clicks Login button")
    public void user_clicks_login_button() {
        webTablesLoginPage.loginButton.click();

    }
    @Then("user should see that URL ends with the word “orders”")
    public void user_should_see_that_url_ends_with_the_word_orders() {

        String actualURL = Driver.getDriver().getCurrentUrl();

        Assert.assertTrue(actualURL.endsWith("orders"));

    }


    @When("user enters {string} username and {string} password")
    public void userEntersUsernameAndPassword(String userName, String password) {

        webTablesLoginPage.userNameBox.sendKeys(userName);
        webTablesLoginPage.passwordBox.sendKeys(password);
    }

    @When("user enters below correct credentials")
    public void userEntersBelowCorrectCredentials(Map<String,String> credentialsTable) {

        webTablesLoginPage.userNameBox.sendKeys(credentialsTable.get("userName"));
        webTablesLoginPage.passwordBox.sendKeys(credentialsTable.get("password"));



    }
    @Given("user is already logged in to The Web table app")
    public void user_is_already_logged_in_to_the_web_table_app() {

        Driver.getDriver().get("https://web-table-2.cydeo.com/login");
        webTablesLoginPage.login();

    }
    @When("user is on the Order page")
    public void user_is_on_the_order_page() {

        webTablesOrderPage.ordersLink.click();

    }
    @Then("user sees below options under “product” dropdown")
    public void user_sees_below_options_under_product_dropdown(List<String> expectedOptions) {

        List<String> actualOptions = BrowserUtils.dropDownOptions_as_String(webTablesOrderPage.productDropDown);

        Assert.assertTrue(actualOptions.equals(expectedOptions));


    }

    @Then("user sees Visa as enabled option")
    public void userSeesVisaAsEnabledOption() {

        Assert.assertTrue(webTablesOrderPage.visaRadioButtons.isEnabled());
    }

    @Then("user sees MasterCard as enabled option")
    public void userSeesMasterCardAsEnabledOption() {
        Assert.assertTrue(webTablesOrderPage.masterCardRadioButtons.isEnabled());

    }

    @Then("user sees American Express as enabled option")
    public void userSeesAmericanExpressAsEnabledOption() {
        Assert.assertTrue(webTablesOrderPage.americanExpressRadioButtons.isEnabled());
    }

    @Then("user enters quantity {string}")
    public void userEntersQuantity(String arg0) {
        webTablesOrderPage.quantityInput.clear();
        webTablesOrderPage.quantityInput.sendKeys(arg0);
    }

    @Then("user enters customer name {string}")
    public void userEntersCustomerName(String arg0) {
        webTablesOrderPage.cutomerFullNameInput.sendKeys(arg0);

    }

    @Then("user enters street {string}")
    public void userEntersStreet(String arg0) {
        webTablesOrderPage.streetInput.sendKeys(arg0);
    }

    @Then("user enters city {string}")
    public void userEntersCity(String arg0) {
        webTablesOrderPage.cityInput.sendKeys(arg0);
    }

    @Then("user enters state {string}")
    public void userEntersState(String arg0) {
        webTablesOrderPage.stateInput.sendKeys(arg0);
    }

    @Then("user enters zip {string}")
    public void userEntersZip(String arg0) {
        webTablesOrderPage.zipInput.sendKeys(arg0);
    }

    @Then("user selects payment option {string}")
    public void userSelectsPaymentOption(String arg0) {
        BrowserUtils.clickRadioButton(webTablesOrderPage.cardTypes,arg0);

    }

    @Then("user credit card number {string}")
    public void userCreditCardNumber(String arg0) {
        webTablesOrderPage.creditCardInput.sendKeys(arg0);
    }

    @Then("user enters expiration date {string}")
    public void userEntersExpirationDate(String arg0) {
        webTablesOrderPage.expirationInput.sendKeys(arg0);
    }

    @Then("user clicks to process order button")
    public void userClicksToProcessOrderButton() {
        webTablesOrderPage.processButton.click();
    }

    WebTables_ViewAllOrdersPage webTablesViewAllOrdersPage = new WebTables_ViewAllOrdersPage();

    @Then("user should see {string} in the first row of web table")
    public void userShouldSeeInTheFirstRowOfWebTable(String arg0) {
        String actualName = webTablesViewAllOrdersPage.newCustomerCell.getText();

        Assert.assertEquals(arg0,actualName);
    }

    @Then("user clicks calculate button")
    public void userClicksCalculateButton() {
        webTablesOrderPage.calculateButton.click();
    }
}

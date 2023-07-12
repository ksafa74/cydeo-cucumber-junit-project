package com.cydeo.step_definitions;

import com.cydeo.pages.DropDownPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import com.google.common.base.Strings;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class DataTablesStepDefinitions {



    DropDownPage dropDownPage = new DropDownPage();




    @Then("user should see below list")
    public void user_should_see_below_list(List<String> fruitsAndVegetables) {

        System.out.println("fruitsAndVegetables = " + fruitsAndVegetables);

        fruitsAndVegetables.get(1);

    }@Then("I will share my favorite")
    public void i_will_share_my_favorite(List<String> pets) {

        System.out.println("pets = " + pets);

    }
    @Then("officer is able to see any data he wants")
    public void officer_is_able_to_see_any_data_he_wants(Map<String,String> driverInfo ) {

        System.out.println("driverInfo = " + driverInfo);

        System.out.println("driverInfo.get(\"name\") = " + driverInfo.get("name"));
        System.out.println("driverInfo.get(\"surname\") = " + driverInfo.get("surname"));
        System.out.println("driverInfo.get(\"age\") = " + driverInfo.get("age"));
        System.out.println("driverInfo.get(\"state\") = " + driverInfo.get("state"));

    }


    @Given("User is on the dropdowns page of practice tool")
    public void userIsOnTheDropdownsPageOfPracticeTool() {

        Driver.getDriver().get("https://practice.cydeo.com/dropdown");


    }

    @Then("User should see below info in month dropdown")
    public void userShouldSeeBelowInfoInMonthDropdown(List<String> expectedMonths) {

        Assert.assertEquals(expectedMonths, BrowserUtils.dropDownOptions_as_String(dropDownPage.monthDropDown));

    }


}

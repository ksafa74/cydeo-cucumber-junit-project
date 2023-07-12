package com.cydeo.step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Library_StepDefinitions {

    @Given("user is on the login page of the application")
    public void user_is_on_the_login_page_of_the_application() {
        System.out.println("user is on the login page of the application.");
    }
    @When("user enters librarian username")
    public void user_enters_librarian_username() {
        System.out.println("user enters librarian username.");
    }
    @When("user enters librarian password")
    public void user_enters_librarian_password() {
        System.out.println("user enters librarian password.");
    }
    @Then("user should see the dashboard")
    public void user_should_see_the_dashboard() {
        System.out.println("user sees the dashboard.");
    }
    @When("user enters student username")
    public void userEntersStudentUsername() {
        System.out.println("user enters student username");
    }
    @And("user enters student password")
    public void userEntersStudentPassword() {
        System.out.println("user enters student password");
    }
    @When("user enters admin username")
    public void userEntersAdminUsername() {

        System.out.println("user enters admin username.");

    }
    @And("user enters admin password")
    public void userEntersAdminPassword() {
        System.out.println("user enters admin password");
    }
}

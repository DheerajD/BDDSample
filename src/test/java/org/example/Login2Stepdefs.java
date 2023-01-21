package org.example;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login2Stepdefs {
    LoginDemo loginDemo;
    public Login2Stepdefs() {
        loginDemo = new LoginDemo();
    }

    @Then("^login is unsuccessful$")
    public void loginIsUnsuccessful() {
    }

    @But("^user is not blocked$")
    public void userIsNotBlocked() {
    }


    @And("^user is blocked$")
    public void userIsBlocked() {
    }

    @When("^user enters valid credentials \"([^\"]*)\" and \"([^\"]*)\"$")
    public void userEntersValidCredentialsAnd(String arg0, String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^user enters invalid credentials \"([^\"]*)\" and \"([^\"]*)\"$")
    public void userEntersInvalidCredentialsAnd(String arg0, String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^blocked user enters invalid credentials$")
    public void blockedUserEntersInvalidCredentials() {
    }
}

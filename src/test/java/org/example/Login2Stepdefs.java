package org.example;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class Login2Stepdefs {
    LoginDemo loginDemo;
    boolean result;
    public Login2Stepdefs() {
        loginDemo = new LoginDemo();
    }

    @Then("^login func is unsuccessful$")
    public void loginIsUnsuccessful() {
        Assert.assertFalse(result);
    }

    @Then("^login func is successful$")
    public void loginIsSuccessful() {
        Assert.assertTrue(result);
    }

    @But("^user is not blocked$")
    public void userIsNotBlocked() {
        Assert.assertFalse(loginDemo.isBlockedUser());
    }


    @And("^user is blocked$")
    public void userIsBlocked() {
        Assert.assertTrue(loginDemo.isBlockedUser());
    }


    @When("^user enters credentials \"([^\"]*)\" and \"([^\"]*)\"$")
    public void userEntersCredentialsAnd(String arg0, String arg1) throws Throwable {
        result = loginDemo.login(arg0, arg1);
    }
}

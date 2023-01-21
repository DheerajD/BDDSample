package org.example;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.LoginDemo;
import org.junit.Assert;

public class LoginStepdefs {
    LoginDemo loginDemo;
    boolean result;
    @Given("^Login page$")
    public void loginPage() {
        loginDemo = new LoginDemo();
    }

    @When("^user provides uname \"([^\"]*)\" and pwd \"([^\"]*)\"$")
    public void userProvidesUnameAndPwd(String arg0, String arg1) throws Throwable {
        result = loginDemo.login(arg0, arg1);
    }

    @Then("^login is successful$")
    public void loginIsSuccessful() {
        Assert.assertTrue(result);
    }
}

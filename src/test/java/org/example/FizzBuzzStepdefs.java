package org.example;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class FizzBuzzStepdefs {
    FizzBuzzDemo fizzBuzzDemo;
    String result;

    @Given("^Create a FizzBuzz game play$")
    public void createAFizzBuzzGamePlay() {
        fizzBuzzDemo = new FizzBuzzDemo();
    }

    @When("^input number is (\\d+)$")
    public void inputNumberIs(int arg0) {
        result = fizzBuzzDemo.play(arg0);
    }

    @Then("^Result is \"([^\"]*)\"$")
    public void resultIs(String arg0) throws Throwable {
        Assert.assertEquals(arg0, result);
    }
}

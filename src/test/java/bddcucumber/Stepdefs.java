package bddcucumber;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.*;

class IsItFriday {
    static String isItFriday(String today) {
        return "Friday".equalsIgnoreCase(today) ? "Yes" : "Nope";
    }
}

public class Stepdefs {
    private String today;
    private String actualAnswer;
    private int year;

    @Given("this year is {int}")
    public void this_year_is(Integer year) {
        this.year = year;
    }

    @Given("today is {string}")
    public void today_is_(String day) {
        this.today = day;
    }

    @When("I ask if it is Friday yet")
    public void i_ask_if_it_is_Friday_yet() {
        this.actualAnswer = IsItFriday.isItFriday(this.today);
    }

    @Then("I should be answered {string}")
    public void i_should_be_answered(String expectedAnswer) {
        assertEquals(expectedAnswer, actualAnswer);
    }
}

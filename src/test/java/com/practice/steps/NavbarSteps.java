package com.practice.steps;

import com.practice.pages.NavbarPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NavbarSteps {

    private final NavbarPage navbarPage = new NavbarPage();

    @Given("the user is on the sub page")
    public void theUserIsOnTheSubPage(){
        navbarPage.navigateToSubPage();
    }


    @When("^the user clicks on the \"HOME LINK\"$")
    public void theUserClicksOnTheHomeLink(){
        navbarPage.clickOnHomeLink();
    }

    @Then("^the user is redirected to \"HOME PAGE\"$")
    public void theUserIsRedirectedToHomePage(){
        navbarPage.verifyHomeTitle();
    }
}

package com.nopcommerce.demo.cucumber.steps;

import com.nopcommerce.demo.cucumber.pages.HomePage;
import com.nopcommerce.demo.cucumber.pages.LoginPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;


public class LoginSteps {
    @Given("^I am on homepage$")
    public void iAmOnHomepage() {
    }

    @When("^I click on login link$")
    public void iClickOnLoginLink() {
        new HomePage().clickOnLoginLink();

    }

    @Then("^I should navigate to login page successfully$")
    public void iShouldNavigateToLoginPageSuccessfully() {
        String expectedMessage = "Welcome, Please Sign In!";
        String actualMessage = new LoginPage().getWelcomeText();
        Assert.assertEquals("Login page not displayed", expectedMessage, actualMessage);

    }

    @And("^I enter email \"([^\"]*)\"$")
    public void iEnterEmail(String email) {
        new LoginPage().enterEmailId(email);
    }

    @And("^I enter password \"([^\"]*)\"$")
    public void iEnterPassword(String password) {
        new LoginPage().enterPassword(password);
    }

    @And("^I click on Login button$")
    public void iClickOnLoginButton() {
        new LoginPage().clickOnLoginButton();
    }

    @Then("^I should login successfully$")
    public void iShouldLoginSuccessfully() {
        Assert.assertTrue("Logout Link is not displayed",new HomePage().isLogOutLinkDisplay());
    }

    @Then("^I should see the error message \"([^\"]*)\"$")
    public void iShouldSeeTheErrorMessage(String errorMessage1) {
        Assert.assertEquals("Error message not displayed" , errorMessage1, new LoginPage().getErrorMessage());
    }

    @And("^I click on logout button$")
    public void iClickOnLogoutButton() {
        new LoginPage().clickOnLogoutButton();
    }

    @Then("^I should logout successfully$")
    public void iShouldLogoutSuccessfully() {
    }
}

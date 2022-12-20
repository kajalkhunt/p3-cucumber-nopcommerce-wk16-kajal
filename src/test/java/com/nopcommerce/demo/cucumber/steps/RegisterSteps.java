package com.nopcommerce.demo.cucumber.steps;

import com.nopcommerce.demo.cucumber.pages.HomePage;
import com.nopcommerce.demo.cucumber.pages.RegisterPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class RegisterSteps {
//        @Given("^I am on homepage$")
//    public void iAmOnHomepage() {
//
//    }
    @When("^I click on register link$")
    public void iClickOnRegisterLink() throws InterruptedException {
        new HomePage().clickOnRegisterLink();
        Thread.sleep(5000);

    }

    @And("^I enter First Name\"([^\"]*)\"$")
    public void iEnterFirstName(String firstName)  {
        new RegisterPage().enterFirstName(firstName);


    }

    @And("^I enter Last Name\"([^\"]*)\"$")
    public void iEnterLastName(String lastName) {
        new RegisterPage().enterLastName(lastName);
    }

//    @And("^I enter First Name$")
//    public void iEnterFirstName(String firstName) {
//        new RegisterPage().enterFirstName(firstName);
//    }


//    @And("^I enter Last Name$")
//    public void iEnterLastName(String lastName) {
//        new RegisterPage().enterLastName(lastName);
//    }

    @And("^I select Date of Birth \"([^\"]*)\"$")
    public void iSelectDateOfBirth(String dateOfBirth)  {
        new RegisterPage().selectDateOfBirth(dateOfBirth);

    }

    @And("^I select Birth month \"([^\"]*)\"$")
    public void iSelectBirthMonth(String birthMonth){
        new RegisterPage().selectBirthMonth(birthMonth);
    }

    @And("^I select Birth year \"([^\"]*)\"$")
    public void iSelectBirthYear(String birthYear) {
        new RegisterPage().selectBirthYear(birthYear);
    }

    @And("^I enter email\"([^\"]*)\"$")
    public void iEnterEmail(String email) {
        new RegisterPage().enterEmail(email);

    }

    @And("^I enter Password \"([^\"]*)\"$")
    public void iEnterPassword(String password) {
        new RegisterPage().enterPassword(password);
    }

    @And("^I confirm Password \"([^\"]*)\"$")
    public void iConfirmPassword(String confirmPassword)  {
        new RegisterPage().enterConfirmPassword(confirmPassword);

    }

    @Then("^Registered Successfully$")
    public void registeredSuccessfully() {
        new RegisterPage().getRegisterText();
    }


    @Then("^registration successful$")
    public void registrationSuccessful() {


    }
    @And("^I click on register button$")
    public void iClickOnRegisterButton() {
        new RegisterPage().clickOnRegisterButton();
    }
    @Then("^I should navigate to register page successfully$")
    public void iShouldNavigateToRegisterPageSuccessfully() {
            new HomePage().clickOnRegisterLink();

    }

    @And("^I select gender\"([^\"]*)\"$")
    public void iSelectGender(String gender) {
        new RegisterPage().selectGender(gender);

    }

    @Then("^I verify first msg error msg$")
    public void iVerifyFirstMsgErrorMsg() {
        Assert.assertEquals("FirstName field error message not displayed", "First name is required.", new RegisterPage().getValidationErrorMessageForField("FirstName"));
    }

    @Then("^I verify last name msg error message$")
    public void iVerifyLastNameMsgErrorMessage() {
        Assert.assertEquals("LastName field error message not displayed", "Last name is required.", new RegisterPage().getValidationErrorMessageForField("LastName"));

    }

    @Then("^I Verify the email error message$")
    public void iVerifyTheEmailErrorMessage() {
        Assert.assertEquals("Email field error message not displayed", "Email is required.", new RegisterPage().getValidationErrorMessageForField("Email"));

    }

    @Then("^I Verify the password error message$")
    public void iVerifyThePasswordErrorMessage() {
        Assert.assertEquals("Password field error message not displayed", "Password is required.", new RegisterPage().getValidationErrorMessageForField("Password"));

    }

    @Then("^I Verify the confirm password error message$")
    public void iVerifyTheConfirmPasswordErrorMessage() {
        Assert.assertEquals("Confirm Password field error message not displayed", "Confirm Password is required.", new RegisterPage().getValidationErrorMessageForField("Confirm Password"));

    }
}

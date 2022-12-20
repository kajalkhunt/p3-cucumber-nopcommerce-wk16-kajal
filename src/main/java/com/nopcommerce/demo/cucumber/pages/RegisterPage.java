package com.nopcommerce.demo.cucumber.pages;

import com.nopcommerce.demo.cucumber.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;


public class RegisterPage extends Utility {

    private static final Logger log = LogManager.getLogger(RegisterPage.class.getName());

    public RegisterPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(css = "div[class='page-title'] h1")
    WebElement registerText;

    @CacheLookup
    @FindBy(xpath = "//div[@id='gender']//label")
    List<WebElement> genderRadios;

    @CacheLookup
//    @FindBy(id = "FirstName")
    @FindBy(xpath = "//input[@id='FirstName']")
    WebElement firstNameField;

    @CacheLookup
//    @FindBy(id = "LastName")
   @FindBy(xpath = "//input[@id='LastName']")
    WebElement lastNameField;

    @CacheLookup
    @FindBy(name = "DateOfBirthDay")
    WebElement dateOfBirthDay;

    @CacheLookup
    @FindBy(name = "DateOfBirthMonth")
    WebElement dateOfBirthMonth;

    @CacheLookup
    @FindBy(name = "DateOfBirthYear")
    WebElement dateOfBirthYear;

    @CacheLookup
    @FindBy(name = "Email")
    WebElement emailField;

    @CacheLookup
    @FindBy(id = "Password")
    WebElement passwordField;

    @CacheLookup
    @FindBy(id = "ConfirmPassword")
    WebElement confirmPasswordField;

    @CacheLookup
    @FindBy(css = "#register-button")
    WebElement registerBtn;

    @CacheLookup
    @FindBy(className = "field-validation-error")
    List<WebElement> fieldValidationErrors;

    @CacheLookup
    @FindBy(css = ".result")
    WebElement yourRegCompletedText;

    @CacheLookup
    @FindBy(css = ".button-1.register-continue-button")
    WebElement continueBtn;


    public String getRegisterText() {
        String message = getTextFromElement(registerText);
        log.info("Get Register Text : " + registerText);
        return message;
    }

    public void selectGender(String gender) {
        for (WebElement radio : genderRadios) {
            if (radio.getText().contains(gender)) {
                clickOnElement(radio);
                log.info("Select Gender :" + genderRadios.toString());
                break;
            }
        }
    }

    public void enterFirstName(String firstName) {
        sendTextToElement(firstNameField, firstName);
        log.info("Enter First Name : " + firstNameField.toString());

    }

    public void enterLastName(String lastName) {
        sendTextToElement(lastNameField, lastName);
        log.info(" Enter Last Name : " + lastNameField.toString());

    }
    public void selectDateOfBirth(String day) {
        selectByVisibleTextFromDropDown(dateOfBirthDay, day);
        log.info("Select Date Of Birth : " + dateOfBirthDay.toString());
    }

    public void selectBirthMonth(String month) {
        selectByVisibleTextFromDropDown(dateOfBirthMonth, month);
        log.info("select Birth Month : " + dateOfBirthMonth.toString());
    }

    public void selectBirthYear(String year) {
        selectByVisibleTextFromDropDown(dateOfBirthYear, year);
        log.info("select Birth Year : " + dateOfBirthYear.toString());
    }

    public void enterEmail(String email) {
        sendTextToElement(emailField, email);
        log.info(" Enter Email :" + emailField);

    }

    public void enterPassword(String password) {
        sendTextToElement(passwordField, password);
        log.info(" Enter Password :" + passwordField);
    }

    public void enterConfirmPassword(String confPassword) {
        sendTextToElement(confirmPasswordField, confPassword);
        log.info("Enter Confirmation Password :" + confirmPasswordField);
    }

    public void clickOnRegisterButton() {
        clickOnElement(registerBtn);
        log.info(" Click on Register Button :" + registerBtn);
    }

    public String getValidationErrorMessageForField(String fieldName) {
        String validationMessage = null;
        for (WebElement message : fieldValidationErrors) {
            if (message.getAttribute("data-valmsg-for").equals(fieldName)) {
                validationMessage = message.getText();
                log.info("Get Valid Error Msg : " + fieldValidationErrors.toString());
                break;
            }
        }
        return validationMessage;
    }

    public String getYourRegCompletedText() {
        String message = getTextFromElement(yourRegCompletedText);
        log.info("Get your Reg Text :" + yourRegCompletedText.toString());
        return message;
    }

    public void clickOnContinueButton() {
        clickOnElement(continueBtn);
        log.info("Click onContinue Button :" + continueBtn.toString());
    }

}

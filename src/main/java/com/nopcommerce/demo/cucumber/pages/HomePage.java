package com.nopcommerce.demo.cucumber.pages;

import com.nopcommerce.demo.cucumber.drivermanager.ManageDriver;
import com.nopcommerce.demo.cucumber.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;


public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());
    public HomePage() {
        PageFactory.initElements(ManageDriver.driver, this);
    }

    @CacheLookup
    @FindBy(linkText = "Log in")
    WebElement loginLink;

    @CacheLookup
//    @FindBy(xpath = "//a[contains(text(),'Register')]")
//    @FindBy(xpath = "//a[@class='ico-register']")
    @FindBy(linkText = "Register")
    WebElement registerLink;

    @CacheLookup
    @FindBy(xpath = "//img[@alt='nopCommerce demo store']")
    WebElement logo;

    @CacheLookup
    @FindBy(xpath = "//a[@class='ico-account']")
    WebElement myAccountLink;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Log out']")
    WebElement logOutLink;

    @CacheLookup
    @FindBy(xpath = "//div[@class='header-menu']/child::ul[1]/li/a")
    List<WebElement> topMenuList;


    public void clickOnLoginLink() {
        clickOnElement(loginLink);
        log.info("Click on Login Link: "+ loginLink.toString());
    }

    public boolean isLogInLinkDisplay() {
        boolean b = loginLink.isDisplayed();
        log.info("Is Log in Link Displayed: "+ loginLink.toString());
        return b;
    }

    public void clickOnRegisterLink() {
        clickOnElement(registerLink);
        log.info("Click on Register Link:"+ registerLink.toString());
    }

    public void clickOnMyAccountLink() {
        clickOnElement(myAccountLink);
        log.info("Click on MyAccount :"+ myAccountLink.toString());
    }

    public HomePage clickOnLogOutLink() {
        clickOnElement(logOutLink);
        log.info("Click on Log out Link:"+ logOutLink.toString());
        return new HomePage();
    }

    public boolean isLogOutLinkDisplay() {
        boolean b = logOutLink.isDisplayed();
        log.info("Is Logout Displayed:"+ logOutLink.toString());
        return b;
    }

    public boolean isLogoDisplayed() {
        boolean b = logo.isDisplayed();
        log.info("Is Logo Displayed:"+ logo.toString());
        return b;
    }

    public void clickOnMenuTab(String tab) {
        for (WebElement menu : topMenuList) {
            if (menu.getText().contains(tab)) {
                clickOnElement(menu);
                log.info("Click on Menu Tab:"+ topMenuList.toString());
                break;
            }
        }
    }

}

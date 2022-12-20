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


public class DesktopsPage extends Utility {

    private static final Logger log = LogManager.getLogger(DesktopsPage.class.getName());

    public DesktopsPage() {
        PageFactory.initElements(ManageDriver.driver, this);
    }

    @CacheLookup
    @FindBy(css = "div[class='page-title'] h1")
    WebElement pageTitle;

    @CacheLookup
    @FindBy(id = "products-orderby")
    WebElement sortBy;

    @CacheLookup
    @FindBy(id = "products-pagesize")
    WebElement display;

    @CacheLookup
    @FindBy(xpath = "//div[@class='products-container']//h2/a")
    List<WebElement> productTitleList;


    public String getPageTitleText() {
        String message = getTextFromElement(pageTitle);
        log.info(" Get Page title text :"+ pageTitle.toString());
        return message;
    }

    public void selectSortBy(String position) {
        selectByVisibleTextFromDropDown(sortBy, position);
        log.info("Select Sort by : "+ sortBy.toString());

    }

    public void selectDisplayPerPage(String number) {
        selectByVisibleTextFromDropDown(display, number);
        log.info(" Select Display PerPage :" +display.toString());

    }

    public void selectProduct(String productName) {
        for (WebElement product : productTitleList) {
            if (product.getText().equals(productName)) {
                clickOnElement(product);
                log.info("Select Product :"+ productTitleList.toString());
                break;
            }
        }
    }

}
